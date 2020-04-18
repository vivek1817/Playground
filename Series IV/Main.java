#include<iostream>
using namespace std;
int main()
{
 int i,n,d;
    std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      d=(i*i)-1;
      std::cout<<d<<" ";
    }
    else
    {
      d=(i*i)-2;
      std::cout<<d<<" ";
    }
  }

}