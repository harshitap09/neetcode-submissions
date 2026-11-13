class Solution {
    public int[] twoSum(int[] nums, int target) {

        //create a map <element, index>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int currTarget = target - nums[i];

            if (map.containsKey(currTarget)) {
                return new int[] {map.get(currTarget), i};
            }

            else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
