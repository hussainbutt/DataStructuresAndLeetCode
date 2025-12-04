import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);                 // optional but helps pruning
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start,
                           List<Integer> partial, List<List<Integer>> result) {
        if (remaining == 0) {
            // Found a valid combination — add a copy
            result.add(new ArrayList<>(partial));
            return;
        }
        if (remaining < 0) {
            // exceeded target, stop this path
            return;
        }

        for(int i = start; i < candidates.length; i++){
            int val = candidates[i];
            if(val>remaining) break;
            partial.add(val);
            backtrack(candidates, remaining - val, i, partial, result);
            partial.remove(partial.size() - 1);
        }
    }
}
