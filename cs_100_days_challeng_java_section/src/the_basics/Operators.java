package the_basics;

public class Operators {
    public static void main() {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);


        int multiCalculation = 3 * 4 - 8 / 2 + 15 % 4;
        int multiCalculation2 = (3 * 4 - 8) / 2 + 15 % 4;
        System.out.println(multiCalculation);
        System.out.println(multiCalculation2);

        int c = 5;

        boolean comResult1 = a < b;
        boolean comResult2 = a > b;
        boolean comResult3 = b >= a;
        boolean comResult4 = c <= b;
        boolean comResult5 = c == b;
        boolean comResult6 = c != b;

        System.out.println(comResult1);
        System.out.println(comResult2);
        System.out.println(comResult3);
        System.out.println(comResult4);
        System.out.println(comResult5);
        System.out.println(comResult6);


        System.out.println("++++++++++++++++++++++++");
        boolean logicalResult1 = a > b && a < c;   // true && false => false
        boolean logicalResult2 = a > b || a < c;   // true && false => true
        System.out.println(logicalResult1);
        System.out.println(logicalResult2);

        boolean preResult = a + b > b + c && b * c < a / b;
        System.out.println("preResult is => " + preResult);
    }
}
//Operators
//Operator Precedence
//Arithmetic Operators   => * / % + -
//Relational Operator (or) Comparison   =>  < > <= >= == !=
//Logical Operator => && ||
//Assignment =