public class HawaiianPizzaMaker extends PizzaMaker {
  private Pizza pizza;

  public HawaiianPizzaMaker() {
    pizza = new Pizza();
    pizza.setName("Hawaiian pizza");
  }

  @Override
  final public void putCheese() {
    pizza.setCheese(Cheese.CHEESE1);
  }

  @Override
  final public void putSauce(){
    pizza.setSauce(Sauce.SAUCE1);
  }

  @Override
  final public void putCustomIngredientes() {
    pizza.setCustomIngredients("putting custom ingredients for hawaiian pizza");
  }

  @Override
  final public void defineSize(PizzaSize pizzaSize){
    pizza.setPizzaSize(pizzaSize);
  }

  @Override
  final public Pizza getPizza() {
    return this.pizza;
  }

  @Override
  final public String bakingTime() {
    return "this pizza takes 5 min to baking";
  }

  @Override
  final public String cuttingTime() {
    return "this pizza takes 20 secs to baking";
  }

  @Override
  final public String boxingTime() {
    return "this pizza takes 30 secs to be boxed";
  }

  @Override
  public String getName() {
    return pizza.getName();
  }
}