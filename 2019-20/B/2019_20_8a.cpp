#include <iostream>

using namespace std;
class Fraction
{
    int x,y;
    public:
    Fraction(int a,int b)
    {
        x=a;
        y=b;
    }
    int getx()
    {
        return x;
    }
    int gety()
    {
        return y;
    }
    void setx(int x)
    {
        this->x=x;
    }
    void sety(int y)
    {
        this->y=y;
    }
    friend Fraction& operator++(Fraction& fr);
};
Fraction& operator++(Fraction& fr)
{
    fr.setx(fr.getx()+1);
    fr.sety(fr.gety()+1);
    return fr;
}
int main()
{
   Fraction n(3,7);
   ++n;
   cout<<n.getx()<<" "<<n.gety()<<endl;
    
}
