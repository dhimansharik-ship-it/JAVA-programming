public class Main {
    // Method
    static int square(int number)
    {
        return number * number;
    }

    public static void main(String[] args)
    {
        // Variables
        String name = "phil";
        double salary = 55000.50;
        int age = 43;

        int result = square(6);

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);
        System.out.println("square of 6: " + result);
    }
}

