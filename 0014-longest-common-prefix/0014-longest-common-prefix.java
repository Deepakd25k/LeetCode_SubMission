class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int shortest = Integer.MAX_VALUE;

        for (String str : strs) {
            shortest = Math.min(shortest, str.length());
        }

        for (int i = 0; i < shortest; i++) {
            char curr = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != curr) {
                    return sb.toString();
                }
            }
            sb.append(curr);
        }
        return sb.toString(); 
    }
}