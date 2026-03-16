interface Line {
    public void line1();
}
interface Polygon extends Line {
    public void polygon1();
}
class C implements Polygon {
    public void line1(){
        System.out.println("Method of Line");
    }
    public void polygon1(){
        System.out.println("Method of Polygon");
    }
}
public class Q20 {
    public static void main(String[] args) {
        C obj = new C();
        obj.line1();
        obj.polygon1();
    }
}
// java version error