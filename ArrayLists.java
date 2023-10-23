import java.util.*;
public class ArrayLists{
    public static void main(String[] args) {
       //creating a array list in java 
       ArrayList<Integer> arr = new ArrayList<Integer>();

       //adding an element to an array list
       arr.add(10);
       arr.add(2);
       arr.add(9);


       //getting an element from the arraylist using index
        int a = arr.get(1);
        System.out.println(a);



        // for loop for the array list 

        for(int i = 0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }


        // another way of getting arraylist


        for (Integer values : arr) {
            System.out.println(values);
        }
    }
}