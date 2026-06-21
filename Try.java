class Try{
    public static void main(String[] args) {
         
        int[] arr = {5,2,7,6,4,8,9,7,3,2};
        int N = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0; i<max+1; i++){
            count[i] = 0;
        }
        for(int i=0; i<N; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<max+1; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}