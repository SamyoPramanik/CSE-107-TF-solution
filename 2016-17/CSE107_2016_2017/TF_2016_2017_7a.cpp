#include <iostream>

using namespace std;


// class MyInt;

// You might try to just normally initialise MyInt(value) and see what happens inside the operator overloading functions

class MyInt{
    int * x;
    public:
    MyInt(int argx){
        x = new int;
        *x = argx;
        // cout << "Constructor called" << endl;
    }

    int getX() const{
        return *x;
    }

    void setX(int argx){
        *x = argx;
    }

    ~MyInt(){
        delete x;
        // cout << "destructor called " << endl;
    }

    MyInt& operator+(MyInt & num){
        MyInt * newInt = new MyInt(*x + *num.x);
        return *newInt;
    }

    MyInt& operator*(int num){
        MyInt *newInt = new MyInt(*x * num);
        return *newInt;
    }

    friend MyInt& operator*(int num, MyInt & customInt);

    MyInt & operator=(MyInt & num){
        *this->x = num.getX();
        // MyInt newInt(*x);
        // its a convention and a good practice to return *this pointer in case of assignment operator overloading
        // thus i changed it
        return *this;
    }
};

MyInt & operator*(int num, MyInt& customInt){
    MyInt * newInt = new MyInt(num * customInt.getX());
    return *newInt;
}


int main(){

    // this are only for testing no need to write these in the script
    MyInt num1(5);

    MyInt num2(6);

    MyInt num3 = num1 + num2;

    cout << num3.getX() << endl;

    MyInt num4 = num1 * 5;

    cout << num4.getX() << endl;

    MyInt num5 = 5 * num2;

    cout << num5.getX() << endl;

    MyInt num6 = num1 = num2;

    cout << num6.getX() << endl;
}
