#include <iostream>


/* Function declaration */
unsigned long long fibo(int num);


int main()
{
    int num;
    unsigned long long fibonacci;
    
    /* Input a number from user */
   std::cin>>num;
    fibonacci = fibo(num); 
    
  std::cout<<"The term "<<num<<" in the fibonacci series is "<<fibonacci;
    
    return 0;
}


/**
 * Recursive function to find nth Fibonacci term
 */
unsigned long long fibo(int num) 
{
    if(num == 1)      //Base condition
        return 0;
    else if(num == 2) //Base condition
        return 1;
    else 
        return fibo(num-1) + fibo(num-2); 
}