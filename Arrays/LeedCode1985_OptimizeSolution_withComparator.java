class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        myCompare com = new myCompare();
        Arrays.sort(nums , com)    ;
        return nums[nums.length - k];
    }
}

class myCompare implements Comparator<String>{
    @Override
    public int compare(String a , String b){
        if(a.length() != b.length()){
            return a.length() - b.length();
        }
        return a.compareTo(b);
    }
}