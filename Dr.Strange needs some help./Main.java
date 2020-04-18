#include<iostream>
#include<cmath>
int main()
{
  int m,n,req,d;
  std::cin>>m>>n>>req;
  d=pow(m,n);
  if(req<=d)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}