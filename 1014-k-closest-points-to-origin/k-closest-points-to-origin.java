class Solution {
    static class Point implements Comparable<Point>{
            int x;
            int y;
            int sqrtDist;
            int i;

            public Point(int x,int y,int sqrtDist,int i){
                this.x=x;
                this.y=y;
                this.sqrtDist=sqrtDist;
                this.i=i;
            }
            @Override
            public int compareTo(Point p2){
                return this.sqrtDist -p2.sqrtDist;
            }

        }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int sqrtDist=(points[i][0]*points[i][0])+ (points[i][1]*points[i][1]);
            pq.add(new Point(points[i][0],points[i][1],sqrtDist,i));
        }

        int ans[][]=new int[k][];
        for(int i=0;i<k;i++){
            Point point=pq.remove();
            ans[i]=new int[]{points[point.i][0],points[point.i][1]};
        }

        return ans;
    }
}