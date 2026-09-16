class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int numArr[] = new int[2002];
        int countMap[] = new int[2002];
        int numsMap[] = new int[2002];
        int ans[] = new int[k];
        for(int i=0; i<nums.length; i++){
            numsMap[nums[i]+1001]++;
            countMap[nums[i]+1001]++;
        }
        Arrays.sort(countMap);
        for(int i=1; i<=k; i++){
            for(int j=0; j<numsMap.length; j++){
                if(numsMap[j] == countMap[countMap.length-i]){
                    numsMap[j] = -1;
                    ans[i-1] = j-1001;
                    break;
                }
            }
        }
        return ans;
    }
    
}
