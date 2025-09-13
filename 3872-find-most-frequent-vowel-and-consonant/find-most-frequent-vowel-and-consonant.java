class Solution {
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxFreqSum(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
       } 

       int vowel = 0;
       int consonant = 0;

       for(char ch = 'a'; ch <= 'z'; ch++){
            if(isVowel(ch)){
                vowel = Math.max(vowel, map.getOrDefault(ch, 0));
            }
            else{
                consonant = Math.max(consonant, map.getOrDefault(ch, 0));
            }
       }
        return vowel + consonant;
    }
}