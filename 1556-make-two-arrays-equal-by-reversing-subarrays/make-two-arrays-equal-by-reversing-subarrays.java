class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length !=arr.length){
            return false;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:target){
            hm.put(num,hm.getOrDefault(num,0)+1);
            }

        for(int a:arr){
            if(!hm.containsKey(a)){
                return false;
            }
            if(hm.get(a)>1){
                hm.put(a,hm.get(a)-1);
            }else {
                hm.remove(a);
            }
        }
        if(hm.isEmpty()){
            return true;
        }
        return false;
    }
}