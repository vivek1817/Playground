#include<iostream>
#include<cmath>
int main()
{
  int n,i,count=0,a,sum=0,f,temp;
    std::cin>>n;
  temp=n;
  while(n>0)
  {
    a=n%10;
    count++;
    n=n/10;
  }
  n=temp;
  while(n>0)
  {
    a=n%10;
    
    f=pow(a,count);
    sum=sum+f;
    
    n=n/10;
  }
  n=temp;
  if(sum==n)
  {
    std::cout<<"Kindly proceed with encrypting";
  }
  else
  {
    std::cout<<"It is not an Armstrong number";
  }
}