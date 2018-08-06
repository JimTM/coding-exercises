public abstract class PizzaMaker implements PizzaActions {

  public abstract void putCheese();
  public abstract void putSauce();
  public abstract void putCustomIngredientes();
  public abstract void defineSize(PizzaSize pizzaSize);
  public abstract Pizza getPizza();
  public abstract String getName();
}