#include <iostream>
using namespace std;

int add(int a, int b)
{
    return a + b;
}

int main()
{
    int x, y;
    cin >> x >> y;
    cout << add(x, y) << endl;
}