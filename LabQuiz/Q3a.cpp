#include <iostream>
using namespace std;

class AA
{
public:
    double x, y;

    AA(double a, double b)
    {
        x = a;
        y = b;
    }

    AA(double a)
    {
        AA(a, 1);
    }

    // friend AA &operator=(AA a, AA b);
};

int main()
{
    AA b(5);
    cout << b.x << " " << b.y << endl;
    return 0;
}