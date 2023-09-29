#include <iostream>
#include <iomanip>
using namespace std;
void space(char ch)
{
    cout<<"space for char is called"<<endl;
    cout<<"char received "<<ch<<endl;
}
void space(char ch,int x)
{
    cout<<"space for char and int is called"<<endl;
    cout<<"received "<<ch<<" "<<x<<endl;
}
int main()
{
   void (*p1)(char)=&space;
   void (*p2)(char,int)=&space;
   p1('a');
   p2('b',5);
}

