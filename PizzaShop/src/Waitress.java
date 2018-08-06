public class Waitress {
  private String name;
  private PizzaMaker pizzaMaker;

  public Waitress (String name) {
    this.name = name;
  }

  public void setPizzaMaker(PizzaMaker pizzaMaker, PizzaSize pizzaSize) {
    this.pizzaMaker = pizzaMaker;
    this.pizzaMaker.defineSize(pizzaSize);
  }

  public Pizza getPizza() {
    return pizzaMaker.getPizza();
  }

  public String getName() {
    return name;
  }
}