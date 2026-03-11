class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        per(nums,0,res);
        return res;
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void per(int[] arr,int fixed,List<List<Integer>> res){
        if(fixed==arr.length){
            List<Integer> temp=new ArrayList<>();
            for(int n:arr){
                temp.add(n);
            }
            res.add(temp);
            return;
        }
        for(int i=fixed;i<arr.length;i++){
            swap(arr,i,fixed);
            per(arr,fixed+1,res);
            swap(arr,i,fixed);
        }
    }
}
