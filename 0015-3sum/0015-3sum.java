class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    int n = nums.length;
    if(n<3) {
        return new ArrayList<>();
    }   

    Set<List<Integer>> uniqueValues = new HashSet<>();
    for(int first =0;first<n-2;first++) {
        Set<Long> seenValues = new HashSet<>();
        for(int second=first+1;second<n;second++) {
            long thirdValue =-((long) nums[first]+nums[second]);

            if(seenValues.contains(thirdValue)) {
                List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[first],nums[second],(int) thirdValue));
                Collections.sort(triplet);
                uniqueValues.add(triplet);
            }
            seenValues.add((long)nums[second]);
        }

    } 
    return new ArrayList<>(uniqueValues);
    }
}