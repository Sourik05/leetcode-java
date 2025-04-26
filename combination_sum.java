class Solution {
    public void combination(int index, int[] candidates, int target, List<Integer> list, List<List<Integer>> result){
        if(index == candidates.length){
            if(target == 0){
                result.add(new ArrayList<>(list));
            }
            return;
        }
        if(target >= candidates[index]){
            list.add(candidates[index]);
            combination(index, candidates, target-candidates[index], list, result);
            list.remove(list.size()-1);
        }
        combination(index+1, candidates, target, list, result);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int index = 0;
        combination(index, candidates, target, list, result);
        return result;
    }
}