public class sum_of_god_numbers {
    public int solution(int n[], int k) {
        int sum = 0;
        int l = n.length;

        for (int i = 0; i < l; i++) {
            if(i >=k && n[i] <= n[i-k]){
                continue;
            }
            if(i+k>l && n[i] <= n[i+k]){
                continue;
            }
            sum += n[i];
        }

        return sum;
    }
}
