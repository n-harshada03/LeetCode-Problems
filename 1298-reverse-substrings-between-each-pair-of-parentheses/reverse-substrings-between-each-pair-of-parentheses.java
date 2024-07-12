class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
       
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                StringBuilder sb=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='('){
                    
                    sb.append(st.pop());

                }   
                st.pop();
                for(int j=0;j<sb.length();j++){
                    // Stack<Integer> st1=ne Stack<>();
                    st.push(sb.charAt(j));
                }


            }
            else{
                st.push(s.charAt(i));
            }
            
            
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();

        
        
    }
}