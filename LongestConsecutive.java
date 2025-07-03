import java.util.HashSet;
import java.util.Set;
class Solution {
    public int LongestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int maxLen = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                maxLen = Math.max(maxLen, currentStreak);
            }
        }
        return maxLen;
    }
}