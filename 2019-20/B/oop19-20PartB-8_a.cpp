#include <iostream>
using namespace std;

class Fraction
{
    int x, y;

public:
    Fraction(int a, int b)
    {
        x = a;
        y = b;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    // preincreament operator overloading
    friend Fraction operator++(Fraction &f)
    {
        Fraction temp(f.x, f.y);
        f.x++;
        f.y++;

        return temp;
    }
};

int main()
{
    /* code */
    Fraction n(3, 7);
    ++n;
    cout << "x/y: " << n.getX() << "/" << n.getY() << endl;
    return 0;
}
