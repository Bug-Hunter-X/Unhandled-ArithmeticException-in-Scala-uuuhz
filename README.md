# Unhandled ArithmeticException in Scala

This repository demonstrates a common coding error in Scala: an unhandled `ArithmeticException` caused by division by zero. The code includes a `MyClass` with a `myMethod` which performs division. If the divisor is 0 it throws an `ArithmeticException`. The `bug.scala` file shows this error. The `bugSolution.scala` file shows the corrected code.

## How to Reproduce

1. Clone this repository.
2. Compile and run `bug.scala`.  The program will crash with an `ArithmeticException`.
3. Compile and run `bugSolution.scala`. This version handles the exception gracefully.

## Solution

The solution involves adding exception handling (using `try-catch`) to prevent the program from crashing when division by zero occurs.