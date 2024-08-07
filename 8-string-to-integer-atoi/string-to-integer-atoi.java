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
        
            if (result>Integer.MAX_VALUE) {
                return sign == 1?Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
    return (int) result*sign;   
    }
}