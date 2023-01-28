public class Home {

    public static void main(String[] args) {
//        1
        foo(1);
        a();
        System.out.println("main");
    }

    public static void a() {
//        2
        b();
        System.out.println("метод а");
    }

    public static void b() {
//        3
        c();
        System.out.println("метод б");
    }

    public static void c() {
//        4
        System.out.println("метод c");
    }

    public static long foo(long k) {
        if (k < 10) {
            System.out.println(k + 1);
            foo(k + 1);

        }return k;
    }
}