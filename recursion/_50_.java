public class _50_ {
    class Solution {
        public double myPow(double x, int n) {
            long longN = n;  // Convert n to long to handle overflow
            if (longN < 0) {
                x = 1 / x;
                longN = -longN;
            }
            return power(x, longN);
        }
    
        private double power(double x, long n) {  // Helper method to handle long n
            if (n == 0) {
                return 1;
            }
            double half = power(x, n / 2);  // Recursively calculate half power
            if (n % 2 == 0) {
                return half * half;
            } else {
                return half * half * x;
            }
        }
    }
    
}
