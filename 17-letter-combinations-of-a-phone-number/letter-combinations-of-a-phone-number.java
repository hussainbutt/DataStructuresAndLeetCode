class Solution {
    public List<String> letterCombinations(String digits) {
        String[] options = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.equals("")) return new ArrayList<String>();
        int inputDigits = Integer.parseInt(digits);
        List<String> output = new ArrayList<String>();
        helperFunction(inputDigits,output,"",options);
        return output; 
        
    }
    public void helperFunction(int inputDigits,List<String> output,String current, String[] options){
        if(inputDigits==0) {
            output.add(current);
            return;
        }
        int digit = inputDigits%10;
        String charsCorresponding = options[digit];
        
        for(int i=0;i<charsCorresponding.length();i++){
            helperFunction(inputDigits/10,output, charsCorresponding.charAt(i)+current,options);
        }

    }
}