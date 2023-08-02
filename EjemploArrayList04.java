import java.util.ArrayList;
import java.util.Collections;
public class EjemploArrayList04 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(4);
        a.add(2);
        a.add(8);
        a.add(34);
        a.add(-23);

        System.out.println("Lista en estado original:");
        for (int num : a){
            System.out.println(num);
        }

        Collections.sort(a);

        System.out.println("Lista en ordenada:");
        for (int num : a){
            System.out.println(num);
        }
    }
}
