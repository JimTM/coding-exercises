import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class Basic {
  
  private Map<Character, Character> openClosePair;
  private Stack<Character> stack;

  public Basic() {
    openClosePair = new HashMap<Character, Character>();
    stack = new Stack<Character>();
    openClosePair.put(')', '(');
    openClosePair.put('}', '{');
    openClosePair.put(']', '['); 
  }
  
  public boolean areValidGroups(String expression) {           
    for(char character : expression.toCharArray()) {
      if(openClosePair.containsKey(character)) {
        if(stack.pop() != openClosePair.get(character)) {
          return false;
        }
      } else if(openClosePair.values().contains(character)) {
        stack.push(character); 
      }
    }
    return stack.isEmpty();
  }
}