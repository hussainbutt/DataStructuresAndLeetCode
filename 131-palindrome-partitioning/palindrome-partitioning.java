class Solution {
    public List<List<String>> partition(String s) {
        //if left 
        return getAllParts(s, new ArrayList<String>(), new ArrayList<List<String>>());
    }
    public static List<List<String>> getAllParts(String s, List<String> partition, List<List<String>> answer){
        
        if(s.length() == 0){
            answer.add(new ArrayList<>(partition));
            return answer;
        }
        for(int i = 0; i < s.length(); i++){
            String part = s.substring(0,i+1);
            if(IsPalindrome(part)){
                partition.add(part);
                String remaining = s.substring(i+1);
                getAllParts(remaining, partition, answer);
                //backtrack
                partition.remove(partition.size() - 1);
            }
        }
        return answer;
    }
    public static boolean IsPalindrome(String s){
        int startIndex = 0;
        int lastIndex = s.length()-1;
        int mid = (startIndex + lastIndex)/2;
        for(int i = startIndex; i<=mid; i++){
            if(s.charAt(i) != s.charAt(lastIndex-i)){
                return false;
            }
        }
        return true;
    }
}
