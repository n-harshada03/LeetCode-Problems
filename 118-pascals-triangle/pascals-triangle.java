import java.util.ArrayList;
import java.util.List;
class Solution {

    public List<Integer> nCr(int n){
        int res=1;
        List<Integer> ansRow=new ArrayList<>();

        ansRow.add(1);

        for(int r=1; r<n; r++){
            res= res * (n-r);
            res= res / r;
            ansRow.add(res);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            result.add(nCr(i));
        }

        return result;
        
    }

    
}