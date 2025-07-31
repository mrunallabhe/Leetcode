class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> result=new ArrayList<>();
        dfs(result,"",n);
        return result;
    }
    public void dfs(List<String> result,String current,int n){
        if(current.length()==n){
            result.add(current);
            return;
    }
    dfs(result,current+'1',n);
    if(current.isEmpty() || current.charAt(current.length()-1)!='0'){
        dfs(result,current+'0',n);
    }
    }
}