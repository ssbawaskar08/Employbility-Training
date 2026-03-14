class A {
    void display(){
        System.out.println("Hello A");
    }
}
class B extends A{
    void display(){
        System.out.println("Hello B");
        super.display();    
    }
}
class C extends B{
    void display(){
        super.display();
        System.out.println("Hello C");
    }
}
public class Q15 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
