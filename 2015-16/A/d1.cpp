#include <iostream>
using namespace std;

class Vector
{
    int x, y, z;
public:
    Vector(int x = 0, int y = 0, int z = 0)
    {
        this->x = x;
        this->y = y;
        this->z = z;
    }
    Vector friend operator + (int n, Vector v)
    {
        Vector temp;
        temp.x = n + v.x;
        temp.y = n + v.y;
        temp.z = n + v.z;
        return temp;
    }
    Vector operator += (const Vector& v)
    {
        x += v.x;
        y += v.y;
        z += v.z;
        return *this;
    }
    friend ostream& operator << (ostream& out, const Vector& v)
    {
        out << v.x << " " << v.y << " " << v.z;
        return out;
    }
};

int main()
{
    Vector v1(1, 2, 3), v2(4, 5, 6);
    v1 += (10 + v2);
    cout << v1 << endl;

    return 0;
}