
package drzewo;


public class node<T> extends Pair{
    private T value;
    Pair<node> children;
    
    public node(){       
    }
    
    public node(T value){
       this.value = value;
    }
   
    public node(T value, Pair<node> children ){
        this.value = value;
        this.children=children;
    }
    
    public void setChildren(Pair<node> children){
        this.children = children;
    }
    
    public void setFirstChild(node node){
        
    }
    
    public void setSecondChild(node node){  
    }    
    
    public void setValue (T value){
        this.value = value;
    }
    
    public T getValue (){
        return this.value;
    }
   
    @Override
            public String toString(){
    return null;
}
}