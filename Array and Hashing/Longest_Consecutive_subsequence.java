class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> sp = new HashSet<Integer>();
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            sp.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!sp.contains(nums[i]-1)) {
                int j = nums[i];
                while (sp.contains(j)) {
                    sp.remove(Integer.valueOf(j));
                    j++;
                }

                if (answer < j - nums[i]) {
                    answer = j - nums[i];
                }
            }
        }

        return answer;
    }
}