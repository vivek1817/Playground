#include<iostream>
using namespace std;
int main()
{
  int pa,dtt;
  float m;
  std::cin>>m>>pa>>dtt;
  if(m*pa>=dtt)
  {
  std::cout<<"Can reach";
  }
  else
  {
    std::cout<<"Cannot reach";
  }
}