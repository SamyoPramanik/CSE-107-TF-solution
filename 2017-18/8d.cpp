#include<iostream>
using namespace std;

class Assignment{
    int x;
    public:
        Assignment(int x){
            this->x = x;
        }
        Assignment& operator=(const Assignment& a){
            this->x = a.x;
            return *this;
        }
        void print(){
            cout<<x<<endl;
        }
};

int main(){
    Assignment a(10);
    Assignment b(20);
    a.print();
    b.print();
    a = b = Assignment(30);
    a.print();
    b.print();
    return 0;
}

/*
    Why the overloaded assignment operator (=) function should return the "this" pointer?
        Answer: The overloaded assignment operator function should return the "this" pointer because it allows chaining of assignment operators.
*/