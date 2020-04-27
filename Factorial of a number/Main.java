#include<iostream>
int main(){
 int num,i,fact=1;
  std::cin>>num;
  for(i=1;i<=num;++i)
  {
    fact*=i;
  }
  std::cout<<fact;
  return 0;
}