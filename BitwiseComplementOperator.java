public class BitwiseComplementOperator {
    public static void main(String[] args) {
        // Example 1: Complement of a positive number
        int num1 = 100;
        System.out.println("~" + num1 + " = " + ~num1);

        // Example 2: Complement of zero
        int num2 = 0;
        System.out.println("~" + num2 + " = " + ~num2);

        // Example 3: Complement of a negative number
        int num3 = -5;
        System.out.println("~" + num3 + " = " + ~num3);

        // Example 4: Complement of a small positive number
        int num4 = 5;
        System.out.println("~" + num4 + " = " + ~num4);

        // Example 5: Complement of a larger positive number
        int num5 = 200;
        System.out.println("~" + num5 + " = " + ~num5);

        // Example 6: Complement of a large negative number
        int num6 = -1234;
        System.out.println("~" + num6 + " = " + ~num6);
    }
}
