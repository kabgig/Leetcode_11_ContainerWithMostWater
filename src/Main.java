public class Main {
    public static void main(String[] args) {
        int [] lines = {1,2,1,1,2};
        Solution solution = new Solution();
        int res = solution.maxArea(lines);
        System.out.println(res);
    }
}

/*

Constraints:

        n == height.length
        2 <= n <= 105
        0 <= height[i] <= 104

        */
