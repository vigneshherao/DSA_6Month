import java.util.LinkedList;

public class Linklist{
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<Integer>();
        link.add(2);
        link.add(5);
        link.add(7);
        for (Integer i : link) {
            System.out.println(i);
        }

    }
}