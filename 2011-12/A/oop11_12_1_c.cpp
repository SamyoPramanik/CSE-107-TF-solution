#include<iostream>

using namespace std;
int x;
int& f(){
    return x;
}


int main(int argc, char const *argv[])
{
    x = 10;
    cout<<x<<endl;
    
    f() = 100;
    cout<<x<<endl;
    return 0;
}
