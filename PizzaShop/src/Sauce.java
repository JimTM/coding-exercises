public enum Sauce {
  SAUCE1("sauce1"),
  SAUCE2("sauce2"),
  SAUCE3("sauce3");

  private String name;

  Sauce(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}