class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x = 0;
        long n1 = 0;
        while( n>0 ){
            long temp = n%10;
            n1 = (n1*10) + temp;
            n /= 10;
        }
        while( n1 > 0 ){
            long temp = n1%10;
            if( temp!=0 ){
                x = (x*10) + temp;
                sum += temp;
            }
            n1 /= 10;
        }
        return (x * sum);
    }
}