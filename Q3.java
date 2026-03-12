// interior wall painting 18 , ext wall painting 12 . 1. number of inter, number of ext, number SA of Inter, , if no. wall 0 then skip, 
import java.util.Scanner;;
class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int interior = sc.nextInt();
        int exterior = sc.nextInt();
        
        float total = 0;
        if(interior !=0){
            for(int i=0;i<interior;i++){
                total += sc.nextFloat() * 18;
            }
        }
        if(exterior != 0){
            for (int i=0;i<exterior;i++){
                total += sc.nextFloat() * 12;
            }
        }
        System.out.printf("Total estimate Cost : %.1f INR",total);
        sc.close();
    }

}