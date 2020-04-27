#include <iostream>
using namespace std;

int main() 
{
	int number; //Any number.
	int res;
std::cin>>number;
	if(number)
		res = number % 9 == 0 ? 9 : number % 9 ;
	else 
		res = 0;

	//print the result
	std::cout<<res;

	return 0;
}