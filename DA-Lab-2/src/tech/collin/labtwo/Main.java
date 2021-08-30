package tech.collin.labtwo;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        try {
            URL secure = new URL("https://www.tarleton.edu");
            URL nonsecure = new URL("http://www.tarleton.edu");
            InputStreamReader isr = new InputStreamReader(secure.openStream(), "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            
            String res = "";
            while((res = br.readLine()) != null) {
                System.out.println(res);
            }
        }catch(MalformedURLException e) {
            System.out.println("[******   MALFORMED URL   ******]");
            e.printStackTrace();
        }catch(UnsupportedEncodingException e) {
            System.out.println("[******   CHARSET CODEC NOT SUPPORTED   ******]");
            e.printStackTrace();
        }catch(IOException e) {
            System.out.println("[******   READER IO EXCEPTION   ******]");
            e.printStackTrace();
        }catch(Exception e) {
            System.out.println("[******   GENERIC EXCEPTION   ******]");
            e.printStackTrace();
        }

        System.exit(0);
    }
}