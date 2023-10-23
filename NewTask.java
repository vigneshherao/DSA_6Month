
import java.util.ArrayList;
import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.println("Enter five numbers to add into array list");

        Scanner obj = new Scanner(System.in);

        for(int i = 0; i<5;i++){
            int num = obj.nextInt();
            arr.add(num);
        }
        

        for(Integer i :arr){
            System.out.println("Array list number is "+i);
        }



        System.out.println("Enter a number to remove an element");

        int remove = obj.nextInt();

        arr.remove(remove);


        for(Integer a : arr){
            System.out.println(a);
        }
    }
}
