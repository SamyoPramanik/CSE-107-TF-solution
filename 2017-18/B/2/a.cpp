#include<iostream>
#include<fstream>
using namespace std;

class Complex{
public:
    int real,imag;
    Complex(int r=0,int i=0);
    Complex operator+(const Complex &);
    Complex operator+(int);
    friend Complex operator+(int,const Complex &);
    Complex operator++();
    Complex operator++(int);
    Complex operator()(int);
    friend ostream &operator<<(ostream &,const Complex &);
};

Complex::Complex(int r,int i){
    real = r;
    imag = i;
}

Complex Complex::operator+(const Complex &c){
    Complex temp;
    temp.real = real + c.real;
    temp.imag = imag + c.imag;
    return temp;
}

Complex Complex::operator+(int i){
    Complex temp;
    temp.real = real + i;
    temp.imag = imag;
    return temp;
}

Complex operator+(int i,const Complex &c){
    Complex temp;
    temp.real = c.real;
    temp.imag = c.imag+i;
    return temp;
}

Complex Complex::operator++(){
    real++;
    imag++;
    return *this;
}

Complex Complex::operator++(int){
    Complex temp = *this;
    real++;
    imag++;
    return temp;
}

Complex Complex::operator()(int i){
    Complex temp;
    temp.real = real + i;
    temp.imag = imag + i;
    return temp;
}

ostream &operator<<(ostream &out,const Complex &c){
    out<<c.real<<" + "<<c.imag<<"i"<<endl;
    return out;
}


int main(){
    Complex comp1(10,20),comp2(30,10),comp3;

    cout<<comp1<<comp2<<comp3;
    
    comp3=comp1+comp2;
    cout<<comp3;
    comp3=comp1+10;
    cout<<comp3;
    comp3=10+comp1;
    cout<<comp3;
    comp3++;
    cout<<comp3;
    ++comp3;
    cout<<comp3;
    comp3=comp1(5);
    cout<<comp3;
}