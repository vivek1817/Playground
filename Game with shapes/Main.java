#include<iostream>
using namespace std;
int main()
{
  int r,h;
  std::cin>>r>>h;
  if(r*2==h)
  {
    std::cout<<"circle can be inside a square";
  }
  else
  {
    std::cout<<"circle cannot be inside a square";
  }
}