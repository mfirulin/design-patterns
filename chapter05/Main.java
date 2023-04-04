public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 999; i++) {
                Singleton.getInstance().getCounter();
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Singleton.getInstance().getCounter());
        };
        
        new Thread(task).run();
        new Thread(task).run();
    }
}
