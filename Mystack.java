public class Mystack {
    private Object[] arr;
    private int index;
    private final int SIZE;

    public Mystack (int size){
        SIZE = size;
        index = 0;
        arr =  new Object[SIZE];
    }

    public boolean push( Object s){
        if (index == SIZE){
            return false;
        }
        else {
            arr[index] = s;
            index++;
            return true;
        }
    }

    public Object pop(){
        if (index <=0) return null;
        else {
            index-- ;
            return arr[index] ;
        }
    }

public static void main(String[] args) {
    Mystack<Object> stack = new Mystack<>(100);
    
}

}

