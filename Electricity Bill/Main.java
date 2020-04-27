#include<iostream>
using namespace std;
int main()
{
int u,m,n,o,p;
  std::cin>>u;
  if(u<=200)
  {
    m=u*0.5;
    std::cout<<"Rs."<<m;
  }
  else if(u<=400)
  {
    n=u*0.65+100;
    std::cout<<"Rs."<<n;
  }
  else if(u<=600)
  {
    o=u*0.80+200;
    std::cout<<"Rs."<<o;
  }
  else if(u>600)
  {
    p=u*1.25+425;
    std::cout<<"Rs."<<p;
  }
    
}