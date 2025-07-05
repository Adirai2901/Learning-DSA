class Solution {
    public String concatHex36(int n) {
         int square = n * n;
        int cube = n * n * n;

        String hex = Integer.toHexString(square).toUpperCase();    
        String base36 = Integer.toString(cube, 36).toUpperCase();   

        return hex + base36;
    }
}