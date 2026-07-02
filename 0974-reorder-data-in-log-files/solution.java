class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs , (a,b) -> {
            int idxA = a.indexOf(' ');
            int idxB = b.indexOf(' ');
            
            String idA  = a.substring(0,idxA);
            String idB = b.substring(0,idxB);

            String contentA = a.substring(idxA + 1);
            String contentB = b.substring(idxB + 1);

            boolean isDigitA = Character.isDigit(contentA.charAt(0));
            boolean isDigitB = Character.isDigit(contentB.charAt(0));

            if(!isDigitA && !isDigitB){
                int cmp = contentA.compareTo(contentB);

                if(cmp == 0){
                    return idA.compareTo(idB);
                }
                    return cmp;
            }
            
            if( isDigitA && isDigitB) return 0;

                return isDigitA ? 1 : -1;
                                                    });
        return logs;
    }
}
