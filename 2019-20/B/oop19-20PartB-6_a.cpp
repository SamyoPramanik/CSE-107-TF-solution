#include <iostream>
using namespace std;

// Modified Code
class Frame;

class Photo
{
    int width, length;

public:
    Photo()
    {
        width = 0;
        length = 0;
    };

    Photo(int a, int b)
    {
        width = a;
        length = b;
    };

    int getwidth()
    {
        return width;
    }

    int getlength()
    {
        return length;
    }

    // Modified Code
    friend Frame operator+(const Photo &p, int num);
};

class Frame
{
    int width, length;

public:
    Frame()
    {
        width = 0;
        length = 0;
    };

    Frame(int a, int b)
    {
        width = a;
        length = b;
    };

    int getwidth()
    {
        return width;
    }

    int getlength()
    {
        return length;
    }
};

// Modified Code
Frame operator+(const Photo &p, int num)
{
    return Frame(p.width + num, p.length + num);
}

int main()
{
    Photo P(5, 8);
    Frame F;
    F = P + 2;
    cout << "Frame Width: " << F.getwidth() << endl;
    cout << "Frame Length: " << F.getlength() << endl;
    
    return 0;
}
