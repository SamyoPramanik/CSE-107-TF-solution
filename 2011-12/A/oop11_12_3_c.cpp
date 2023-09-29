#include<iostream>
using namespace std;

class inventory{
    char item[40];
    int onhand;
    double cost;

    public:
    inventory(){}
    inventory(char *i, int o, double c){
        strcpy(item,i);
        onhand = o;
        cost = c;
    }

    friend ostream& operator<<(ostream &out, inventory &obj);
    friend istream& operator>>(istream &in, inventory &obj);

};

ostream& operator<<(ostream &out, inventory &obj){
    out<<obj.item<<" "<<obj.onhand<<" "<<obj.cost<<endl;
    return out;
}

istream& operator>>(istream &in, inventory &obj){
    in.getline(obj.item,40);
    in>>obj.onhand>>obj.cost;

    return in;
}

int main(int argc, char const *argv[])
{
    char name[] = "xyz oo";
    int o = 3;
    double c = 6.578;
    inventory inv(name,o,c),inv2;
    cout<<inv;
    cin>>inv2;
    cout<<inv2;
    return 0;
}




