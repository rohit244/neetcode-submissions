class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0){
            return "";
        }
        String encoded="";
        for(String s: strs){
            encoded+=String.valueOf(s.length())+",";
        }
        encoded+="#";
        for(String s: strs){
            encoded += s;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        if(str==""){
            return new ArrayList<String>();
        }
        int hashLength = 0;
        List<String> ans = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='#'){
                hashLength = i;
                break;
            }
        }
        String[] lengths = str.substring(0,hashLength-1).split(",");
        int startLength = hashLength+1;
        for(int i=0; i<lengths.length; i++){
            int endLength = startLength + Integer.valueOf(lengths[i]);
            ans.add(str.substring
            (startLength,endLength));
            startLength = endLength;
        }
        return ans;
    }
}
