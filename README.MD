## example jUnit testing with java
 ```java
class SimpleCalculator(){
    public int sum(int number_one, int number_two){
        return number_one + number_two;
    }    
}
```

> in your folder test
> * test
>   * SimpleCalculatorTest

*** 
in test Class

```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    
    // all tests return void
    @Test
    void twoPlusTwoShouldEqualsFour(){
        // instance of class Calculator
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.sum(2, 2));
    }
}
```