class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> ans = new ArrayList<>();
        int n = strs.length;

        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String str = strs[i];
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String sortedStr = new String(chArr);

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }

        for(List<String> group : map.values()){
            ans.add(group);
        }

        return ans;
    }
}