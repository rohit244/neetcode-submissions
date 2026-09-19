class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num: nums){
            set.add(num);
        }
        for(Integer num: set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num+length)){
                    length++;
                }
                ans = Math.max(length,ans);
            }
        }
        return ans;
    }
}
