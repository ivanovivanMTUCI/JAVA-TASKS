package Lab_3;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_3 {
    public static void main(String[] args)
    {
        //first URL
        URLPool pool = new URLPool("http://mtuci.ru/");
        //setting depth and number of threads for the first URL
        int depth = 1;
        int threadNum = 10;

        //numbered list for scanners
        ArrayList<Crawler> crawlers = new ArrayList<>(threadNum);
        for (int i = 0; i < threadNum; i++)
        {
            //create and start a URL scanner
            Crawler crawler = new Crawler(pool, depth);
            crawler.setDaemon(true);
            crawler.start();
            crawlers.add(crawler);
        }

        //realizing multithread scanning
        boolean processing = true;
        while (processing == true)
        {
            //forcing the scanners
            Thread.yield();
            processing = false;
            for (Crawler cw : crawlers)
            {
                //if no scanners are waiting
                if (cw.getState() != Thread.State.WAITING)
                {
                    processing = true;
                    break;
                }
            }
        }

        //getting scanned URLs
        Hashtable<String, URLDepthPair> visitedUrl = pool.getVisitedUrl();
        //enumerating scanned URLs
        Enumeration<URLDepthPair> val = visitedUrl.elements();
        while (val.hasMoreElements())
        {
            //printing out scanned URLs
            URLDepthPair pair = val.nextElement();
            System.out.println(pair.getURL());
        }
        System.out.println("Total URLs scanned: " + visitedUrl.size());
    }
}
