
public class Test {

    public static void main(String[] args) {
        System.err.println("Hello Rajesh");
        try {
            demo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demo() throws Exception {

        throw new Exception("Failed");
    }
}
