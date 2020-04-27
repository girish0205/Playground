#include<iostream>
int main()
{
  int i,j,s;
  std::cin>>s;
  for(i=1;i<=s;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i) 
        std::cout<<i<<"*";
      else 
       std::cout<<i;
    }
    std::cout<<"\n";
  }
  for(i=s;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i) 
        std::cout<<i<<"*";
      else 
        std::cout<<i;
    }
    std::cout<<"\n";
  }  
  return 0;
}
