#include<iostream>
using namespace std;
int main()
{
int t,m,n;
  std::cin>>t>>m>>n;
  if(m*75+n*30<t)
  {
    std::cout<<"Boat is stable";
  }
  else{
    std::cout<<"Boat will drow";
  }
}