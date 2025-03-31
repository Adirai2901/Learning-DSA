public class largest_string {
    public static void main(String args[]){
        String str[] = {"apple","mango","banana"};

        String max = str[0];

        for(int i= 0 ; i < str.length;i++){
           if(max.compareToIgnoreCase(str[i])<0){
            max = str[i];
           } 
        }


        System.out.println(max);
    }
}
