#include <iostream>
#include <iomanip>
#include<cstring>
#include<map>
using namespace std;
class stdid
{
public:
    string id;
    stdid(string id)
    {
        this->id=id;
    }
//    bool operator() (const stdid& id1) const
//    {
//        return this->id < id1.id;
//    }
    friend ostream& operator<<(ostream& out,stdid stdID);
    friend istream& operator>>(istream& in,stdid& stdID);
};
ostream& operator<<(ostream& out,stdid stdID)
{
    out<<stdID.id;
    return out;
}
istream& operator>>(istream& in,stdid& stdID)
{
    in>>stdID.id;
    return in;
}
class student
{
public:
    string name;
    int age;
    student(string s,int age)
    {
        name=s;
        this->age=age;
    }
    friend ostream& operator<<(ostream& out,student stdnt)
    {
        out<<stdnt.name<<" "<<stdnt.age<<endl;
        return out;
    }
};
class customcmp
{
public:
     bool operator() (const stdid& id1,const stdid& id2) const
    {
        return id1.id<id2.id;
    }
};

int main()
{
    map<stdid,student,customcmp> idstd;
    stdid id1("2105061");
    stdid id2("2105182");
    stdid id3("2105183");
    stdid id4("2105065");
    student s1("Ibtida",22);
    student s2("Mr. Null Ptr Exception",21);
    student s3("Mr. JavaFx",20);
    student s4("Sakif",19);
    idstd.insert(make_pair(id1,s1));
    idstd.insert(make_pair(id2,s2));
    idstd.insert(make_pair(id3,s3));
    idstd.insert(make_pair(id4,s4));
//    cout<<idstd.size()<<endl;
//    for(auto it:idstd)
//    {
//        cout<<it.first<<" "<<it.second<<endl;
//    }
    cout<<"enter stdid: ";
    stdid temp("");
    cin>>temp;
    auto it=idstd.find(temp);
    if(idstd.find(temp)==idstd.end())
    {
        cout<<"NOT FOUND"<<endl;
    }
    else cout<<it->second<<endl;

}
