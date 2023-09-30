#include<iostream>
using namespace std;


int global_x=10;

int& func(){
    return global_x;
}

int main(){
    cout<<func()<<endl; // used as an r-value here
    int x = func()+5; // used as an r-value here
    cout<<x<<endl;
    func() = 20; // used as an l-value here
    cout<<func()<<endl;
    return 0;
}

/*
    When can a function be used both as an I-value and r-value? Explain with an example.
    Answer: When the return type of the function is a reference type, it can be used as both an l-value and an r-value.
*/

