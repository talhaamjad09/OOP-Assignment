public class Triangle {
    // Attributes
    private double side1;
    private double side2;
    private double side3;

    // Default Constructor
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Parameterized Constructor
    public Triangle(double side1, double side2, double side3) {
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println(1, 1, 1));
            this.side1 = 1.0;
            this.side2 = 1.0;
            this.side3 = 1.0;
        }
    }
