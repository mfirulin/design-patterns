import java.util.concurrent.atomic.AtomicLong;

public class Singleton {
    private static volatile Singleton instance;
    private AtomicLong counter = new AtomicLong();
    
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public long getCounter() {
        return counter.incrementAndGet();
    }
}
