interface InnerQ19 {
    void printA();
}
interface InnerQ19_1 {
    void printB();
}
class C implements InnerQ19,InnerQ19_1{
    public void printA() {
        System.out.println("Print A");
        // printB();
    }
    public void printB() {
        System.out.println("Print B");
    }
}
public class Q19 {
    public static void main(String[] args) {
        C obj = new C();
        obj.printA();
        obj.printB();
    }
}
