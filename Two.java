public class Two{
	public static  void main(String[] args){
		int arr[] = {1,2,6,3,5,200};
		int min = Integer.MIN_VALUE;
		for(int i = 0 ; i<arr.length;i++){
			if(arr[i] > min){
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
			