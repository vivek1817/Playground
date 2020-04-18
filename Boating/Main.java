#include<iostream>
using namespace std;
int main()
{
  int wei,ad,ch;
  std::cin>>wei>>ad>>ch;
  if(wei>=ad*75+ch*30)
  {
    std::cout<<"Boat is stable";
  }
    else
    {
      std::cout<<"Boat will drow";
    }
}