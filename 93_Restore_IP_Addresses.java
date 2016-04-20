public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        
        if(s.length() <4 || s.length() > 12)
            return result;
        
        solve(result, list, s , 0);
        return result;
    }
    
    public void solve(ArrayList<String> result, ArrayList<String> list, String s, int start){
        if(list.size() == 4){
            if(start != s.length())
                return;
            
            StringBuffer a = new StringBuffer();
            for(String ele: list){
                a.append(ele);
                a.append(".");
            }
            a.deleteCharAt(a.length()-1);
            result.add(a.toString());
            return;
        }
        
        for(int i=start; i<s.length() && i<= start+3; i++){
            String ele = s.substring(start, i+1);
            if(isvalid(ele)){
                list.add(ele);
                solve(result, list, s, i+1);
                list.remove(list.size()-1);
            }
        }
    }
    
    private boolean isvalid(String s){
        if(s.charAt(0) == '0')
            return s.equals("0");
        int digit = Integer.valueOf(s);
        return digit >= 0 && digit <= 255;
    }
}
