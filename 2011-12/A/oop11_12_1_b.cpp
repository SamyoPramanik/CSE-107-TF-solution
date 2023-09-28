#include <iostream>
using namespace std;

class coord
{
    int x, y;

public:
    coord(int i = 0, int j = 0)
    {
        x = i;
        y = j;
    }
    void getxy(int &i, int &j)
    {
        i = x;
        j = y;
    }

    // assume it increases the x and y values by i
    coord &operator+(int i)
    {
        coord temp;
        temp.x = x + i;
        temp.y = y + i;
        return temp;
    }
    friend coord &operator+(int i, coord &obj);
};

coord &operator+(int i, coord &obj)
{
    coord temp;
    temp.x = obj.x + i;
    temp.y = obj.y + i;
    return temp;
}