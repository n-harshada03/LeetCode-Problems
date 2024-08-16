class Solution {
    public String reverseWords(String s) {
        String[] strArray=s.trim().split("\\s+");//trim removes leading and back spaces
        int left=0;
        int right=strArray.length-1;
        
        while(left<right){
            String temp=strArray[left];
            strArray[left]=strArray[right];
            strArray[right]=temp;
            left++;
            right--;

        }

        String ans="";
        for(String word:strArray){
            ans+=word+" ";
        }

        return ans.trim();

           
    }
}