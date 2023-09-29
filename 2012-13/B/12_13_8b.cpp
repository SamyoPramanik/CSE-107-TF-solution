class ClassA;
class ClassB {
public:
    ClassB(int data) : dataB(data) {}

    void displayA(ClassA& objA);
private:
    int dataB;
};

class ClassA {
public:
    ClassA(int data) : dataA(data) {}
    friend void ClassB::displayA(ClassA& objA);
private:
    int dataA;
};

void ClassB::displayA(ClassA& objA) {
    std::cout << "Data in ClassA: " << objA.dataA << std::endl;
}

int main() {
    ClassA objA(10);
    ClassB objB(20);
    objB.displayA(objA);
    return 0;
}
