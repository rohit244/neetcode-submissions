class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        
        s = s.toLowerCase();
        String str = "";

        for(int i=0; i<s.length(); i++){
            if((Character.isAlphabetic(s.charAt(i))) || (Character.isDigit(s.charAt(i)))){
                str += s.charAt(i);
            }
        }
        int right = str.length()-1;

        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
