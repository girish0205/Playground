#include <stdio.h>
int main() {
    char line[150];
   
    gets(line);
    for (int i = 0; line[i] != '\0'; ++i) {
        while (!((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z') || line[i] == '\0')) {
            for (int j = i; line[j] != '\0'; ++j) {
                line[j] = line[j + 1];
            }
            
        }
    }
    
    puts(line);
    return 0;
}