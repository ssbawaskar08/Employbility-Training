//constructor Overloading
public class Q11 {
    Q11(){
        System.out.println("Hello");
    }
    Q11(int a){
        System.out.println(a);
    }
}
class InnerQ11 {
    public static void main(String[] args) {
        Q11 ob2 = new Q11();
        Q11 ob1 = new Q11(9); 
    }    
}
