class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<int[]> positions = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    positions.add(new int[]{i, j});
                }
            }
        }

        for(int[] pos : positions){
            int x = pos[0], y = pos[1];

            for(int i = 0; i < n; i++){
                matrix[i][y] = 0;
            }

            for(int j = 0; j < m; j++){
                matrix[x][j] = 0;
            }
        }
    }
}