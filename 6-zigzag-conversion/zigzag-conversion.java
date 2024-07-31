class Solution {
    public String convert(String s, int numRows) {

        if(numRows==1 || s.length() <= numRows){
            return s;
        }
        

        List<List<Character>> list=new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            list.add(new ArrayList<>());
        }

        int i=0;
        int d=1;

        for(int m=0;m<s.length();m++){
            char ch=s.charAt(m);
            list.get(i).add(ch);

            if(i==0){
                d=1;
            }
            else if(i==numRows-1){
                d=-1;
            }
            i=i+d;
        }

        StringBuilder sb=new StringBuilder();
        for (List<Character> row : list) {
            for (char c : row) {
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}