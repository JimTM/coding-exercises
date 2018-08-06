public class Main {
  public static void main(String[] args) {
    PizzaShop pizzaShop = new PizzaShop("a name for pizza shop");
    Waitress waitress = new Waitress("Jorge");
    PizzaMaker maker = new HawaiianPizzaMaker();

    pizzaShop.setWaitress(waitress);
    pizzaShop.makeOrder(maker, PizzaSize.MEDIUM);
    System.out.println(pizzaShop.getPizza().getName());
  }
}