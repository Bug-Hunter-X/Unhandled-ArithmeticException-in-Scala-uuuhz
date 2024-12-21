```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    try {
      if (y == 0) {
        0 //or some other default value or throw a custom exception
      } else {
        x / y
      }
    } catch {
      case e: ArithmeticException => {
        println("Error: Division by zero")
        0 //or some other default value
      }
    }
  }
}

val myObject = new MyClass(10)
println(myObject.myMethod(0))
println(myObject.myMethod(2)) 
```