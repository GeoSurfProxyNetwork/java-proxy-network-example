// Java global proxy example
// https://www.geosurf.com/resources/residential-ips-integration-guide

System.setProperty("proxySet", "true");

// Our reverse proxy hostname + port, check your address in Dashboard
System.setProperty("http.proxyHost", "gw1.geosurf.io");
System.setProperty("http.proxyPort", "8081");

URL url = new URL("http://www.example.com/");
URLConnection con = url.openConnection();
