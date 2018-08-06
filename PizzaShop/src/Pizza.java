
public class Pizza {
  private Cheese cheese;
  private Sauce sauce;
  private PizzaSize pizzaSize;
  private String customIngredients;
  private String name;

  public void setCheese(Cheese cheese) {
    this.cheese = cheese;
  } 

  public void setSauce(Sauce sauce) {
    this.sauce = sauce;
  }

  public void setPizzaSize(PizzaSize pizzaSize) {
    this.pizzaSize = pizzaSize;
  }

  public void setCustomIngredients(String customIngredients) {
    this.customIngredients = customIngredients;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}