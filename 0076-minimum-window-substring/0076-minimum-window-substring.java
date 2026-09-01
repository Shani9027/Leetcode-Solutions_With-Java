class Solution {
    public String minWindow(String s, String t) {
        if( s.length() == 0 || t.length() == 0 ) return "";
        Map<Character , Integer> mp = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++){
            mp.put(t.charAt(i) , mp.getOrDefault(t.charAt(i),0) + 1);
        }
        int req = mp.size() ;
        int l = 0 , r = 0 ;
        int formed = 0;

        Map<Character , Integer > widCount = new HashMap<>();
        int[] ans = {-1 , 0 , 0};

        while(r < s.length()){
            char c = s.charAt(r) ;
            widCount.put( c , widCount.getOrDefault(c,0) + 1);
            if(mp.containsKey(c) && widCount.get(c).intValue() == mp.get(c).intValue()){
                formed++;
            }
            while(l <= r && formed == req){
                c = s.charAt(l);
                if(ans[0] == -1 || r-l+1 < ans[0]){
                    ans[0] = r-l+1;
                    ans[1] = l;
                    ans[2] = r;
                }
                widCount.put(c , widCount.get(c) - 1);
                if ( mp.containsKey(c) && widCount.get(c) < mp .get(c) ){
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1],ans[2]+1);
    }
}