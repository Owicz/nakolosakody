/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author Student
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              CipherCaesar cipher = new CipherCaesar();
//        String key = cipher.generateKey();
//        System.out.println("key: " + key);
        
        String plainText = "Tajna wiadomosc";
        
        System.out.println("plain:     " + plainText);       
        
        String encText = cipher.encrypt(plainText);
        System.out.println("encrypted: " + encText);
        
        String decText = cipher.decrypt(encText);
        System.out.println("decrypted: " + decText);
        
    }
}
