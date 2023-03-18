public class Dog extends Animal implements Domestic {

    public Dog() {
        super(2, 3, "SomeDog");
    }

    public Dog(int age, int weight, String name) {
        super(age, weight, name);
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
