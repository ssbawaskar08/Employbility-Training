public class Q30 {
    public static void main(String[] args) {
        int arr [] = {-2,-3,4,-1,-2,1,5,-3};
        int cs=0,ms=0; 
        for(int i=0;i<arr.length;i++){
            cs= cs+arr[i] <0 ? 0:arr[i]+cs;
            ms=Math.max(cs, ms);
        }
        System.out.println(ms);
    }
}
