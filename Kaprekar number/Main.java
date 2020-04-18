#include<iostream>
#include<cmath>
using namespace std;
int main()
{
   int n,i,left,right,sq,d,temp;
  float count=0;
    std::cin>>n;
  sq=n*n;
  temp=sq;
  while(sq>0)
  {
    i=sq%10;
    count++;
    sq=sq/10;
  }
  sq=temp;
  d=ceil(count/2);
  left=sq/pow(10,d);
  right=sq-left*pow(10,d);
  if(left+right==n)
  {
    std::cout<<"Kaprekar Number";
  }
  else
  {
    std::cout<<"Not a Kaprekar Number";
  }
}