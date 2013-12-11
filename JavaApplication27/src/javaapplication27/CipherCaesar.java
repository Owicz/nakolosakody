package javaapplication27;

/**
 * Klasa implementująca szyfrowanie metodą Cezara
 * 
 * @author Olek Lamza
 */
public class CipherCaesar extends Cipher {

    public CipherCaesar() {
        key = new Integer(1);
    }
    
    
    @Override
    public String encrypt(String text) {
        return doJob(text, new CharProc<Integer>() {

            @Override
            public int process(int c, Integer key) {
                return c + key.intValue();
            }
            
        });
    }

    @Override
    public String decrypt(String text) {
        return doJob(text, new CharProc<Integer>() {

            @Override
            public int process(int c, Integer key) {
                return c - key.intValue();
            }
            
        });
    }
    
}
