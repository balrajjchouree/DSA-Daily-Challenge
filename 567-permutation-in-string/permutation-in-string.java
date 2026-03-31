class Solution {
    private boolean isAnagram(String s1, String s2){
        int[] count = new int[26];

        for(char ch : s1.toCharArray()){
            count[ch - 'a']++;
        }

        for(char ch : s2.toCharArray()){
            count[ch - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n > m){
            return false;
        }

        for(int i = 0; i <= m - n; i++){
            String sub = s2.substring(i, i + n);
            if(isAnagram(sub, s1)){
                return true;
            }
        }

        return false;
    }
}