class GoodPair {
    public int numIdenticalPairs(int[] nums) {
        int[] Hash= new int[101];

        for (int num : nums) {
            Hash[num]++;
        }
        int count=0;
        for(int f: Hash){
            if(f>1){ 
                count = count + f * (f -1) /2;
            }

        }
        return count;
        
    }
}