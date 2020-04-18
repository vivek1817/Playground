#include<iostream>
int main()
{
  int num1,num2,opt,c;
  std::cin>>num1>>num2;
  std::cout<<"Enter first number :";
    std::cout<<" Enter second number :";
    std::cout<<" Menu";
  std::cout<<"\n1.Addition";
  std::cout<<"\n2.Subtraction";
  std::cout<<"\n3.Multiplication";
  std::cout<<"\n4.Division";
  std::cout<<"\n5.Remainder";
  std::cin>>opt;
  switch(opt)
  {
      case 1:
      c=num1+num2;
      std::cout<<"\n"<<c;
      break;
      case 2:
      c=num1-num2;
      std::cout<<"\n"<<c;
      break;
      case 3:
      c=num1*num2;
      std::cout<<"\n"<<c;
      break;
      case 4:
      c=num1/num2;
      std:: cout<<"\n"<<c;
      break;
      case 5:
      c=num1%num2;
      std::cout<<"\n"<<c;
      break;
      default:
      std::cout<<"\nInvalid operation";
      break;
  }
}
      