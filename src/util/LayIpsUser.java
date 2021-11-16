package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class LayIpsUser {
    InetAddress ip;
    String hostname;
    
    public String getIp() throws UnknownHostException{
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        return ip.toString();
    }
    
    public String getHostName() throws UnknownHostException{
        ip = InetAddress.getLocalHost();
        hostname = ip.getHostName();
        return hostname;
    }
}
