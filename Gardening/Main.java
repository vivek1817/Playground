#include<iostream>
using namespace std;
int main()
{
  int row,col,tre;
  std::cin>>row>>col>>tre;
  if((tre%row==0) && (tre%col==0) && (tre%2==0) && ((col-1)%2==0))
  {
    std::cout<<"It is a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }
}