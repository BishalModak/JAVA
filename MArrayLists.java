import java.util.ArrayList;
import java.util.Collections;
public class MArrayLists {
    public static void main(String[] args) {
         ArrayList<Integer> n = new ArrayList<Integer>();
         ArrayList<String> n2 = new ArrayList<String>();
         ArrayList<Boolean> n3 = new ArrayList<Boolean>();
            //Add array
            n.add(1);
            n.add(8);
            n.add(4);
            n.add(3);
            n.add(6);
            System.out.println(n);
            //get array
            int e= n.get(2);
            System.out.println(e);
            
            //Add element in a specific index
            n.add(1, 7);
            System.out.println(n);
            
            //Set element
            n.set(3, 0);//set use for replace a value
            System.out.println(n);
            
            //Delete Element
            n.remove(3);
            System.out.println(n);
            
            //Size
            int a=n.size();
            System.out.println(e);
            
            //loops in list
            for(int i=0;i<n.size();i++){
                System.out.print(n.get(i)+" ");
            }
            System.out.println();
            
            //Sorting in list
            Collections.sort(n);
            System.out.println(n);
    }
}
