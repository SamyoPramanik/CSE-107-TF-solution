# Question 1

## a.

Abstraction is a fundamental concept in object-oriented programming (OOP) that involves simplifying complex reality by modeling classes based on their essential characteristics. It allows you to hide the complex implementation details and expose only the necessary features to the outside world. [Abstruction example](/2020-21/A/1a.cpp)

**Properties of Abstruct class**
1. Can not be instantiated

2. May contain abstruct and regular methods

3. May contain member variable

4. Used for polymorphism

**Properties of Abstruct method (also known as virtula function)**
1. Declared but not implemented

2. Must be overridden

3. Forces Polymorphism

4. Cannot be called directly

---
## b.
**Inline Function**
>An inline function in programming is a feature that allows the compiler to insert the entire body of a function directly into the calling code, rather than generating a separate function call. This is done to improve performance by reducing the overhead of function calls. In other words, when a function is marked as "inline," the compiler treats it as a request to replace the function call with the actual function code.

**Inline function is a request not a command**
>The statement **"inline function is a request, not a command"** highlights the fact that when we declare a function as inline in C++, we are suggesting to the compiler that it should consider inlining the function's code at the call site. However, the compiler has the final say in whether it actually performs the inlining or not. In other words, marking a function as inline does not guarantee that the compiler will inline it; it is merely a suggestion.
---
## c.
Find complete [code](/2020-21/A/1c.cpp) here

```c++
class tollbooth
{
private:
    string regNumber[100];
    unsigned int totalCars;
    double totalMoney;

public:
    // getter
    unsigned int getTotalCars()
    {
        return totalCars;
    }

    double getTotalMoney()
    {
        return totalMoney;
    }

    // constructor
    tollbooth()
    {
        totalCars = 0;
        totalMoney = 0;
    }

    // to add a car who paid the toll
    void payingCar()
    {
        totalCars++;
        totalMoney += 0.5;
    }

    // to add a car who didn't pay the toll
    void nopayCar()
    {
        totalCars++;
    }

    void display()
    {
        cout << "Car registration numbers: " << endl;

        for (int i = 0; i < totalCars; i++)
        {
            cout << regNumber[i] << endl;
        }

        cout << "Total cars: " << totalCars << endl;
        cout << "Total money: " << totalMoney << endl;
    }
};
```
---

# Qusetion 2

## a.

If we write the second function as 
```c++
 void space(char ch, int count = 10){}
 ```

We will lose the **power of default argument** if we want to access the functions using function pointer.

---
## b.
[solution](/2020-21/A/2b.cpp)

---
# Question 3

## a.
**Early Binding (Static Binding):** Function call is linked to its implementation during compile-time. Efficient and has no runtime overhead. Used in statically-typed languages for normal function calls.
[example](/2020-21/A/3a_1.cpp)

**Late Binding (Dynamic Binding):** Function call is determined at runtime based on object's actual type or class. Associated with polymorphism and allows flexibility. Slightly slower due to runtime lookup. Used with polymorphism, virtual functions, and inheritance in languages like C++ or Java.
[example](/2020-21/A/3a_2.cpp)

---
## b.

[Solution](/2020-21/A/3b.cpp)

---
## c.

inserter
```c++
friend istream &operator>>(istream &stream, inventory &i)
    {
        stream >> i.item >> i.onhand >> i.cost;
        return stream;
    }
```

extractor
```c++
friend ostream &operator<<(ostream &stream, inventory &i)
    {
        stream << i.item << " " << i.onhand << " " << i.cost;
        return stream;
    }
```
[Complete code](/2020-21/A/3c.cpp)

---
## d.
The function will be:
```c++
ostream &setup(ostream &stream)
{
    stream << setprecision(6) << setfill('%') << setw(10) << left;
        return stream;
}
```

**setpricision(6):**\
sets the total digit (before and after decimal point) to 6

**setw(10):**\
to set the length to 10

**setfill('%'):**\
fills the empty position with '%'

**left:**
means the number will be left assigned and the empty position at right will be filled with setfill character

Detailed [code](/2020-21/A/3d.cpp)

---
# Question 4
## a.
[solution](/2020-21/A/4a.cpp)

---
## b.
[solution](/2020-21/A/4b.cpp)

---
