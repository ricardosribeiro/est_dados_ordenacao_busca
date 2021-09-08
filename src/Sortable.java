public abstract class Sortable {
    static int count;
    static int entradas;
    static long t1;
    static long t2;

    public static int getCount() {
        return count;
    }

    public static int getEntradas() {
        return entradas;
    }

    public static void start() {
        t1 = System.currentTimeMillis();
    }

    public static void stop() {
        t2 = System.currentTimeMillis();
    }

    public static long getElapsedTimeMillis() {
        return t2 - t1;
    }

    public static long getElapsedTimeSec() {
        return getElapsedTimeMillis() / 1000;
    }


}
