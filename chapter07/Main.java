public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
            new MallardDuck(),
		    new TurkeyAdapter(new WildTurkey())
        };

        for (var duck: ducks) {
            testDuck(duck);
        }
    }

    private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
