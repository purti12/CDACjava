package abstraction;
public class TestInheritance {
    public static void main(String[] args) {
        StudentInter si;
        si=new Studentimple();
        si.showAge(23);
        si.showName("purti");
        si.course();
        StudentInter.institute();
    }
}
