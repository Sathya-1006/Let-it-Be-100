//13.Leetcode
//2364. Count Number of Bad Pairs
class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long) n * (n - 1) / 2; 
        long goodPairs = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            goodPairs += freqMap.getOrDefault(diff, 0);
            freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
        }

        return totalPairs - goodPairs;
    }
}
