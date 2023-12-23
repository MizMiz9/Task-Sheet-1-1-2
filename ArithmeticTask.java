
public class ArithmeticTask {

    public static void main(String[] args) {

        int x = 1, y = 2; // result is now 3
        x = x += y;
        System.out.println(x);

        x = x -= 1; // result is now 2
        System.out.println(x);

        x = x *= 2; // result is now 4
        System.out.println(x);

        x = x /= 2; // result is now 2
        System.out.println(x);

        x = x += 8; // result is now 10
        System.out.println(x);

        x = x %= 7; // result is now 3
        System.out.println(x);
    }
}
