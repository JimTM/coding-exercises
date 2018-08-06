public class Main {

  public static void main(String [] args) {
    String expression = "([A-Z)(.+)";
    Basic basic = new Basic();
    if( basic.areValidGroups(expression) ) {
      System.out.println("valid");
    } else {
      System.out.println("not valid");
    }    
  }
}