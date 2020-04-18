#include<iostream>
int main()
{
  int a,b,i,n,sum;
  std::cin>>a;
  std::cin>>b;
  for(a=a;a<=b;a++)
  {
    sum=0;
    for(i=1;i<a;i++)
    {
      if(a%i==0)
      {
        sum=sum+i;
      }
    }
    if(sum==a)
    {
      std::cout<<a<<" ";
    }
  }
}
      