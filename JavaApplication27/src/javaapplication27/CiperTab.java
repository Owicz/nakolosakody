/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Random;

/**
 *
 * @author Student
 */
public class CiperTab extends Cipher{
    private String key = "";
    
    /*
     * Konstruktory
     */
    public CiperTab() {
        
    }
    
    public CiperTab(String key) {
        this.key = key;
    }
    
    /*
     * Metoda generująca i zwracająca klucz szyfrujący.
     */
    public String generateKey() {
        // dla znaków od spacji (32) do małego 'z' (122)
        char min = ' ';
        char max = 'z';
        int count = max-min+1;
        
        key = "";
        
        Random rand = new Random();
        
        for (int i=0; i<count; i++) {
            int d = 0;
            do {
                d = rand.nextInt(count);
            } while (key.indexOf((char)(min+d)) != -1);
            
            key += (char)(min+d);
        }

        return key;
    }
    
    /*
     * Metoda zwracająca klucz szyfrujący.
     */
    public String getKey() {
        return key;
    }
}
