#include <iostream>
using namespace std;

// Base class
class Shape {
public:
    // Virtual function for calculating area
    virtual double getArea() const {
        return 0.0;
    }
};

// Derived class for a rectangle
class Rectangle : public Shape {
private:
    double width;
    double height;

public:
    Rectangle(double w, double h) : width(w), height(h) {}

    // Override the virtual function to calculate the area of a rectangle
    double getArea() const override {
        return width * height;
    }
};

// Derived class for a circle
class Circle : public Shape {
private:
    double radius;

public:
    Circle(double r) : radius(r) {}

    // Override the virtual function to calculate the area of a circle
    double getArea() const override {
        return 3.14159 * radius * radius;
    }
};

int main() {
    // Create objects of different shapes
    Rectangle rectangle(4.0, 5.0);
    Circle circle(2.5);

    // Create an array of Shape pointers
    Shape* shapes[] = { &rectangle, &circle };

    // Calculate and display the areas using late binding
    for (Shape* shape : shapes) {
        cout << "Area: " << shape->getArea() << std::endl;
    }

    return 0;
}
