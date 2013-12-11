package javaapplication27;

/**
 * Klasa bazowa dla wszystkich klas z implementacjami metod szyfrowania "znak po znaku"
 *
 * @author Olek Lamza
 */
abstract public class Cipher<T> {

    protected T key;
    
    abstract public String encrypt(String text);
    abstract public String decrypt(String text);
  
    /*
     * Metoda przetwarzająca cały łańcuch
     */
    protected String doJob(String text, CharProc cp) {
        StringBuilder encText = new StringBuilder();
        
        for (int i=0; i<text.length(); i++) {
            int c = text.charAt(i);

            c = cp.process(c, key);
            
            encText.append((char)c);
        }
        
        return encText.toString();
    }
    
}
