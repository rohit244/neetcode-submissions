class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(String s: strs){
            int arr[] = new int[26];
            for(char c: s.toCharArray()){
                arr[(int)c-(int)'a']++;
            }
            String str = Arrays.toString(arr);
            ans.putIfAbsent(str,new ArrayList<>());
            ans.get(str).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
