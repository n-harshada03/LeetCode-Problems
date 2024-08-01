class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String str:details){
            char[] charArray=str.toCharArray();
            int tensplace=charArray[11]-'0';
            int onesplace=charArray[12]-'0';
            // System.out.println(charArray[11]+","+charArray[12]);       
            int age=tensplace*10+onesplace;
            if(age>60){
                count++;
            }
        }
        return count;
        
    }
}