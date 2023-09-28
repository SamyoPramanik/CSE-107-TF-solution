#include<iostream>
using namespace std;


class dyna{
    int *p;

    public:
    dyna(){
        p = new int;
    }
    dyna(int i){
        p = new int(i);
    }
    ~dyna(){
        free(p);//delete p
    }

    dyna(const dyna& original){
        p = new int(*original.p);
    }

    int get(){
        return *p;
    }

    void set(int i){
        *p = i;
    }

};

int neg(dyna obj)
{
    obj.set(obj.get()*(-1));
    return obj.get();
}
int main(int argc, char const *argv[])
{
    dyna dd(10);
    cout<<neg(dd)<<endl;
    
    return 0;
}
