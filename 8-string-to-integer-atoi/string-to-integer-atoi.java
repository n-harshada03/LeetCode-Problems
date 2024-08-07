class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i=0;
        int sign=1;

        if(s.length()==0)return 0;

        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }

        long result=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            result= result*10 + (s.charAt(i)-'0');
            i++;
            if(result*sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(result*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        
    return (int) result*sign;   
    }
}