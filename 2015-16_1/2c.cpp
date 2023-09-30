#include <iostream>
#include <cstring>
#include <cmath>
using namespace std;

class Coord
{
    int x, y;
    char *pointname;

public:
    Coord()
    {
        cout << "constructing" << endl;
        x = y = 0;
        pointname = NULL;
    }

    Coord(int x, int y, char *name)
    {
        cout << "constructing" << endl;
        this->x = x;
        this->y = y;
        pointname = new char[strlen(name)];
        strcpy(pointname, name);
    }

    Coord(const Coord &cd)
    {
        cout << "copy constructor" << endl;
        this->x = cd.x;
        this->y = cd.y;
        pointname = new char[strlen(cd.pointname)];
        strcpy(pointname, cd.pointname);
    }

    Coord operator+(Coord c)
    {
        cout << "addition" << endl;
        Coord temp;
        temp.x = x = c.x;
        temp.y = y + c.y;
        int len = strlen(pointname) + strlen(c.pointname);
        temp.pointname = new char[len];
        strcpy(temp.pointname, pointname);
        strcat(temp.pointname, c.pointname);

        return temp;
    }

    friend Coord operator+(int i, Coord &c)
    {
        return Coord(i + c.x, i + c.y, c.pointname);
    }

    operator double()
    {
        return sqrt(x * x + y * y);
    }

    ~Coord()
    {
        delete[] pointname;
        cout << "destructed" << endl;
    }

    friend ostream &operator<<(ostream &out, Coord c)
    {
        out << c.pointname << " -> " << c.x << " " << c.y;
    }
};

void print(Coord &cd)
{
    cout << cd << endl;
}

int main()
{
    Coord ob1, ob2, ob3;
    Coord ob4(0, 0, "origin");
    Coord ob5(12, 5, "first");
    ob1 = ob4 + ob5;
    print(ob1);

    ob2 = 100 + ob4;
    print(ob2);

    double value = ob5;
    cout << "value of ob5 = " << value << endl;
}