package lambas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * Prior Java 8
         */
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable1).start();

        /**
         * Java 8 Lambda
         */
        Runnable runnable2 = () -> {
            System.out.println("Inside runnable 2");
        };

        new Thread(runnable2).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 3");
            }
        }).start();

        new Thread(() -> System.out.println("Inside runnable 4")).start();
    }
}
