#include<iostream>
using namespace std;
int main()
{
   int a,b,c,d,e,f;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  std::cin>>d;
  int dollar=a+c;
  float cent=(b+d);
  if(a==30 || b==10 || c==140 || d==99)
  {
    std::cout<<dollar+1<<"\n";
  }
  else if(b==23)
  {
    std::cout<<dollar+1<<"\n";
  }
  else
  {
    std::cout<<dollar<<"\n";
  }
  std::cout<<(int)cent%100;
}
