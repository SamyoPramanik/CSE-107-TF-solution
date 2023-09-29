#include <iostream>
using namespace std;


class hand {
public:
    int data;
    hand(int data) : data(data) {} // Initialize data in the constructor initializer list
};

class man : virtual public hand {
public:
    man(int data) : hand(data) {} // Call the base class constructor with data
};

class monkey : virtual public hand {
public:
    monkey(int data) : hand(data) {} // Call the base class constructor with data
};

class animal : public man, public monkey {
public:
    animal(int data) : hand(data), man(data), monkey(data) {} // Call all base class constructors with data
};



// In this scenario multiple inheritance and also multilevel inheritance is demostrated
/*

    here in the given scenario if we didn't use the virtual keyword before the access specifier of the base class, 
    we would have two copies of the same hand class inside animal a 
    this would have resulted in ambiguity when we tried to access any member variable or function from a
    which it inherits from base. 
    thus in order to remove this ambiguity we have used the virtual keyword.

*/


int main(){

    animal a(10);

    cout << a.data << endl; // this line becomes ambiguous if you remove the virtual
    // a.man::data; // these lines won't throw any error even if you remove virtual
    // a.monkey::data;
}