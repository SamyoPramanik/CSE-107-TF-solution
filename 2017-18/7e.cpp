#include<iostream>
using namespace std;

class MyInt{
    int x;
    public:
    MyInt(int x=0){
        this->x=x;
    }
    MyInt operator()(int n=23){
        return MyInt(x*n);
    }
    friend ostream& operator<<(ostream& os, MyInt& obj);
    int getX(){
        return x;
    }
};

ostream& operator<<(ostream& os, MyInt& obj){
    os<<obj.x;
    return os;
}


int main(){
    MyInt obj(10);
    MyInt temp1 = obj(3);
    MyInt temp2 = obj();    // Default arg in works
    cout<<temp1<<endl;
    cout<<temp2<<endl;
}