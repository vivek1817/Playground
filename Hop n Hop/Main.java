#include<iostream>
using namespace std;
int main()
{
  int x,y,z,v;
  std::cin>>x>>y;
  z=x-3;
  v=y-4;
  z>v ?std::cout<<z:std::cout<<v;
}