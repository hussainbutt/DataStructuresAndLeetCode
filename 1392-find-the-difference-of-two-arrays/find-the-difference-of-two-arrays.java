class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();
        HashSet<Integer> hsRepeated = new HashSet<Integer>();
        for(int i = 0 ; i<nums1.length; i++)
            hs1.add(nums1[i]);
        for(int i = 0 ; i<nums2.length; i++){
            if(hs1.contains(nums2[i]) || hsRepeated.contains(nums2[i])){
                hs1.remove(nums2[i]);
                hsRepeated.add(nums2[i]);
            }
            else{
                hs2.add(nums2[i]);
            }
        }
        List<Integer> list1 = new ArrayList<Integer>();
        list1.addAll(hs1);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(hs2);

        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        finalList.add(list1);
        finalList.add(list2);
        return finalList;
    }
}