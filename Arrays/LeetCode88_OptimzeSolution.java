class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for( int i= 0 ; i < m ; i++ ){
            list.add(nums1[i]);
        }
        int j = 0;
        int i = 0;
        int k = 0;
        while( i<m && j<n ){
            if( list.get(i) <= nums2[j] ){
                nums1[k++] = list.get(i);
                i++;
            }else{
                nums1[k++] = nums2[j];
                j++;
            }
        }    
            while(i<m){
                nums1[k] = list.get(i);
                 i++;
                 k++;
            }
            while(j<n){
                nums1[k] = nums2[j];
                j++;
                k++;
            }
    }
}