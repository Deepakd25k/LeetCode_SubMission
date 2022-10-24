class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || jewels.length() == 0 || stones == null || stones.length() == 0) {
           return 0;
}
       HashSet<Character> map = new HashSet<Character>();
        int count = 0;
       for (int i = 0; i < jewels.length(); i++) {
        map.add(jewels.charAt(i));
}
        for (int i = 0; i < stones.length(); i++) {
     if (map.contains(stones.charAt(i))) {
     count++;
}
}
        return count;
    }
}