package g.Java8Features;

public class Starter_01_Lambda {
    public static void main(String[] args) {

            Starter_01_Lambda tester = new Starter_01_Lambda();

            /** parameter -> expression body
             *
             */

            MathOperation addition = (int a, int b) -> {return a + b;};
            MathOperation multiplication = (int a, int b) -> a - b;


            System.out.println(tester.operate(4, 3, addition));


        }

    /**
     * Functional interface
     *
     */

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}



