i. Why an inserter function is implemented using a friend function?

-->
In C++, an overloaded inserter function (often called the << operator overload for output) is commonly implemented 
using a friend function when we want to achieve a specific type of functionality. 
The << operator is typically used for streaming output in C++. When we want to customize how our user-defined 
class objects are printed to a stream using cout, we can overload the << operator for our class. 
This allows us to define how instances of our class should be printed when they are output using the << operator.

In the given code snippets if we don't define friend function rather define it  as a like any other methods in the class,
 it will generate error in huge scale.

-----class without friend function-------
class myclass {
public:
    int x,y;

    MyClass(int x, int y){ this->x = x; this->y = y;} 

    // Overloaded << operator as a member function
    ostream& operator<<(std::ostream& COUT) {
        COUT << "x: "<<x<<"y: "<<y << data;
        return COUT;
    }
};
--------*******------

In this example, we overload the << operator as a member function of the myclass class. However, 
there's an issue with this approach: the operator is a binary operator, which means it operates on two operands. 
In this case, it should be used like this:

----cpp code---
myclass obj(120,130);
cout << obj;  // This will not work as expected
---***---

This code won't work as expected because the << operator expects a left-hand operand of type 'ostream', 
and the right-hand operand is an instance of `myclass`. To make this work, we would need to use a friend function as above mentioned
code in question.



In summary, we use a friend function to overload the << operator for a class 
when we need it to access the private members of the class and when it makes more sense 
for the operator to be a friend function rather than a member function. This approach provides encapsulation 
while allowing us to customize the output format for our class objects.
                                        -------x----

ii. What is the advantage of using “out” instead of “cout” inside the inserter function?

-->
we make our inserter function more versatile. Instead of hardcoding the output to cout, 
we allow users to specify any output stream they want. This means we can use the same << operator to output 
our class objects to different streams like cout, std::ofstream (for file output), or any other stream 
that derives from std::ostream.

                                    -------X------