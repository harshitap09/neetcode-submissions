class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // map<sorted, list<originals>>
        Map<String, List<String>> map = new HashMap<>();

        for (String original : strs) {

            char[] sorting = original.toCharArray();
            Arrays.sort(sorting);
            String sorted = new String(sorting);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(original);
            }

            else {
                List<String> list = new ArrayList<>();
                list.add(original);
                map.put(sorted, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
