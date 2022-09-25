public class lesson1 {
    public static void main(String[] args) {

        int w = 365;

        int a = w / 100; // 3
        System.out.println(a);

        int b = (w - (a * 100))/10; ///6
        System.out.println(b);

        int c = w - a * 100 - b * 10;
        System.out.println(c);

    }
}
