#include <iostream>
using namespace std;

template <class T>
T add(T a, T b)
{
    return a + b;
}

int main()
{
    char c;
    cin >> c;

    // compile does not know which data type to use for T untill callling the function

    if (c == 'i')
    {
        int x, y;
        cin >> x >> y;
        cout << add(x, y) << endl;
    }

    else
    {
        double x, y;
        cin >> x >> y;
        cout << add(x, y) << endl;
    }
}