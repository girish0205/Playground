#include<iostream>
int main()
{
  int a,b,sum,difference,product,quotient,remainder;
  
  std::cin>>a;
  std::cin>>b;
  sum=a+b;
  difference=a-b;
  product=a*b;
  quotient=a/b;
  remainder=a%b;
  std::cout<<"a+b="<<sum<<'\n';
  std::cout<<"a-b="<<difference<<'\n';
  std::cout<<"a*b="<<product<<'\n';
  std::cout<<"a/b="<<quotient<<'\n';
  std::cout<<"a%b="<<remainder;
}