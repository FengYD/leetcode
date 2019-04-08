package socket;

import java.net.*;
import java.util.Enumeration;

/**
 * @author fengyadong
 * @date 2019/4/5 18:01
 * @description 输出本地的地址
 */
public class InetAddressExample {

    public static void main(String[] args) {
        InetAddressExample example = new InetAddressExample();
        //example.localAddress();
        //example.parseAddress("www.douyu.com");
        example.parseAllAddress("www.douyu.com");
    }

    public void localAddress() {
        try{
            Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();
            if(null != interfaceList){
                while (interfaceList.hasMoreElements()){
                    NetworkInterface iface = interfaceList.nextElement();
                    System.out.println("Interface: " + iface.getName());
                    Enumeration<InetAddress> addressList = iface.getInetAddresses();
                    if(!addressList.hasMoreElements()){
                        System.out.println("\t(No addresses for this interface)");
                    }
                    while(addressList.hasMoreElements()){
                        InetAddress address = addressList.nextElement();
                        System.out.println("\tAddress " +
                                ((address instanceof Inet4Address ? "(V4)"
                                        : (address instanceof Inet6Address ? "(V6)" : "(?)")))
                        + ": " + address.getHostAddress());
                    }

                }
            } else {
                System.out.println("--No netWork found--");
            }
        } catch (SocketException e){
            System.out.println("Error get network message: " + e.getMessage());
        }
    }

    public void parseAddress(String host){
        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println(address);
        } catch (UnknownHostException e){
            System.out.println("获取地址失败, host = " + host);
        }
    }

    public void parseAllAddress(String host){
        try {
            InetAddress[] addressArray = InetAddress.getAllByName(host);
            for(InetAddress address : addressArray) {
                System.out.println(address);
            }
        } catch (UnknownHostException e){
            System.out.println("获取地址失败, host = " + host);
        }
    }
}
