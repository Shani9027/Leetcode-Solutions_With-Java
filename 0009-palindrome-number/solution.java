class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int num = x;
        int x1 = 0;
        while(num > 0){
            int temp = num%10 ;
            x1 = x1*10 + temp ;
            num = num/10 ;
        }
        if(x==x1){
            return true;
        }
        return false;
    }
}
