#include<iostream>
using namespace std;
int main()
{
  int n,i,sum=0,temp;
  std::cin>>n;
  temp=n;
  while(n>0)
  { 
  	i=n%10;
  	sum=sum+i;
  	n=n/10;
  }
    n=temp;
  if(n%sum==0)
  {
    std::cout<<"Harshad Number";
  }
  else
  {
    std::cout<<"Not Harshad Number";
  }
}

  
