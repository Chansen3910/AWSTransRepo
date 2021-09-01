package tech.collin.labtwo;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = new URL((args.length > 0)? (args[0]): ("https://www.google.com")).openStream();
            OutputStream os = new FileOutputStream(new File((args.length > 1)? (args[1]): ("output.html")));
            byte[] buffer = new byte[8 * 1024];
            int bytes;
            while((bytes = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytes);
            }
            is.close();
            os.close();
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
