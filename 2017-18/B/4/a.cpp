#include<iostream>
using namespace std;

template <class T>
class myCalculator {
    T a, b;
public:
    myCalculator(T a, T b) {
        this->a = a;
        this->b = b;
    }

    T add() {
        return a + b;
    }

    T subtract() {
        return a - b;
    }

    T multiply() {
        return a * b;
    }

    T divide() {
        return a / b;
    }

    void displayResult() {
        cout << "Numbers are: "<< a << " and " << b <<".\n";
        cout << "Addition is: " << add() << endl;
        cout << "Subtraction is: " << subtract() << endl;
        cout << "Product is: " << multiply() << endl;
        cout << "Division is: " << divide() << endl << endl;
    }
};

int main() {
    myCalculator<int> intCalc(7, 4);
    myCalculator<float> floatCalc(3.4, 6.2);

    cout << "Int results:" << endl;
    intCalc.displayResult();

    cout << "Float results:" << endl;
    floatCalc.displayResult();

    return 0;
}
