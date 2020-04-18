#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int tnb,tnr,nrs,nbb;
  float b,c,d,e,f,g,h,j,a;
  std::cin>>tnb>>tnr>>nrs>>nbb;
  a=tnb/6;
  std::cout<<a;
  b=nbb/6;
  f=nbb%6;
  h=f/10;
  j=b+h;
  std::cout<<"\n"<<j;
  c=nrs/j;
  std::cout<<"\n"<<fixed<<setprecision(1)<<c;
  d=tnr/a;
  std::cout<<"\n"<<d;
  if(c>d)
  {
    std::cout<<"\nEligible to Win";
  }
  else
  {
    std::cout<<"\nNot Eligible to Win";
  }
    
  

}