package j;

public class TestBlueException {
    public static void test() throws BlueException {
        System.out.println("test");
        throw new BlueException("blueException");
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (BlueException e) {
            System.out.println(e.getMessage());
        }
    }
}

