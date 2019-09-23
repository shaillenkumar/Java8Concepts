package MultipleInheritence;

public class MultipleInheritenceClient1 implements Interface1,Interface2, Interface3 {

    public void methodC(){
        System.out.println("In Method C"+MultipleInheritenceClient1.class);
    }
    public static void main(String[] args) {
        MultipleInheritenceClient1 mi = new MultipleInheritenceClient1();
        mi.methodA();
        mi.methodB();
        mi.methodC();
    }
}
