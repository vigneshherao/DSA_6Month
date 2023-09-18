public class Eight {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int newArray[] = new int[arr.length];
        newArray[0] = arr[0];
        for(int i = 1;i<newArray.length;i++){
            newArray[i] = newArray[i-1] + arr[i];
        }
        PrintArray(newArray);
    }
    public static void PrintArray(int newArray[]){
        for(int i = 0; i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
