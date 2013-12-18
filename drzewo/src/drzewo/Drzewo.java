/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drzewo;

/**
 *
 * @author Student
 */
public class Drzewo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pair<String> pl= new Pair<>();
       pl.setFirst("trala");
       pl.setSecond("lala");
//       System.out.println(pl);
       Pair<Integer> pl2= new Pair<>();
       pl2.setFirst(3);
       pl2.setSecond(18);
       System.out.println(pl2);
       node<Integer> tree = new node<>(99);
       
    }
}
