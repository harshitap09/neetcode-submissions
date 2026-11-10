class Solution {
    public boolean isPalindrome(String s) {
        
        String r = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        
        return r.equals(new StringBuilder(r).reverse().toString());
    }
}
