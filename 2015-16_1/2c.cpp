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
        x = y = 0;
        pointname = NULL;
    }

    Coord(int x, int y, char *name)
    {
        this->x = x;
        this->y = y;
        pointname = new char[strlen(name)];
        strcpy(pointname, name);
    }

    Coord(const Coord &cd)
    {
        this->x = cd.x;
        this->y = cd.y;
        pointname = new char[strlen(cd.pointname) + 1];
        strcpy(pointname, cd.pointname);
    }

    Coord operator=(const Coord &cd)
    {
        this->x = cd.x;
        this->y = cd.y;
        pointname = new char[strlen(cd.pointname) + 1];
        strcpy(pointname, cd.pointname);
        return *this;
    }

    Coord operator+(Coord &c)
    {
        Coord temp;
        temp.x = x = c.x;
        temp.y = y + c.y;
        int len = strlen(pointname) + strlen(c.pointname);
        temp.pointname = new char[len + 1];
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
    }

    friend ostream &operator<<(ostream &out, Coord &c)
    {
        out << "(" << c.x << ", " << c.y << ") ";
        return out;
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
    Coord ob5(6, 8, "first");
    cout << "ob4 = " << ob4 << endl;
    cout << "ob5 = " << ob5 << endl;

    ob1 = ob4 + ob5;
    print(ob1);

    double val = 100 + double(ob5);
    cout << val << endl;

    double value = ob5;
    cout << "value of ob5 = " << value << endl;
}