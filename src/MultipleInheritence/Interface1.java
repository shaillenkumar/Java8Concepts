package MultipleInheritence;

public interface Interface1 {
    default void methodA(){
        System.out.println("In Method A"+ Interface1.class);
    }
}
