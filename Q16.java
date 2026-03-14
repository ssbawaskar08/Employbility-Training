public class Q16 {
    public static int funn(int a,int b){
        if(b-a>0){
            return b + funn(a+2,b-2);
        
        }else {
            return a + b;
        }
        // return a-b;
    }
    public static void main(String[] args) {
        int a = 2, b=6;
        System.out.println(funn(a, b));
    }
}
