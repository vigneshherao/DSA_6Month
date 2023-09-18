public class Three{
	public static  void main(String[] args){
		int arr[] = {2,4,6,8,10,12,14};
		int target = 4;
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid = (start + end) / 2;
			if(arr[mid] == target){
				System.out.println(mid);
			}
			if(arr[mid]>target){
				end = mid - 1;
			}
			else{
				start= mid+1;
			}
		}
    }
}
		