
#include <iostream> 
using namespace std; 
int main() 
{  
    float x1, x2, x3; 
    float y1, y2, y3; 
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
    float x = (x1 + x2 + x3) / 3.0; 
    float y = (y1 + y2 + y3) / 3.0; 
   
    cout << x<<'\n'<< y ; 
  
    return 0; 

}