# 05 – Java Float Data Type

## 1. Introduction

`float` is a primitive data type in Java used to store decimal (floating-point) numbers.

Examples:

- Student percentage: 89.5
- Height: 175.5
- Temperature: 36.6
- Product price: 99.99

Unlike `int` and `long`, which are commonly used for whole numbers, `float` supports decimal values.

## 2. Properties of Float

| Property | Value |
|---|---|
| Data Type | Primitive |
| Size | 32 bits |
| Memory | 4 bytes |
| Precision | Approximately 6–7 significant decimal digits |
| Decimal Values | Supported |
| Default Value (field) | 0.0f |

**Important:** `float` uses approximate binary floating-point representation. Some decimal values cannot be represented exactly.

## 3. Syntax

```java
float variableName = valuef;
```

Example:

```java
float percentage = 89.5f;
float height = 175.5f;
float temperature = 36.6f;
```

### Why do we use `f`?

In Java, decimal literals are treated as `double` by default.

For example:

```java
float marks = 95.5;   // Compilation error
float marks = 95.5f;  // Correct
```

The `f` suffix tells Java that the decimal literal is a `float`.

You can also use uppercase `F`.

## 4. FloatDemo.java

```java
package basics.datatypes;

public class FloatDemo {

    public static void main(String[] args) {

        float studentPercentage = 89.5f;
        float studentHeight = 175.5f;
        float temperature = 36.6f;
        float productPrice = 99.99f;

        System.out.println("Student Percentage: " + studentPercentage);
        System.out.println("Student Height: " + studentHeight);
        System.out.println("Temperature: " + temperature);
        System.out.println("Product Price: " + productPrice);
    }
}
```

### Output

```text
Student Percentage: 89.5
Student Height: 175.5
Temperature: 36.6
Product Price: 99.99
```

## 5. Arithmetic Operations Using Float

Java supports arithmetic operations using `float`.

Example:

```java
float product1 = 99.50f;
float product2 = 149.75f;
float product3 = 250.25f;

float total = product1 + product2 + product3;
float averagePrice = total / 3;

System.out.println("Total Price: " + total);
System.out.println("Average Price: " + averagePrice);
```

### Output

```text
Total Price: 499.5
Average Price: 166.5
```

### Understanding the calculation

Total:

99.50 + 149.75 + 250.25 = 499.50

Average:

499.50 / 3 = 166.50

## 6. Floating-Point Precision

`float` cannot represent every decimal number exactly.

Example:

```java
float result = 0.1f + 0.2f;

System.out.println(result);
```

The result may be close to `0.3`, such as:

```text
0.3
```

or:

```text
0.300000012
```

This happens because floating-point numbers are stored using binary representation.

It is normal floating-point behavior.

**Note:** For financial calculations requiring exact decimal arithmetic, Java provides `BigDecimal`, which we will study later.

## 7. Difference Between int, long and float

| Feature | int | long | float |
|---|---|---|---|
| Size | 32 bits | 64 bits | 32 bits |
| Memory | 4 bytes | 8 bytes | 4 bytes |
| Values | Whole numbers | Large whole numbers | Decimal and whole-number values |
| Suffix | None | L | f |
| Example | 100 | 8000000000L | 89.5f |

## 8. Important Points to Remember

1. `float` is a primitive data type.
2. It uses 32 bits (4 bytes).
3. It supports decimal values.
4. It provides approximately 6–7 significant decimal digits of precision.
5. Decimal literals are `double` by default in Java.
6. Use `f` or `F` to declare a float literal.
7. Floating-point calculations may have small precision differences.

## 9. Practice Exercises

### Level 1 – Basic

1. Declare a `float` variable named `percentage` and assign `89.5f`.
2. Declare a `float` variable named `height` and assign `175.5f`.
3. Declare a `float` variable named `temperature` and assign `36.6f`.
4. Declare a `float` variable named `price` and assign `99.99f`.
5. Print all four variables.

### Level 2 – Intermediate

1. Create three float variables for three product prices.
2. Calculate their total price.
3. Calculate their average price.
4. Print the total and average.

### Level 3 – Understanding

1. How many bits does `float` use?
2. Why do we add `f` after a decimal literal?
3. Can `float` store whole numbers?
4. What happens if you write `float marks = 95.5;`?
5. Why can floating-point calculations sometimes produce small rounding differences?

## 10. Completion Checklist

- [ ] Understand the float data type.
- [ ] Learn its size and precision.
- [ ] Understand the `f` suffix.
- [ ] Create and run `FloatDemo.java`.
- [ ] Complete Level 1 exercises.
- [ ] Complete Level 2 exercises.
- [ ] Answer Level 3 questions.
- [ ] Upload lesson notes and Java programs to GitHub.

---

**Next Lesson:** 06 – Java Double Data Type