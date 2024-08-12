class Solution {
    public int reverse(int x) {
        List<Integer> list=new ArrayList<>();
        int sign=1;
        int count=0;
        if(x<0){
            sign =-1;
        }
        int temp=Math.abs(x);
        while(temp>0){
            int digit=temp%10;
            list.add(digit);
            count++;
            temp=temp/10;
        }
        double number =0;
        
        for(int i=0;i<count;i++){
            number=number+(list.get(i)*Math.pow(10,count-i-1));
        }

        double ans=sign*number;

        if(ans>Integer.MAX_VALUE)return 0;
        if(ans<Integer.MIN_VALUE)return 0;
        return (int)ans;
    }
}