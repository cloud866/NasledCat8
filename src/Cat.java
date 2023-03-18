public class Cat extends Animal implements Domestic {

    public Cat() {
        super(2, 3, "SomeCat");
    }
    public Cat(int age, int weight, String name) {
        super(age, weight, name);
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
