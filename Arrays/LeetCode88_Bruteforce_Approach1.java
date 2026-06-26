class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Arrays.sort(nums1);
        int j = 0;
        for( int i = 0 ; i < n ; i++ ){
            if( nums1[i] < 0 ){
                n += 1;
            continue;
            }
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}