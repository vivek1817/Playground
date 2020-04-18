#include<iostream>
using namespace std;
int main()
{
  int i,n,eve=0,odd=0;
  std::cin>>n;
  while(n>0)
  {
    i=n%10;
    if(i%2==0)
    {
      eve=eve+i;
    }
    else
    {
      odd=odd+i;
    }
    n=n/10;
  }
  if(eve==odd)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}
