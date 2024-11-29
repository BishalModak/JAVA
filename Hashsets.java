import java.util.HashSet;
import java.util.Iterator;
public class Hashsets{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        
        //add values to
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(9);

        //print the values
        System.out.println(set);

        //size of the hashset
        System.out.println("The size is: "+set.size());

        //Search a value
        if(set.contains(6)){
            System.out.println("Present");
        }
        if(!set.contains(12)){
            System.out.println("Absent");
        }

        //Delete
        set.remove(9);
        if(!set.contains(9)){
            System.out.println("Value Delete hoye geche");
        }

        //Iterator
        Iterator it=set.iterator();
       while (it.hasNext()) {
            System.out.println(it.next()+ " ");
        }
    }
}