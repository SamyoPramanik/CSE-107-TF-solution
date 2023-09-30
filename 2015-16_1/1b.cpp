#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

ostream &mystyle(ostream &out)
{
    out << right << setw(10) << setprecision(5) << fixed << internal << showpos << hexfloat;
    return out;
}

int main()
{
    for (int i = 0; i <= 100; i++)
        cout << mystyle << i << "     " << log(i) << endl;
}