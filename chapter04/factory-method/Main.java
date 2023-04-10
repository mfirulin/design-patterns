public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza();
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println();
        pizza = chicagoStore.orderPizza();
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
