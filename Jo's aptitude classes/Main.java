#include<iostream>
int main()
{
int a,b,c,small=0,gcd,d;
  std::cin>>a>>b>>c>>d;
  if(a<b && a<c)
  {
    small=a;
  }
  else if(b<a && b<c)
  {
    small=b;
  }
  else
  {
    small=c;
  }
  if(a%small==0 && b%small==0 && c%small==0)
  {
    gcd=small;
  
  }
  else
  {
    small--;
  }
  if(d==a)
  {
    std::cout<<"Answer is correct.";
  }
  else
  {
    std::cout<<"Answer is wrong.";
  }
  
}