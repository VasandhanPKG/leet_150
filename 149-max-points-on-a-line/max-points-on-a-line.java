class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<=2) return points.length;
        int max=0;
        int dx=0;
        int dy=0;
       
        
        for(int i=0;i<points.length;i++)
        {
            Map<String,Integer> map=new HashMap<>();
            int duplicates=1;
            int cur_max=0;
            for(int j=i+1;j<points.length;j++)
            {
              dx=points[j][0]-points[i][0];
              dy=points[j][1]-points[i][1];

              if(dx==0 && dy==0)
              {
                duplicates++;
                continue;
              }
              

              if(dx<0) 
              {dx=-dx;
               dy=-dy;
              }

              int gcd=gcd(dx,dy);
              dx/=gcd;
              dy/=gcd;
              

              if(dx==0) dy=1;
              if(dy==0) dx=1;
             
              String slope=dx+"/"+dy;
              map.put(slope,map.getOrDefault(slope,0)+1);
              cur_max=Math.max(cur_max,map.get(slope));



            }
            max=Math.max(cur_max+duplicates,max);
            
        }
        return max;
    }
    int gcd(int a,int b)
    {
        if(b==0 ) return a;
        return gcd(b,a%b);
    }
}