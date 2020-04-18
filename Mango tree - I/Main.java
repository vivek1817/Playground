#include<iostream>
using namespace std;
int main()
{
  int row,col,tree;
  std::cin>>row>>col>>tree;
  if(tree<=row)
  {
    std::cout<<"Yes";
  }
  else if(tree%row==0 && tree%col==0)
  {
    std::cout<<"Yes";
  }
  else if(tree%row==1)
  {
    std::cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}