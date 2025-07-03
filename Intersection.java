import java.util.Arrays;

class Intersection{
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] hash= new int[1001];
        for(int i: nums1){
            hash[i]++;
        }
        int k=0;
        int[] arr=new int[1001];
        for(int j:nums2){
            if(hash[j]!=0){
                arr[k]=j;
                k++;
                hash[j]--;
            }
        }
        return Arrays.copyOfRange(arr, 0, k);
    }
}