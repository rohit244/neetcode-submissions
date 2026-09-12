class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        int i=0;
        int j=t.length()-1;
        while(i<s.length()){
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(j)-'a']--;
            i++;
            j--;
        }
        for(int l=0; l<chars.length; l++){
            if(chars[l]!=0){
                return false;
            }
        }
        return true;
    }
}
