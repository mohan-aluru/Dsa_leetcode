class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
TreeSet<Integer> set=new TreeSet<>();
        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;//from 2nd index checks backwards to find duplicates
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];
          set.add(sum);
          if(sum==target){
            return target;
          }
                 if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }

  // Largest sum smaller than target
        Integer res1 = set.lower(target);

        // Smallest sum greater than target
        Integer res2 = set.higher(target);

        // Only smaller value exists
        if (res2 == null) {
            return res1;
        }

        // Only greater value exists
        if (res1 == null) {
            return res2;
        }

        int d1 = Math.abs(target - res1);
        int d2 = Math.abs(target - res2);

        if (d1 < d2) {
            return res1;
        } else {
            return res2;
        }
    }
}
