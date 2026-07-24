class Calculator
{
    // static variable stores the number of objects created and is shared among all objects of the class
    static int count = 0;

    // constructor - name is same as class name and it is used to initialize the object of the class
    Calculator()
    {
        count++;
    }

    // Overloaded methods
    int add(int a, int b)
    {
        return a + b;
    }

    double add(double a, double b)   // double is used for decimal values, therefore a and b can be used again
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    // static method - can be called without creating an object of the class
    static void displayCount()
    {
        System.out.println("Objects created: " + count);
    }
}

public class Sharik
{
    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        System.out.println("Addition of two integers: " + c1.add(10, 20));
        System.out.println("Addition of two doubles: " + c1.add(12.5, 20.5));
        System.out.println("Addition of three integers: " + c1.add(1, 2, 3));

        Calculator.displayCount();
    }
}