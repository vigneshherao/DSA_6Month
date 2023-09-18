public class First{
	public static  void main(String[] args){
		String arr[] = {"mango","orange","banana","pinaple","grape"};
		String target = "mango";
		for(int i=0;i<arr.length;i++){
			if(arr[i] == target){
				System.out.println(i);
			}
		}
	}
}
			