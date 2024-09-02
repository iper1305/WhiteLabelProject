package io.motherlink.sharedData;

public class SharedDataSingleton {
    private static final ThreadLocal<SharedData> SHARED_DATA = new ThreadLocal<>();

    public static SharedData get() {
        if (SHARED_DATA.get() == null) {
            SHARED_DATA.set(new SharedData());
        }
        return SHARED_DATA.get();
    }
}
