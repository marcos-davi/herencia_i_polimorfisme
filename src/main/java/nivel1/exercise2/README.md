# Level 1 - Exercise 2: Static and Final Modifiers

This package demonstrates the usage and behavior of `static` and `final` member variables and static vs. non-static methods in Java.

## Class Overview

### `Car.java`
- **Modifiers & Field Rules**:
  - `final static String brand = "Toyota"`: Constant class-level variable shared by all instances, initialized at declaration and immutable.
  - `static String model`: Class-level variable shared across all instances, can be re-assigned.
  - `final int power = 140`: Instance-level constant, fixed per instance.
- **Methods**:
  - `static void brake()`: Class method. Can be invoked directly using `Car.brake()` without creating an instance.
  - `public void accelerate()`: Instance method. Requires a `Car` object to be called.
