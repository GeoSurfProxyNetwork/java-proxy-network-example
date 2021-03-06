// Java Apache HttpClient proxy example
// https://www.geosurf.com/resources/residential-ips-integration-guide

String gs_proxy_addr = "gw1.geosurf.io";
int gs_proxy_port = 8081;

DefaultHttpClient httpclient = new DefaultHttpClient();

HttpHost proxy = new HttpHost(gs_proxy_addr, gs_proxy_port , "http");
httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
 
HttpGet httpget = new HttpGet("http://www.example.com");
 
HttpResponse response = httpclient.execute(httpget);
