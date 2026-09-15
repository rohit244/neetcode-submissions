class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int numMap[] = new int[2002];
        int countMap[] = new int[2002];
        int ans[] = new int[k];
        for(int i=0; i<nums.length; ++i){
            numMap[1001+(nums[i]-0)]++;
            countMap[1001+(nums[i]-0)]++;
        }
        Arrays.sort(countMap);
        for(int i=0; i<k; ++i){
            int count = countMap[countMap.length-1-i];
            for(int j=0; j<numMap.length; j++){
                if(numMap[j] == count){
                    ans[i] = j-1001;
                    numMap[j] = -1;
                    break;
                }
            }
        }
        return ans;
    }
}
