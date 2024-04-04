### `if`, `else if` and `else`
This is an important, if not the most important structures used in programming.
Officially we call this structure as `conditional branching`, which gives the control to the code block depending on the evaluation of the condition.
This heavily relies on the `true` and `false` values

```java
public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suite, rain coat
    String season = "qwerty";

    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    } else if (season == "spring") {
      System.out.println("Wear a T-shirt!");
    } else if (season == "summer") {
      System.out.println("Wear a swimming suite!");
    } else if (season == "autumn") {
      System.out.println("Wear a rain coat!");
    } else {
      System.out.println("I do not recongnize this season!");
    }

    double temp = -10.23;

    if (temp <= 5) {
      System.out.println("Wear super warm");
    } else if (temp <= 15) {
      System.out.println("Wear warm");
    } else if (temp <= 30) {
      System.out.println("Wear normal");
    } else {
      System.out.println("You need cooling");
    }

  }
}
```
