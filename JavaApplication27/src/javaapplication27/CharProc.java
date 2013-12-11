package javaapplication27;

/**
 * Interfejs opisujący obiekty przetwarzające pojedynczy znak.
 * 
 * @author Olek Lamza
 */
public interface CharProc<T> {
    public int process(int c, T key);
}
