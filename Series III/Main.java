#include<iostream>
int main()
{
  int i,n,a=6,d;
    std::cin>>n;
  std::cout<<a<<" ";
  for(i=1;i<n;i++)
  {
    d=a+5*i;
    std::cout<<d<<" ";
    a=d;
  }
}