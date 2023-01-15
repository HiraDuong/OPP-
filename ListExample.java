import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntUnaryOperator;
public class ListExample {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add(1,"D");

        lst.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                if (o1.lenght()>o2.lenght())return 1;
                else if (o1.lenght()==o2.lenght()) return 0;
                else return -1;
                return 0;
            }
        });
        for(int i = 0; i <lst.size();i++ ){
            String s = lst.get(i);
        }
        for (String s : lst){

        }
        Iterator<String> it = lst.iterator();

    }
}
