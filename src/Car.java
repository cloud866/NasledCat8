public class Car {

    protected Engine engine;
    int currentSpeed;

    public Car() {
        engine = new Engine(123);
    }

    public Car(int horsePower) {
        engine = new Engine(horsePower);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

//    Car(int power) {
//        engine = new Engine(power);
//    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.horsepower +
                '}';
    }

    public class Engine {
        public int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }
        public void increaseSpeed() {
            currentSpeed += 20;
        }

        public void setSpeed (int currentSpeed) {
            Car.this.currentSpeed = currentSpeed;
        }

            @Override
            public String toString() {
                return "Engine{" +
                        "horsepower=" + horsepower +
                        '}';
            }
        }

}
