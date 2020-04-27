#include<iostream>
int main()
{
  int maxw,fw;
  std::cin>>maxw;
  std::cin>>fw;
  if(fw>maxw)
  {
    std::cout<<"Sorry, you can't enter";
  }
  else if(fw==maxw)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else if(fw<maxw)
  { 
    std::cout<<"Yes, you can enter.";
  }
 return 0;
}
    