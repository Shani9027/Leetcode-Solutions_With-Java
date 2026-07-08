class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
       for (int num : nums1) {
            list.add(num);
        }
        for (int num : nums2) {
            list.add(num);
        }
        Collections.sort(list);
        if(size % 2 == 1){ 
            return list.get((size)/2);
        }else{
            int a = size/2;
            int b = a - 1;
            return (list.get(a) + list.get(b))/2.0;
        }
    }
}
