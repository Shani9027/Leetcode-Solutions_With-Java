import java.util.Arrays;

class Try{
	public static void main(String[] args){
		int arr[] = new int[4];
		int arr1[] = new int[2];
		arr = new int[] {2,7,11,15};
		int target = 9;
		for(int j=0 ; j<arr.length ;j++){
			for(int i=j+1 ; i<arr.length ;i++){
				if(arr[j]+arr[i]==target){
					 arr1[0] = j;
					 arr1[1] = i;
				}
			}
		}
		System.out.println("Index=" + Arrays.toString(arr1));
	}
}