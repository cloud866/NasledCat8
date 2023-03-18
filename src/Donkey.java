public class Donkey extends Animal implements Running {
    public Donkey(int age, int weight, String name) {
        super(age, weight, name);
    }

    public void run() {
        System.out.println("Donkey is running");
    }

//    public void train() {
//        for (int i = 0; i < 3; i++) {
//            run();
//        }
//    }
}
