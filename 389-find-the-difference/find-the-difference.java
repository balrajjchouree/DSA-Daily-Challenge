class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        for(char ch : t.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s.toCharArray()){
            count.put(ch, count.get(ch) - 1);
            if(count.get(ch) == 0){
                count.remove(ch);
            }
        }

        return (char)count.keySet().toArray()[0];
    }
}