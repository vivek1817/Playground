#include<iostream>
int main()
{
  int n,i,a=11,b,f,c;
    std::cin>>n;
  b=a*a;
  std::cout<<b<<" ";
  for(i=0;i<n-1;i++)
  {
    f=a+4;
    c=f*f;
    std::cout<<c<<" ";
    a=f;
  }
}