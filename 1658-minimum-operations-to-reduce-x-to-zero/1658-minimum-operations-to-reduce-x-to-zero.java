class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        sum -= x;
        if (sum == 0) {
    return nums.length;
}


        Map<Integer, Integer> map = new HashMap<>();
        int prefix = 0;

        map.put(0, -1);

        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            if (map.containsKey(prefix - sum)) {
                ans = Math.max(ans, i - map.get(prefix - sum));
            }

            map.put(prefix, i);
        }

        return ans == -1 ? -1 : nums.length - ans;
    }
}
