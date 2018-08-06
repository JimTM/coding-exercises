public enum Cheese {
  CHEESE1("cheese1"),
  CHEESE2("cheese2"),
  CHEESE3("cheese2");  

  private String name;

  Cheese(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}