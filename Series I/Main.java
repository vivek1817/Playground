#include<iostream>
#include<cmath>
int main()
{
  int n,i;
  float a=0.5,b;
  std::cin>>n;
  std::cout<<a<<" ";
  for(i=0;i<n-1;i++)
  {
    b=a+pow(3,i);
    std::cout<<b<<" ";
    a=b;
  }
}