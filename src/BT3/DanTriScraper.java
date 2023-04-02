package BT3;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DanTriScraper {
    public static void main(String[] args) throws MalformedURLException {
            try {
        URL url = new URL(" http://dantri.com.vn/the-gioi.htm");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
                System.out.println();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
}
