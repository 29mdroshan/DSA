package _5_SlindingWindow;

public class _6_MaximumPointYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {

        int sum = 0;
        for(int i =0; i< k; i++) {
            sum += cardPoints[i];
        }
        int l = k-1, r = cardPoints.length -1, maxs = sum;
        while(l >= 0) {
            sum -=  cardPoints[l--];
            sum += cardPoints[r--];
            maxs = Math.max(maxs, sum);
        }
        return maxs;
    }
}
