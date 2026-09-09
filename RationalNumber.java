public class RationalNumber {
    int numerator;
    int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Error: Denominator cannot be zero. Setting default value to 1.");
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
        this.numerator = numerator;
    }
    public RationalNumber multiply(RationalNumber r) {
        int num = this.numerator * r.numerator;
        int den = this.denominator * r.denominator;
        return new RationalNumber(num, den);
    }
    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    // Main Method
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(2, 3); 
        RationalNumber r2 = new RationalNumber(4, 5);

        System.out.print("First Rational Number: ");
        r1.display();

        System.out.print("Second Rational Number: ");
      r2.display();       
      
        RationalNumber result = r1.multiply(r2);
        System.out.print("Result of Multiplication: ");
        result.display();
    }
}
