```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == 0) {
      throw new ArithmeticException("Division by zero")
    } else {
      x / y
    }
  }
}

val myObject = new MyClass(10)
println(myObject.myMethod(0)) 
```