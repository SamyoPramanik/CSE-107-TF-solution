//run time polymorphism(dynamic binding/late binding) example 
#include <iostream>
using namespace std;
class shape
{

public:
    shape() {}

    virtual void draw()
    {
        cout << "shape::draw() called drawing nothing" << endl;
    }
};
class square : public shape
{
protected:
    int length;

public:
    square() {}
    square(int a)
    {
        length = a;
    }
    //function override
    virtual void draw()
    {
        cout << "square::draw() called"
             << " drawing: length = " << length << endl;
    }
};

class rectangle : public square
{
protected:
    int width;

public:
    rectangle() {}
    rectangle(int a, int b)
    {
        length = a;
        width = b;
    }
     //function override
    virtual void draw()
    {
        cout << "rectangle::draw() called"
             << " drawing: length = " << length << " width = " << width << endl;
    }
};

int main(int argc, char const *argv[])
{
    shape shape1;
    rectangle rect1(5, 4);
    square sq1(5);


    shape *shape_ptr[] = {&shape1, &rect1, &sq1};
    for (auto it : shape_ptr)
    {
        it->draw();
    }

    //alternative
   //using reference
    shape &ref = rect1;
    ref.draw();//rectangle::draw() called drawing: length = 5 width = 4
    

    /*
    output:
    shape::draw() called drawing nothing
    rectangle::draw() called drawing: length = 5 width = 4
    square::draw() called drawing: length = 5
    */

    return 0;
}

/*
details and brief description in readme19-20PartB-7_a.txt file
*/
