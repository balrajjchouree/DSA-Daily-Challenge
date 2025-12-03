class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length(), cnt = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ')'){
                cnt--;
            }

            if(cnt > 0){
                str.append(s.charAt(i));
            }

            if(s.charAt(i) == '('){
                cnt++;
            }
        }

        return str.toString();
    }
}