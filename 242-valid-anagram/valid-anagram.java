class Solution {
    public boolean isAnagram(String s, String t) {
        char[] array1=s.toCharArray();
        char[] array2=t.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        
        String s1=new String(array1);
        System.out.println(s1);
        String s2=new String(array2);
        System.out.println(s2);

        if(s1.equals(s2)){
            return true;
        }
        else return false;
        
    }
}