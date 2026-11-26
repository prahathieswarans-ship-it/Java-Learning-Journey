# Java long Data Type

## 1. Introduction

`long` is a primitive data type in Java used to store large whole numbers.

## 2. Properties

| Property | Value |
|---|---|
| Size | 64 bits |
| Memory | 8 bytes |
| Minimum | -9,223,372,036,854,775,808 |
| Maximum | 9,223,372,036,854,775,807 |
| Decimal values | Not supported |

## 3. Syntax

```java
long variableName = valueL;
```

The `L` suffix identifies a long integer literal.

## 4. Example

```java
long population = 8000000000L;
long websiteViews = 9876543210L;
```

## 5. Arithmetic

```java
long oldVisitors = 5000000000L;
long newVisitors = 2000000000L;

long totalVisitors = oldVisitors + newVisitors;
```

Output: `7000000000`

## 6. Important points

- `long` is a primitive data type.
- It uses 64 bits.
- It stores whole numbers.
- Use `L` for large long literals.
- It has a larger range than `int`.

## 7. Practice

1. Declare a long variable for population.
2. Store a large website visitor count.
3. Add two long values.
4. Calculate a total using long variables.
5. Explain the difference between int and long.
