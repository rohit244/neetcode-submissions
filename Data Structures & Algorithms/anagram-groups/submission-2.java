class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            ans.putIfAbsent(sortedString, new ArrayList<>());
            ans.get(sortedString).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
