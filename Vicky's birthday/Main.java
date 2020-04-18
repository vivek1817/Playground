#include<iostream>
int main()
{
  int num;
  std::cin>>num;
  if(num%4==0)
  {
   if(num%100==0)
    {
     if(num%400==0)
     
      std::cout<<"Vicky can celebrate his birthday.";
     
    else
    
      std::cout<<"Vicky can't celebrate.";
    }
    else
    std::cout<<"Vicky can celebrate his birthday.";
  }
  else
    std::cout<<"Vicky can't celebrate.";
  
  }

