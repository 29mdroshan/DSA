package binarySearch.problems;

public class SearchIn2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 100% beat self done. CONGRATULATION!!!!!1
        int n = matrix.length;
        for(int i =0 ; i < n; i++) {
            int j = matrix[i].length;
            if(matrix[i][0] <= target && matrix[i][j-1] >= target)  {
                int l = 0 , r = j -1;
                while(l <= r) {
                    int mid = (l + r) / 2;
                    if(matrix[i][mid] == target) {
                        return true;
                    } else if (target < matrix[i][mid]) {
                        r = mid -1;
                    } else {
                        l = mid +1;
                    }
                }

            }
        }
        return false;
    }
}
