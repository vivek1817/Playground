#include<iostream>
int main()
{
  int n,i,j,k,h;
    std::cin>>n;
  for(i=n;i<=n+3;i++)
  {
    for(j=n;j<=i;j++)
    {
      std::cout<<i;
    }
    std::cout<<"\n";
  }
  for(k=n+3;k>=n;k--)
  {
    for(h=k;h>=n;h--)
    {
      std::cout<<k;
    }
    std::cout<<"\n";
  }
}
