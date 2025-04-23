public class _169_ {
    public static int majority(int[] num){
        int max = num[0],count = 0 ;

        for(int nums : num){
            if(count == 0){
                max = nums;
            }
            count+= (max == nums)?1:-1;
        }
        return max;
    }
}
