public class Duplicate{
    public int findDuplicate(int[] nums) {
        int[] hash = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]+=1;
        }
        for(int i=0;i<nums.length;i++){
            if(hash[i]>=2) return i;
        }
        return 0;
    }
}
