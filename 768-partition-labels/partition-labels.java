class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> answer = new ArrayList<Integer>();
        int start = 0;
        int end = 0;
        int currentLength = 0;
        //make a table
        int[] table = new int[26];
        Arrays.fill(table, 0);
        for(int i = 0; i<s.length(); i++){
            if(i>table[s.charAt(i)-97])
                table[s.charAt(i)-97] = i; 
        }
        for(int i = 0; i<s.length(); i++){
            int corresEndPosition = table[s.charAt(i)-97];
            if(i>end){
                start = end + 1;
                answer.add(currentLength);
            }
            if(corresEndPosition > end){
                end = corresEndPosition;
            }
            currentLength = end - start + 1;
        }
        answer.add(currentLength);

        return answer;
    }
}