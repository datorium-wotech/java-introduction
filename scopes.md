### Example with variable scopes in `if` blocks

```java
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
```

### Example with method variable scopes

```java
public class Main {

  static int sharedValue = 200;

  public static void main(String[] args) {
    int mainValue = 14;
    System.out.println(mainValue);
    firstMethod();
    secondMethod();
  }

  public static void firstMethod() {
    int firstValue = 50;
    System.out.println(sharedValue);

  }

  public static void secondMethod() {
    int secondValue = 120;
    System.out.println(secondValue);
  }
}
```
