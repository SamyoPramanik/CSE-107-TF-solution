# Question 5

## a.

**i. ``` int c[][],x```**
>only c is 2D array and x is integer

**ii.``` int [][] c,x```**
>both c and x are 2D integer array

### Two ways to create jagged array [code](./src/Q5a.java)
***way 1***
```java
    int[][] ara = new int[4][];
    ara[0] = new int[1];
    ara[1] = new int[2];
    ara[2] = new int[3];
    ara[3] = new int[2];
```

***way 2***
```java
    int[][] ara2 = { { 0 }, { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
```

---
## b.
**Problems**
1. only problem is you cannot access non-static member from static method
2. you are not allowed to call non-static method from static method
---
## c.
Use variable argumnet concept [code](./src/Q5c.java) here

---

# Qusetion 6

## a.

class c2 be like this [code](./src/Q6a.java)
```java
class c2 extends c1 implements i2 {
    public void f1() {

    }

    public void f3() {
    }

    public void f4() {

    }

    public void f5() {

    }

    void f6() {

    }
} 
```

---
## b.
[solution](./src/Q6b.java)

---
## c.
[solution](./src/Q6c.java)

---
# Question 7

## a.
Use the concept of threading.\
[solution 1](./src/Q7a.java)\
[solution 2](./src/Q7a_2.java)

---
## b.
### Out of syllabus
But if you are interested\
[Solution](./src/Q7b.java)

---
## c.
**Three ways to create Thread**
1. extending `Thread` class [code](./src/Q7c_1.java)
2. implementing `Runnable` interface [code](./src/Q7c_2.java)
3. using lambda expression [code](./src/Q7c_3.java)

---
# Question 8

## a.
**auto-boxing**\
When you assign a primitive value to a reference of a wrapper class, Java automatically converts the primitive to its corresponding wrapper class object. For example:

```java
int primitiveInt = 42;
Integer wrapperInt = primitiveInt; // Auto boxing
```
In the above code, the **int** primitive **42** is automatically boxed into an **Integer** object, making it possible to use **wrapperInt** as an object with additional methods and features of the **Integer** class

**auto-unboxing**\
Similarly, when you assign a wrapper class object to a primitive variable, Java automatically extracts the primitive value from the wrapper object. For example:

```java
Integer wrapperInt = 100;
int primitiveInt = wrapperInt; // Auto unboxing
```
In this code, the `Integer` object `100` is automatically unboxed, and its primitive value is assigned to the `primitiveInt` variable.

**Difference between `HashTable` and `HashMap`**
|HashTable|HashMap|
|---|---|
|1. HashTable is thread safe|1. HashMap is not|
|2. HashTable doesn't allow null key or null value|2. HashMap allows both null keys and null values|
|3. HashTable is slow in performance| 4. HashMap is faster|

---
## b.
[solution](./src/Q8b.java)

---
## c.
[solution](./src/Q8c.java)