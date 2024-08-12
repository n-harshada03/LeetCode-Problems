class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        System.out.print(s);
        return fn(0,s.length()-1,s);

        
    }
    public static boolean fn(int start,int end,String s){

        if(start>=end){
            
            return true;
        }
        if(s.charAt(start)!=(s.charAt(end))){
                return false;
        }

        return fn(start+1,end-1, s);


    }
}