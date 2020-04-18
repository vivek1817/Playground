#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,c,i;
    std::cin>>n;
  for(i=1;i<n-1;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  std::cout<<c;
}