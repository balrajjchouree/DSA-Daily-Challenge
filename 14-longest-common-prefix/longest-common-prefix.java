class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);

        String first = strs[0], last = strs[strs.length - 1];

        int n = Math.min(first.length(), last.length());
        for(int i = 0; i < n; i++){
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }

            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
}