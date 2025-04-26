class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j=i+1; j<n; j++){
                int complement = 0 - nums[i] - nums[j];
                if (map.containsKey(complement)) {
                    // Sort the triplet to ensure uniqueness
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                map.put(nums[j], j);
            }
        }
        return new ArrayList(set);
    }
}