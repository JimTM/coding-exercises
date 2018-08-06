// Pizzas could be of any of the 4 different sizes: Personal, Small, Medium, Large.
public enum PizzaSize {
  PERSONAL("Personal", 1),
  SMALL("Small", 4),
  MEDIUM("Medium", 6),
  LARGE("Large", 8);

  private String name;
  private int slices;

  PizzaSize(String name, int slices) {
    this.name = name;
    this.slices = slices;
  }

  public int getSlices() {
    return slices;
  }

  public String getName() {
    return name;
  }
}