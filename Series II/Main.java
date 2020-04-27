#include<iostream>
#include<math.h>
int main()
{
  int s,n,count=0,p;
  std::cin>>s;
  if(count<s)
  {
    for(int i=0;i<=n;i++)
    {
     
      p=pow((11+4*i),2);
        std::cout<<p<<" ";
       ++count;
    
  if(count==s)
    break;
      }}
  return 0;
}
    