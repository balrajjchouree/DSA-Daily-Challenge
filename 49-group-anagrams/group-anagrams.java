class Solution {
    private String getHash(String str){
        StringBuilder hash = new StringBuilder();
        int[] freq = new int[26];

        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                hash.append(freq[i]);
            }
            hash.append("$");
        }

        return hash.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String key = getHash(strs[i]);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }

        for(List<String> grp : map.values()){
            ans.add(grp);
        }

        return ans;
    }
}