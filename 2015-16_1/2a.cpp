#include <iostream>
#include <cstring>
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
    Coord cd(1, 3, "first coord");
    Coord cd1(0, 0, "origin");
    Coord cd2 = cd1;
    cout << cd << endl;

    print(cd1);
    print(cd2);
}