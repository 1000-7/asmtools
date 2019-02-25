package book.ch03;

public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();

        static {
            System.out.println("LazyHolder.<clint>");
        }
    }

    public static final Object getInstance(boolean flag) {
        if (flag) {
            return new SingletonHolder[2];
        }
        return SingletonHolder.INSTANCE;
    }

    private Singleton() {
        init();
    }

    private void init() {}

    public static void main(String[] args) {
        getInstance(true);
        System.out.println("------");
        getInstance(false);
    }
}