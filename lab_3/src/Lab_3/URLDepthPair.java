package Lab_3;

public class URLDepthPair {
    //declaring variables to store parameters and URL parts
    private String m_url = "";
    private String m_domain = "";
    private String m_path = "";
    private String m_params = "";
    private int m_depth = 0;

    //constructor
    public URLDepthPair(String url, int depth)
    {
        setURL(url);
        m_depth = depth;
    }

    //setting new URL
    public void setURL(String url)
    {
        m_url = url;
        splitUrl();
    }

    //get full URL
    public String getURL()
    {
        return m_url;
    }

    //get the scan depth
    public int getDepth()
    {
        return m_depth;
    }

    //get only URL domain
    public String getDomain()
    {
        return m_domain;
    }

    //get only URL path
    public String getPath()
    {
        return m_path;
    }

    //get only URL parameters
    public String getParams()
    {
        return m_params;
    }

    //this method is for splitting the URL into parts
    protected void splitUrl()
    {
        String[] domain = m_url.split("://", 2);
        String[] path = domain[1].split("/", 2);
        //getting the URL domain
        m_domain = path[0];
        m_path = "/";
        if (path.length > 1)
        {
            String[] params = path[1].split("\\?");
            //getting the URL path
            m_path += params[0];
            if (params.length > 1)
            {
                //getting the URL parameters
                m_params = "?" + params[1];
            }
        }
    }
}
