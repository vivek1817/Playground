#include <iostream>
using namespace std;
int main()
{
  int n,i,j,k,g;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    g=i+1;
    if(i%2==1)
    {
      for(j=1;j<n;j++)
      {
        std::cout<<i;
        
      }
      std::cout<<g;
      
    }
    else
    {
      
      std::cout<<g;
      for(k=1;k<n;k++)
      {
        std::cout<<i;
      }
     
    }
     std::cout<<"\n";
  }
}
    
    