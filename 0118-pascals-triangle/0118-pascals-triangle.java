class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans  =  new ArrayList<>();
    for(int i=0;i<numRows;i++) {
        List<Integer> row = new ArrayList<>();
       row.add(1);
       if(i>0) {
          List<Integer> prev = ans.get(i-1);
        for(int j=0; j<prev.size()-1 ; j++) {
            row.add(prev.get(j) + prev.get(j+1));
        }
        row.add(1);
       }
        ans.add(row);
    }
    return ans;   
    }
}