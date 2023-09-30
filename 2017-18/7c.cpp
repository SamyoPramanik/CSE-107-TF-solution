#include<iostream>
using namespace std;

class myclass {
    static int i;  // i had to be a static memeber since static funstions can only use other static members
    int j;

public:
    static void seti(int x) {

        i = x;  // Can't use 'this' pointer to access the static variable
    }

    int geti() {
        return i;
    }
};

int myclass::i = 0;  // Have to initialize the static varaible outside class too


// Just a sample main
int main() {
    myclass::seti(42);  // Call the static member function to set the static member variable
    myclass obj;
    cout << obj.geti() << endl;  // Access the static member using an object
    return 0;
}
