import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Horse horse = new Horse();
//        horse.train();
//        Domestic[] domestic = {
//                new Dog(),
//                new Cat()
//        };
//
//        Dog[] domesticDogs = {
//                new Dog(),
//                new Dog(),
//                new Dog(),
//                new Dog()
//        };
//
//        Cat[] domesticCats = {
//                new Cat(),
//                new Cat(),
//                new Cat(),
//                new Cat()
//        };
//        feedSomeDomesticAnimals(domesticCats);
//        feedSomeDomesticAnimals(domesticDogs);
//        feedSomeDomesticAnimals(domestic);

        Horse horse = new Horse();

        System.out.println(horse.getSaddle());

        Horse.Saddle newSaddle = new Horse.Saddle("New SomeHorse's saddle");
        horse.setSaddle(newSaddle);

        System.out.println(horse.getSaddle());

        Car car = new Car();
        Car car2 = new Car(200);

        Car.Engine engine = car.new Engine(150);

        car2.setEngine(engine);
        car2.getEngine().setSpeed(250);

        System.out.println(car.getCurrentSpeed());
        System.out.println(car2.getCurrentSpeed());
        System.out.println(car.getEngine());
        System.out.println(car2.getEngine());

        class SomeClass {
            public int i;
        }

        SomeClass someClass = new SomeClass();
        someClass.i = 10;

        Car[] cars = {new Car(456), new Car(123)};

        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getEngine().horsepower - o2.getEngine().horsepower;
            }
        };
        Comparator<Car> carComparator2 = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getEngine().horsepower - o1.getEngine().horsepower;
            }
        };

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars, carComparator2);
        System.out.println(Arrays.toString(cars));
    }

    public static void feedSomeDomesticAnimals(Domestic[] animals) {
        for (Domestic animal : animals) {
            animal.eat();
        }
    }
}