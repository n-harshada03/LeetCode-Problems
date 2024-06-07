class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> input=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        for(int num:nums){
            input.add(num);
        }
        helper(input,output);
        return ans;
               
        
    }
    public void helper(List<Integer> input, List<Integer> output){
        if(input.size()==0){
            ans.add(new ArrayList<>(output));
            return;
        }

        List<Integer> op1=new ArrayList<>(output);
        List<Integer> op2=new ArrayList<>(output);

        op2.add(input.get(0));
        List<Integer> newArr = new ArrayList<>(input.subList(1, input.size()));


        helper(newArr,op1);
        helper(newArr,op2);
        
    }
}





// List<List<Integer>> ans =new ArrayList<>();
//         ans.add(new ArrayList<>());

//         // int size=ans.size();
//         for(int num:nums){
//             int size = ans.size();
//             for (int i = 0; i < size; i++) {
//                 List<Integer> newSub = new ArrayList<>(ans.get(i));
                
//                 newSub.add(num);
//                 ans.add(newSub);
//             }

//         }
//         return ans;