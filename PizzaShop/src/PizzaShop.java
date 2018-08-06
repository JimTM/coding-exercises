
public class PizzaShop {

  private String name;
  private  Waitress waitress;

  public PizzaShop(String name) {
    this.name = name;
  }

  public PizzaShop(String name, Waitress waitress) {
    this.name = name;
    this.waitress = waitress;  
  }

  public void setWaitress(Waitress waitress) { 
    this.waitress = waitress;
  }

  public void makeOrder(PizzaMaker pizzaMaker, PizzaSize pizzaSize) {
    waitress.setPizzaMaker(pizzaMaker, pizzaSize);
  }  

  public Pizza getPizza() {
    return waitress.getPizza();
  }

  public String getName() {
    return name;
  }
}