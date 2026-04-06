package FunctionalInterface;


public class FuctionWithRealExample {
    public static <T> T retry(Retryable<T> task, int attempts) {
        Exception lastException = null;

        for (int i = 1; i <= attempts; i++) {
            try {
                return task.excute();
            } catch (Exception e) {
                lastException = e;
                System.out.println("Attempt " + i + " failed");
            }
        }
        throw new RuntimeException("All retries failed", lastException);
    }

    public static void main(String[] args) {

        String result = retry(() -> {
            if (Math.random() > 0.7) {
                return "SUCCESS";
            }
            throw new Exception("Temporary failure");
        }, 5);

        System.out.println(result);
    }



}

