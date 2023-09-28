#include <iostream>
using namespace std;

class B; // Forward declaration

class A{
    int x; // private member
public:
    A(int i=0){
        x = i;
    }
    friend void display1(const A, const B); // A global friend function. Also this prototyping is a must to establish the friend connection.
    void display2(const B); // A member of a class
};

class B{
    int y; // private member
public:
    B(int i=0){
        y = i;
    }
    friend void display1(const A, const B); // A global friend function
    friend void A::display2(const B); // A friend function that is a member of anaohter class
};


void display1(const A a, const B b){
    // A friend function has access to the the private members of the class of which it is friend to
    cout << a.x << " " << b.y << endl;
}

void A::display2(const B b){
    // Particularly in this case it can access the provate contents of class B since it's a friend to this class
    cout<< this->x << " " << b.y << endl;
}

int main(){
    A a(10);
    B b(20);
    
    // Deomonstration of global friend function
    display1(a,b); // "10 20"
    //a.display1(b) or b.display1(a) not allowed since it is not a member function of either of those to classs

    // Demonstration of a friend function that is a member function of another class
    a.display2(b); // "10 20"
    //b.display2(a) not allowed since it is not a member function of class B

    return 0;
}


/*
    Output: 
        10 20
        10 20
*/


/*
    Questiom:   "A friend function can be a global function not related to any particular class.
                A friend function can also be a member of another class." - Explain this statement 
                with appropriate examples.

    Answer:     Follow thourgh the given example and mention the key points from the comments provided. 

*/


/*
    A note on "Forward declaration"
    Forward declaration is used when we want to declare a class before it is defined.
    This is useful in cases where we want to declare a friend function of a class before the class is defined.

    Friendship Declaration: Both A and B need to be friends of each other to allow the "display1" and "display2" functions to access their private members. Without the forward declaration, the compiler wouldn't know about the existence of class B when processing the friend declaration in class A, and vice versa.
*/