#include <iostream>
#include <cstring>
using namespace std;

class inventory
{
    char item[40];
    int onhand;
    double cost;

public:
    inventory(char *i, int o, double c)
    {
        strcpy(item, i);
        onhand = o;
        cost = c;
    }

    friend istream &operator>>(istream &stream, inventory &i)
    {
        stream >> i.item >> i.onhand >> i.cost;
        return stream;
    }

    friend ostream &operator<<(ostream &stream, inventory &i)
    {
        stream << i.item << " " << i.onhand << " " << i.cost;
        return stream;
    }
};

int main()
{
    inventory i1("hammer", 5, 12.95);
    inventory i2("wrench", 10, 7.95);

    cin >> i2;

    cout << i1 << endl;
    cout << i2 << endl;
}