public class single_num {
    public static int snum(int[] num){

        for(int i = 0 ; i < num.length;i++){
            for(int j = 0 ; j < num.length-1-i;j++){
                if(num[j] > num[j+1]){
                    int temp = num[j+1];
                    num[j+1]= num[j];
                    num[j]= temp;
                }
            }
        }

        for(int i = 0 ; i < num.length-1;i+=2){
            if(num[i]!= num[i+1]){
                return num[i];
            }
        }
        return num[num.length-1];
    }
}
