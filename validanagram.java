import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        char[] chart = t.toCharArray();
        Arrays.sort(chart);
        if(Arrays.equals(chars,chart)) return true;
        else return false;
    }
}