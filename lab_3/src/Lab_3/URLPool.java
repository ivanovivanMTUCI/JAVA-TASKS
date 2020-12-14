package Lab_3;

import java.util.*;

public class URLPool
{
    //declaring two lists: for new URLs and visited URLs
    private Hashtable<String, URLDepthPair> rawUrl = new Hashtable<>();
    private Hashtable<String, URLDepthPair> visitedUrl = new Hashtable<>();

    //constructor
    public URLPool(String firstUrl)
    {
        //starting with the input URL
        URLDepthPair urlInfo = new URLDepthPair(firstUrl, 0);
        String key = urlInfo.getDomain() + urlInfo.getPath() + urlInfo.getParams();
        rawUrl.put(key, urlInfo);
    }

    public synchronized URLDepthPair getRawUrl()
    {
        //if the list is empty, await a new found URL
        while (rawUrl.size() == 0)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
        String key = rawUrl.keys().nextElement();
        URLDepthPair urlInfo = rawUrl.get(key);
        //remove this URL from the list
        rawUrl.remove(key);
        return urlInfo;
    }

    //method to put new found URLs into the list
    public synchronized void setRawUrl(URLDepthPair urlInfo)
    {
        String key = urlInfo.getDomain() + urlInfo.getPath() + urlInfo.getParams();
        //if this URL is completely new
        if (!visitedUrl.containsKey(key) && !rawUrl.containsKey(key))
            rawUrl.put(key, urlInfo);
        //wake up a thread
        notify();
    }

    //method to list all visited URLs
    public Hashtable<String, URLDepthPair> getVisitedUrl()
    {
        return visitedUrl;
    }

    //method to put new visited URLs into the list
    public synchronized void setVisitedUrl(URLDepthPair urlInfo)
    {
        String key = urlInfo.getDomain() + urlInfo.getPath() + urlInfo.getParams();
        //can't be 2 same URLs
        if (!visitedUrl.containsKey(key))
            visitedUrl.put(key, urlInfo);
    }
}