#include<iostream>
int main()
{
  int num,fact,temp;
  std::cin>>num;
  temp=num;
  fact=num;
  while(num>1)
  {
    num--;
  fact=fact*num;
  }
  std::cout<<"The factorial of "<<temp<<" is "<<fact;
}
