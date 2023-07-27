public class BadCalc {

    public int mult(int num1, int num2) {
        return num1 * num2;
    }


    public int div(int num1, int num2) throws ArithmeticException{
        return num1 / num2;
    }

    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        System.out.println("Mult result: " + bc.mult(2, 3));
        try {
            // Something that may throw an exception
            System.out.println("Div result: " + bc.div(6, 0));
        } catch (ArithmeticException ae) {
            // Do something about the exception if one is raised
            System.out.println("Calculation error caught");

        }    }

}
