#include<iostream>
using namespace std;
int main()
{
  int num,x,y,z;
  std::cin>>num;
  x=num%10;
  y=num/1000;
  z=x+y;
  std::cout<<z;
}