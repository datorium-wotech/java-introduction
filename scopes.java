public class Main {
  public static void main(String[] args) {
    System.out.println("Let's go and check out what is in the fridge!");
    var isFridgeOpen = false;
    String result;

    if (isFridgeOpen) {
      var item1 = "Cheese";
      var item2 = "Milk";
      var item3 = "Eggs";
      result = item1 + item2 + item3;
    } else {
      result = "Fridge is closed, open the fridge";
    }

    System.out.println(result);
    // ERROR System.out.println(item1);
  }
}
