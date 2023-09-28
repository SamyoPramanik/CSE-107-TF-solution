#include<iostream>
using namespace std;

class Student{
    protected:
    int roll_num;
    public:
    void set_roll_number(int num){
        roll_num = num;
    }
    void dispalay_number(){
        cout<<roll_num<<endl;
    }
};

class theoretical: virtual public Student{
    protected:
    float maths,physics;

    public:
    void set_marks(float a, float b){
        maths = a;
        physics = b;
    }

    void display_marks(){
        cout<<maths<<endl<<physics<<endl;
    }
};

class Practical: virtual public Student{
    protected:
    float score;
    
    public:
    void set_score(float v){
        score = v;
    }
    void display_score(){
        cout<<score<<endl;
    }
};

class Result: public theoretical, public Practical{
    float result;

    public:
    
    void display_result(){
        result = physics + maths + score;
        cout<<result<<endl;
        dispalay_number();
        display_marks();
        display_score();
    }

    
};

int main(int argc, char const *argv[])
{
    Result std1;
    std1.set_roll_number(2105019);// theoretical::set_roll_number called
    /*
    if virtual base class is not used, then there will be an ambiguity for
    set_roll_number methods, because both theoretical and practical class have
    set_roll_number functions. For getting rid of such kind of ambiguity we can
    use virtual base which helps to inherit just one set_roll_number function
    during multiple inheritance.
    */
    std1.set_marks(89.6,94.78);
    std1.set_score(9);
    std1.display_result();
    return 0;
}
