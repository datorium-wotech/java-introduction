Simple while loop, counting to 10

```java
int i = 1;
    while (i <= 10) {
      // Start action

      System.out.println(i);
      // End action
      i = i + 1;
    }
```

Simple for loop, counting to 10
```java
    for (int i = 1; i <= 10; i = i + 1){
      System.out.println(i);
    }
```

Odd or even number
```java
    System.out.println("Hello world!");

    int i = 1;

    while (i <= 10) {

      String result = ""; 
      if (i % 2 == 0) { //Odd or even
        result = "even";
      } else {
        result = "odd";
      }

      System.out.println(i + " " + result);

      i = i + 1; // i = i + 1;
    }
```

Ducking and counting from 10 to 0
```java

    int amountOfTimesToDuck = 10;
    while (amountOfTimesToDuck != 0) {
      System.out.println("Duck");
      amountOfTimesToDuck = amountOfTimesToDuck - 1;
    }
```
