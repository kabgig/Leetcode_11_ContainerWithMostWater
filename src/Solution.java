class Solution {
    public int maxSquare;
    public int maxArea(int[] height) {
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j <height.length; j++) {
                if(i == j) continue;
                if (height[i] < height[j])
                    square(height[i],Math.abs(i-j) );
                else square(height[j],Math.abs(i-j) );
            }
        }
        return maxSquare ;
    }

    public void square(int x, int y) {
        int square = x * y;
        if (maxSquare < square) maxSquare = square;
    }
}