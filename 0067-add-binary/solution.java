import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {

        BigInteger Number_a = new BigInteger( a , 2 );
        BigInteger Number_b = new BigInteger( b , 2);
        
        BigInteger sum = Number_a.add(Number_b);
        String ans = sum.toString(2);
        return ans;
    }
}
