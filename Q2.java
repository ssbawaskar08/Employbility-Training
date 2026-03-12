class Q2{
    public static int mint(int n, int l, int sum){

        if(l==0){
            return 0;
        }
        sum = sum + n;

        return n + mint(sum-1, l-1, sum);

    }
    public static void main(String[] args) {

        System.out.println(mint(4, 4, 0));
        
    }

}