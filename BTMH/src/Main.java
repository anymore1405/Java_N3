import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("8", "4", "-", "6", "3", "/", "+")) ;
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.search(50));
    }
}