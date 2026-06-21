class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2){
            return true;
        }
        int count = 0;
        int temp = 1;
      while(temp<n){
        temp = temp * 2 ;
        ++count;
      }  
      if( Math.pow(2,count)%n < 1){
        return true;
      }
      return false;
    }
}