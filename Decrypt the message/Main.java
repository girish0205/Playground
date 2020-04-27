#include <iostream> 
#include <cctype>
using namespace std; 

int main(){
    int n,m,t,i=1,sum=0;
    std::cin>>n;
  std::cin>>m;
  t=m+n;
       while(i<t){
       if(t%i==0)
       sum=sum+i;
       i++; 
}
 
if(sum==t)
    std::cout<< "They can read the message\n"; 
else
    std::cout<< "They can't read the message\n";

return 0;
}