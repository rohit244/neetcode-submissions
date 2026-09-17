class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0){
            return "";
        }
        String ans = "";
        for(String s: strs){
            ans+= s.length() + ",";
        }
        ans+="#";
        for(String s: strs){
            ans += s;
        }
        return ans;
    }

    public List<String> decode(String str) {
        if(str==""){
            return new ArrayList<String>();
        }
        List<String> ans = new ArrayList<>();
        int startNumber = str.indexOf('#');
        String numberedString = str.substring(0,startNumber);
        String[] numbers = numberedString.split(",");
        startNumber++;
        
        for(int i=0; i<numbers.length; i++){
            int endNumber = startNumber+ Integer.valueOf(numbers[i]);
            ans.add(str.substring(startNumber,endNumber));
            startNumber = endNumber;
        }
        return ans;
    }
}
