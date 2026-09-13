import java.util.Scanner;

class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }

    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imag - c2.imag);
    }

    public static Complex multiply(Complex c1, Complex c2) {
        double r = (c1.real * c2.real) - (c1.imag * c2.imag);
        double i = (c1.real * c2.imag) + (c1.imag * c2.real);
        return new Complex(r, i);
    }

    public void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imag) + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary parts of first number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.print("Enter real and imaginary parts of second number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        System.out.print("Sum: ");
        Complex.add(c1, c2).display();

        System.out.print("Difference: ");
        Complex.subtract(c1, c2).display();

        System.out.print("Product: ");
        Complex.multiply(c1, c2).display();
    }
}