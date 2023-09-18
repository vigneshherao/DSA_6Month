public class Fourth{
	public static  void main(String[] args){
		int arr[] = {2,4,6,8,10};
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		for(int i = 0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
		