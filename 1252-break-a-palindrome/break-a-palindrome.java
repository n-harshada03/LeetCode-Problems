class Solution {
    public String breakPalindrome(String palindrome) {

        int n =palindrome.length();

        int l=0;
        int r=n-1;
        // case 1
        if(n==1){
            return "";
        }

        // case 2
        while (l<r){
            if (palindrome.charAt(l)=='a'){
                l++;
                r--;
            }
            else{
                return palindrome.substring(0,l)+'a'+palindrome.substring(l+1);
            }
        }
        // case 3 "aaaa"
        return palindrome.substring(0,n-1)+'b';
        
    }
}