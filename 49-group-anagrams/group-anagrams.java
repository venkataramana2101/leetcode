class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String , List<String>> v = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            v.computeIfAbsent(key , k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(v.values());
    }
    
}