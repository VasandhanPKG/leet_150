class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<String>();
        dfs(res,0,0,"",n);
        return res;


        
    }
    public void dfs(List<String> res, int open_brac, int close_brac,String s, int n )
    {
        if(s.length()==n*2)
        {
            res.add(s);
            return;
        }
        if(open_brac<n)
        {
           dfs(res,open_brac+1,close_brac,s+"(",n);
        }
        if(close_brac<open_brac)
        {
            dfs(res,open_brac,close_brac+1,s+")",n);  
        }
    }
}