#include <iostream>
using namespace std;

void space(char ch)
{
    cout << ch << endl;
}

void space(char ch, int count)
{
    for (int i = 0; i < count; i++)
    {
        cout << ch;
    }
    cout << endl;
}

int main()
{
    void (*f1)(char) = space;
    void (*f2)(char, int) = space;

    f1('a');
    f2('b', 5);
}