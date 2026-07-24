public class WrapperClassSymbi
{
    public static void main(String[] args)
    {
        // Primitive to Wrapper (Autoboxing)

        int num = 100;
        Integer intObj = num;

        double value = 25.75;
        Double doubleObj = value;

        // Wrapper to Primitive (Unboxing)

        int primitiveInt = intObj;
        double primitiveDouble = doubleObj;

        // String to Wrapper

        Integer number = Integer.valueOf("200");
        Double decimal = Double.valueOf("45.5");

        // Wrapper to String

        String str1 = intObj.toString();
        String str2 = doubleObj.toString();

        // Basic Operations

        int sum = intObj + number;
        double product = doubleObj * decimal;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Primitive double: " + primitiveDouble);

        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);

        System.out.println("Converted from String (Integer): " + number);
        System.out.println("Converted from String (Double): " + decimal);

        System.out.println("Integer to String: " + str1);
        System.out.println("Double to String: " + str2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
