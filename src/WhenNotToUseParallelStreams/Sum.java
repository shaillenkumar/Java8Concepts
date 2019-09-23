package WhenNotToUseParallelStreams;

public class Sum {
    int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void performSummation(int input){
        sum += input;
    }
}
