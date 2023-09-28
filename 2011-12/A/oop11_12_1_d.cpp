#include<iostream>
using namespace std;


    int f1(int x){
        
        return x*x;
    }

    double f1(double x){
        
        return x*x;
    }


int main(int argc, char const *argv[])
{
    
    int (*fp1)(int) = &f1;
    cout<<fp1(10)<<" address of f1(int); "<<(void*)fp1<<endl;//100 address of f1(int); 0x102adf074

    double(*fp2)(double) = &f1;
    cout<<fp2(2.34)<<" address of f1(double); "<<(void*)fp2<<endl;//5.4756 address of f2(double); 0x102adf090
    
    return 0;
}
