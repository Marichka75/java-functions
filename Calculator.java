public class Calculator {
    
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal. 

        double resultSum = add(5.5, 3.2);
        System.out.println("5.5 + 3.2 = " + resultSum);

        double resultSubtract = subtract(10.5, 4.1);
        System.out.println("10.5 - 4.1 = " + resultSubtract);

        double resultMultiply = multiply(7.0, 2.0);
        System.out.println("7.0 * 2.0 = " + resultMultiply);

        double resultDivide = divide(15.6, 3.0);
        System.out.println("15.5 / 3 = " + resultDivide);
    }

    //Define los métodos basándote en su doc comment.

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */

    public static double add(double number1, double number2) {
        double sum = number1 + number2;
        return sum;
    }
    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */

    public static double subtract(double number1, double number2) {
        double resultSubtract = number1 - number2;
        return resultSubtract;
    }
    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */

    public static double multiply(double number1, double number2) {
        double resultMultiply = number1 * number2;
        return resultMultiply;
    }
    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */
    public static double divide(double number1, double number2) {
        double resultDivide = number1 / number2;
        return resultDivide;
    }

}
