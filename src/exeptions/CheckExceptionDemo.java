package exeptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckExceptionDemo ced = new CheckExceptionDemo();
        ced.urlTesterByTryCatch("https://wszib.edu.pl");
        ced.urlTesterByThrows("shttps://sake.wszib.edu.pl");

    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Host : " + url.getHost());
        } catch (MalformedURLException e) {
            //e.printStackTrace();
            System.out.println("Błąd ! : " + e.getMessage());
        }
    }

    public void urlTesterByThrows( String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocol : " + url.getProtocol());
        System.out.println("Host : " + url.getHost());
    }

}
