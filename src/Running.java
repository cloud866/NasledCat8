public interface Running {
    void run();
    default void train() {
        for (int i = 0; i < 3; i++) {
            run();
        }
    }
}
