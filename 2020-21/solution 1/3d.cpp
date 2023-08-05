#include <iostream>
#include <iomanip>
using namespace std;

ostream &setup(ostream &stream)
{
    stream << setprecision(6) << setfill('%') << setw(10) << left;
    return stream;
}

int main()
{
    cout << setup << 123.45678 << endl;
}