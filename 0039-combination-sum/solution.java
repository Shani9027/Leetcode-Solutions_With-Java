class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    void solve(int i, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        if(i == arr.length) return;

        if(arr[i] <= target){
            ds.add(arr[i]);
            solve(i, arr, target - arr[i], ds, ans);
            ds.remove(ds.size()-1);
        }

        solve(i+1, arr, target, ds, ans);
    }
}
