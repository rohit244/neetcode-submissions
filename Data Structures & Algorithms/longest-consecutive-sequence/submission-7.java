class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        if(nums.length == 0){
            return ans;
        }
        Set<Integer> set = new HashSet<>();
        
        for(int n: nums){
            set.add(n);
        }
        for(Integer s: set){
            if(!set.contains(s-1)){
                int length = 1;
                while(set.contains(s+length)){
                    length++;
                }
                ans = Math.max(ans,length);
            }
        }
        return ans;
    }
}
