/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encript;

/**
 *
 * @author Student
 */
public class Encripting {
     public String szyfr(String zdanie, int x){
        String nowe = "";
        for(int i = 0; i < zdanie.length(); i++){
            char y = zdanie.charAt(i);
            y = (char)((int)y + x);
            nowe = nowe + y;
        }
        
        return nowe;
    }
     public String deszyfr(String zdanie, int x){
        String nowe = "";
        for(int i = 0; i < zdanie.length(); i++){
            char y = zdanie.charAt(i);
            y = (char)((int)y - x);
            nowe = nowe + y;
        }
        return nowe;
    }
}
