public class HelloGoodbye {
    public HelloGoodbye() {

    }

    public static void main(String[] args) {
        String arg0 = args.length > 0 ? args[0] : "friend1";
        String arg1 = args.length > 1 ? args[1] : "friend2";

        System.out.println("Hello " + arg0 + " and " + arg1 + ".");
        System.out.println("Goodbye " + arg1 + " and " + arg0 + ".");
    }
}