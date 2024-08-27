class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];

            if(hashMap.containsKey(num)){
                return new int[] { hashMap.get(num), i };
            }

            hashMap.put(nums[i], i);
        }

         return new int[] {}; 
    }
}
