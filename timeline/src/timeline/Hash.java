/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timeline;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Bhuvaneshwar
 */
public class Hash {
public String encrypt(String pwd) throws NoSuchAlgorithmException{
    MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(pwd.getBytes());
            byte[] bytes=md.digest();
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff)+0x100, 16).substring(1));
                }
            String hash=sb.toString();
 return hash;           
}
public static void openWebpage(URI uri) {
    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public static void openWebpage(URL url) {
    try {
        System.out.println("opening in browser");
        openWebpage(url.toURI());
    } catch (URISyntaxException e) {
        e.printStackTrace();
    }
}}
