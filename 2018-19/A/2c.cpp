#include <iostream>
using namespace std;
class Rational
{
    // numerator and denominator
    int n, d;

public:
    // Constructor(s) to initialize n and d
    Rational()
    {
        n = 0;
        d = 0;
    }
    Rational(int a, int b)
    {
        n = a;
        d = b;
    }
    friend Rational& operator+(int num, Rational& r);
    
    void get()
    {
        cout << n << "/" << d << endl;       
    }
};
Rational& operator+(int num, Rational& r)
    {
        r.n = r.n + num;
        r.d = r.d + num;
        return r;
    }

int main()
{
    Rational r1(1, 2);
    Rational r2 = r1 + 5;
    r2.get();
    Rational r3 = 5 + r1;
    r3.get();
   
}
