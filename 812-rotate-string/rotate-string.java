class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length()!= goal.length()) return false; 
        String temp=s+s;

        for(int i=0;i<s.length();i++){
            String ans=temp.substring(i,i+goal.length());

            if(ans.equals(goal)){
                return true;
            }
        }
        return false;
        
    }
}