#include<iostream>
int main()
{
  int max,wei;
  std::cin>>max>>wei;
  if(max<wei)
  {
    std::cout<<"Sorry, you can't enter";
  }
  else if(max==wei)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    std::cout<<"Yes, you can enter.";
  }
}