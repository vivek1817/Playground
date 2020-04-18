#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  std::cin>>age>>time;
  if(time==13.30f)
  {
    if(age>13)
    {
      std::cout<<"$5.00";
    }
    else if(age<13)
    {
      std::cout<<"$2.00";
    }
  }
    else
    {
      if(age>13)
    	{
     	 std::cout<<"$8.00";
    	}
    	else if(age<13)
    	{
      	std::cout<<"$4.00";
    	}
    }
}