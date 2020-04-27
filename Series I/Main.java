#include<iostream>
int main()
{
  int s,n,count=0;
  std::cin>>s;
  if(count<s)
  {
  for(float i=0.5;i<=n;i=i*3){
   std::cout<<i<<" ";
    ++count;
    if(count==s)
      break;
  }
  }
      
  return 0;
}