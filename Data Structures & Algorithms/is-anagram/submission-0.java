class Solution {
    public boolean isAnagram(String s, String t) {
        char[] Sarr = s.toCharArray();
        char[] Tarr = t.toCharArray();

        Arrays.sort(Sarr);
        Arrays.sort(Tarr);

        return Arrays.equals(Sarr, Tarr);
    }
}
