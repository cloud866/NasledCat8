public class Horse extends Animal implements Running {
    private Saddle saddle;

    public Saddle getSaddle() {
        return saddle;
    }

    public void setSaddle(Saddle saddle) {
        this.saddle = saddle;
    }

    public Horse() {
        super(5,90, "SomeHorse");
        saddle = new Saddle("SomeHorse");
    }

    public void run() {
        System.out.println(name + " is running");
    }

//    public void train() {
//        for (int i = 0; i < 3; i++) {
//            run();
//        }
//    }

    public static class Saddle {
        String stigma;

        @Override
        public String toString() {
            return "Saddle{" +
                    "stigma='" + stigma + '\'' +
                    '}';
        }

        public Saddle(String stigma) {
            this.stigma = stigma;


        }
    }
}
