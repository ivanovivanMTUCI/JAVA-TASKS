package Lab_3;

import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler extends Thread
{
    //declaring a URL pattern
    private final static String PATTERN = "href=\"http://.+?\"";

    private static URLPool urlContainer;
    private static int m_maxDepth = 1;

    //constructor
    public Crawler(URLPool container, int maxDepth)
    {
        urlContainer = container;
        m_maxDepth = maxDepth;
    }

    @Override
    public void run()
    {
        while (true)
        {
            //begin to scan another URL
            URLDepthPair urlInfo = urlContainer.getRawUrl();
            scanUrl(urlInfo);
            urlContainer.setVisitedUrl(urlInfo);
        }
    }

    //method to scan URLs and determine if they are valid
    public static void scanUrl(URLDepthPair url)
    {
        try
        {
            //getting the domain name
            String ipStr = InetAddress.getByName(url.getDomain()).toString();
            ipStr = ipStr.split("/")[1];
            //executing a connection to the site
            Socket socket = new Socket(ipStr, 80);
            socket.setSoTimeout(3000);

            //write into the web socket
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            //making a HTTP GET-request
            pw.println("GET " + url.getPath() + " HTTP/1.1");
            //Host header for the request
            pw.println("Host: " + url.getDomain());
            pw.println("");
            //sending the request
            pw.flush();

            //reading from the web socket
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String buffer = br.readLine();
            if (buffer.contains("200"))
            {
                //go through the sites code to find another URL
                for (buffer = br.readLine(); buffer != null && !buffer.equals("</html>"); buffer = br.readLine())
                {
                    //objects to check validity of the address
                    Pattern pattern = Pattern.compile(PATTERN);
                    Matcher matcher = pattern.matcher(buffer);
                    //if another address was found
                    while (matcher.find())
                    {
                        String htmlUrl = buffer.substring(matcher.start(), matcher.end());
                        int depth = url.getDepth();
                        //make a URL-depth pair
                        URLDepthPair urlInfo = new URLDepthPair(htmlUrl.substring(6, htmlUrl.length()-1), depth+1);
                        //if depth limit was reached
                        if (depth+1 <= m_maxDepth)
                        {
                            urlContainer.setRawUrl(urlInfo);
                        }
                    }
                }
            }
            socket.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error" + ex);
        }
    }
}