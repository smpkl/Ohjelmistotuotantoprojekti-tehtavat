public class Calculator {

    private double result;    // Variable for the result

    public void reset() {  // Resets the result variable
        result = 0;
    }

    public double getResult() {
        return result;
    }

    public void add(double n) {
        result = result + n;
    }

    public void subtract(double n) {
        result -= n;
    }

    public void multiply(double n) {
        result *= n;
    }

    public void divide(double n) {
        if (n == 0) throw new ArithmeticException("Cannot divide by zero");
        result = result / n;
    }

    public void square(double n) {
        result = Math.pow(n, 2);
    }

    public void squareRoot(double n) {
        if (n <= 0) throw new ArithmeticException("Square root of negative number is not a real number");

        // Not sure what to do here.
        // Method name indicates to square root of 'result' so:
        //  result = Math.sqrt(result);

        // But method takes parameter. So I guess that the method is meant to
        // calculate the Nth root of result, so:
        //   result = Math.pow(result, 1 / n);

        // ExtraTest indicates this implementation:
        result = Math.sqrt(n);
    }

    public void powerOn() {
        // Initial actions could be placed here
        result = 0;
    }

    public void powerOff() {
        // Final actions could be placed here
    }

}