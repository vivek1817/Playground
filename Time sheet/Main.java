#include<iostream>
using namespace std;
int main()
{
  int hrs,a,b,c,d,e,f,g,m;
  std::cin>>a>>b>>c>>d>>e>>f>>g;
  hrs=(b+c+d+e+f);
  m=hrs*100;
  if(hrs>40)
  {
    m=m+((hrs-40)*25);
  }
  if(b>8)
  {
    m=m+((b-8)*15);
  }
  if(c>8)
  {
    m=m+((c-8)*15);
  }
  if(d>8)
  {
    m=m+((d-8)*15);
  }
  if(e>8)
  {
    m=m+((e-8)*15);
  }
  if(f>8)
  {
    m=m+((f-8)*15);
  }
  if(a>0)
  {
    m=m+(a*100/100)*50+(a*100);
  }
  if(g>0)
  {
    m=m+(g*100/100)*25+(g*100);
  }
  std::cout<<m;
}