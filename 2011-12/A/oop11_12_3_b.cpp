//formatting using ios members and formatting using manipulators

#include<iostream>
#include<iomanip>
using namespace std;


int main(int argc, char const *argv[])
{
    cout<<setw(10)<<setprecision(4)<<fixed<<setfill('*')<<setiosflags(ios::left)<<123.56789;
    return 0;
}
