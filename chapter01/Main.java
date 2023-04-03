public class Main {
    public static void main(String[] args) {

        Duck[] ducks = {
            new MallardDuck(),
            new RedheadDuck(),
            new RubberDuck(),
            new DecoyDuck()
        };

        for (var duck: ducks) {
            duck.swim();
            duck.fly();
            duck.quack();
        }

        var modelDuck = new ModelDuck();
        modelDuck.fly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.fly();
    }
}
