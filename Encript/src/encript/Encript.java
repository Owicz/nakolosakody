/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encript;

/**
 *
 * @author Student
 */
public class Encript {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word = "cos tam sie dzieje";
        int move = 5;
        Encripting cos = new Encripting();
        System.out.println(word = cos.szyfr(word,move));
        System.out.println(word = cos.deszyfr(word,move));
        
    }
}
