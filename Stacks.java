import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> n = new Stack <Integer> ();
        //push data
        n.push(5);
        n.push(1);
        n.push(2);
        n.push(9);
        n.push(0);
        while(!n.isEmpty()){
            System.out.println(n.pop());
        }
    }
}
