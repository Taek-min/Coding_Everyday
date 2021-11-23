#include <stdio.h>
#include <stdlib.h>

void size_number(int* nums, int input); ////C 언어는 오랜만에 보네

int main()
{
    int input;
    scanf("%d",&input);
    int* nums = (int*) malloc(sizeof(int)*input);
    
    for(int i = 0; i < input; i++)
    {
        scanf("%d",&nums[i]);
    }
    size_number(nums, input);
}

void size_number(int* nums, int input)
{
    int max, min;
    max = *(nums);
    min = *(nums);
    for(int i = 0; i < input; i++)
    {
      
        if(*(nums + i) <= min)
        {
            min = *(nums + i);
        }
        else if(max < *(nums + i))
        {
            max = *(nums + i);
        }
    }
    printf("%d %d", min, max);
}