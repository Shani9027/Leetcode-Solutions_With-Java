class Solution {
    public void setZeroes(int[][] matrix) {
        
    ArrayList<ArrayList<Integer>> zeroIndex = new ArrayList<>();
    
        for( int i = 0 ; i < matrix.length ; i++ ){
            for( int j = 0 ; j < matrix[0].length ; j++ ){
                if( matrix[i][j] == 0 ){
                    ArrayList<Integer> zeroIndexInArray = new ArrayList<>();
                    zeroIndexInArray.add(i);
                    zeroIndexInArray.add(j);
                    zeroIndex.add(zeroIndexInArray);
                }
            }
        }
        for( int i = 0 ; i < zeroIndex.size() ; i++ ){
            int row = zeroIndex.get(i).get(0);
            int col = zeroIndex.get(i).get(1);
            for( int j = 0 ; j < matrix[0].length ; j++ ){
                matrix[row][j] = 0;
            }
            for( int k = 0; k < matrix.length ; k++ ){
                matrix[k][col] = 0;
            }
        }
    }
}
