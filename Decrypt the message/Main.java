#include<iostream>
int main()
{
  int n,i,g,h,sum=0;
  std::cin>>n;
  std::cin>>g;
  h=n+g;
  for(i=1;i<h;i++)
  {
    if(h%i==0)
    {
      sum=sum+i;
    }
  }
  if(h==sum)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}