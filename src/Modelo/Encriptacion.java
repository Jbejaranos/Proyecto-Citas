/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
 
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author 
 */
public class Encriptacion {

    /**
     * @param args the command line arguments
     */
    
    

    
    
    
    
      
    
    
    
    
    /*
    Tomado de
    https://howtodoinjava.com/security/java-aes-encryption-example/
    */

    
    
    
    
    private static SecretKeySpec secretKey;
    private static byte[] key;
    
    
    
    
    //LLAVE PARA EL ENCRIPTAMIENTO DE LAS CLAVES EN EL LOGIN
    
    private static final String llaveGlobal ="UNAL";
    
    
    
    
    
    
 
    public static void setKey(String myKey) 
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); 
            secretKey = new SecretKeySpec(key, "AES");
        } 
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } 
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
 
    
    
    
    
    
    
    
    
    
    public static String encriptar(String claveSinEncriptar, String llave) 
    {
        try
        {
            setKey(llave);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(claveSinEncriptar.getBytes("UTF-8")));
        } 
        catch (Exception e) 
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
 
    
    
    
    
    
    public static String desencriptar(String claveEncriptada, String llave) 
    {
        try
        {
            setKey(llave);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(claveEncriptada)));
        } 
        catch (Exception e) 
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    
    
    
    public static String encriptar(String claveSinEncriptar){
        
           return encriptar(claveSinEncriptar, llaveGlobal);
    }
    
    
    public static String desencriptar(String claveEncriptada){
        
           return desencriptar(claveEncriptada, llaveGlobal);
    }
    
    
    
    
    
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        
     
        String originalString = "Los michis son divinos";
        String encryptedString = encriptar(originalString) ;
        String decryptedString = desencriptar(encryptedString) ;

        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);
    }
    
}
