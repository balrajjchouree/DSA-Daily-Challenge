class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int partStartIdx = s.indexOf(part);

            s = s.substring(0, partStartIdx) + s.substring(partStartIdx + part.length());
        }

        return s;
    }
}