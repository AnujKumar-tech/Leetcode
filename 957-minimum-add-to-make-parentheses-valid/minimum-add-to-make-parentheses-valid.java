class Solution {
    public int minAddToMakeValid(String s) {
        int openparen = 0;
        int closeparen = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                openparen++;
            }else if (ch == ')' && openparen > 0 ){
                openparen--;
            }else{
                closeparen++;
            }
        }
        return openparen + closeparen;
    }
}