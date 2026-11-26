
# Lesson 01: Java byte Data Type

## 1. What is byte?

`byte` is a primitive data type in Java used to store small whole numbers.

- Size: 8 bits (1 byte)
- Minimum value: -128
- Maximum value: 127

## 2. Syntax

```java
byte variableName = value;
```

## 3. Example

```java
byte age = 20;
byte temperature = -10;
byte marks = 100;

System.out.println(age);
System.out.println(temperature);
System.out.println(marks);
```

## 4. Important Points

- byte stores whole numbers only.
- Its range is -128 to 127.
- Values outside this range cannot be assigned directly to a byte variable.

## 5. Practice Exercises

1. Create a byte variable named `studentAge`.
2. Store -5 in a variable named `temperature`.
3. Store 95 in a variable named `attendance`.
4. Print all three variables.

## 6. Solution

See `ByteExercise.java` in `src/basics/datatypes/`.
