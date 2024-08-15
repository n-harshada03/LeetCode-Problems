class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character> st =new Stack<>();

        char[] charArray=s.toCharArray();

        String str="";
        
            for(char ch:charArray){
                if(ch=='('){
                    if(!st.isEmpty()){
                        str=str+ch;
                    }
                    st.push(ch);
                }
                if(ch==')'){
                    st.pop();
                    if(!st.isEmpty()){
                        str=str+ch;
                    }
                }
            }

        return str;
        
    }
}