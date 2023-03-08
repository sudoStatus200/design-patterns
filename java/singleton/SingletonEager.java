package java.singleton;

public class SingletonEager {
    // Eagerly initialized
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}