#include<iostream>
using namespace std;
int main()
{
  int amt,roi,noy;
  float intr,toa,dis=0.02,fta;
  std::cin>>amt>>roi>>noy;
  intr=amt*roi*noy/100;
  toa=intr+amt;
  dis=dis*intr;
  fta=toa-dis;
  std::cout<<intr;
  std::cout<<"\n"<<toa;
  std::cout<<"\n"<<dis;
  std::cout<<"\n"<<fta;
}