class Solution {
    public boolean isAnagram(String s, String t) {
        char[] array1=s.toCharArray();
        char[] array2=t.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        String s1=new String(array1);
        String s2=new String(array2);

        if(s1.equals(s2)){
            return true;
        }
        else return false;
        
    }
}