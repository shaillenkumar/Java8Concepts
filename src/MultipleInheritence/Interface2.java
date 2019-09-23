package MultipleInheritence;

public interface Interface2 extends  Interface1 {
    default void methodB(){
        System.out.println("In Method B");
    }

    default void methodA(){
        System.out.println("In Method A"+ Interface2.class);
    }
}
