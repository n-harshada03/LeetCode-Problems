class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for (int i:nums){
            set.add(i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:set){
            pq.offer(num);
            if(pq.size()>3){
                pq.poll();
            }
        }
        
        if(pq.size()==2){
            pq.poll();
        }
        return pq.peek();
    }
}