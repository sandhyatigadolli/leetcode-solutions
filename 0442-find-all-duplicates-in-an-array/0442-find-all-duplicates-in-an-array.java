class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    ArrayList<Integer> list= new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int num: nums) {
        map.put(num,map.getOrDefault(num,0)+1);
    } 

    for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
        if(entry.getValue() >1) {
        list.add(entry.getKey());
    }  
    }
    return list; 
    }
}