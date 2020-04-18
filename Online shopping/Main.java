#include<iostream>
using namespace std;
int main()
{
  int a,b,c,fa,fd,fs,sa,sd,ss,aa,ad,as;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  a=fa-(fa/100*fd)+fs;
  b=sa-(sa/100*sd)+ss;
  c=aa-(aa/100*ad)+as;
  std::cout<<"In Flipkart Rs."<<a;
  std::cout<<"\nIn Snapdeal Rs."<<b;
  std::cout<<"\nIn Amazon Rs."<<c;
  if(a<=b &&a<=c)
  {
    std::cout<<"\nHe will prefer Flipkart";
  }
 else if(b<a && b<c)
  {
    std::cout<<"\nHe will prefer Snapdeal";
  }
  else 
  {
    std::cout<<"\nHe will prefer Amazon";
  }
  
  
}