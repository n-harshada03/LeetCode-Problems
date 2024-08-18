class Solution {
    public String checkTwoStrings(String s1,String s2){
        int n=Math.min(s1.length(),s2.length());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";

        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            ans=checkTwoStrings(ans,strs[i]);
        }

        return ans;


        
    }
}