
package drzewo;


public class node<T> {
    private T value;
    Pair<node> children;
    
    public void setValue (T value){
        this.value=value;
    }
    public T getValue (){
        return this.value;
    }
   
    @Override
            public String toString(){
    return null;
}
}