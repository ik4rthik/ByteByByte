#include <stdio.h>

void implimentBestFit(int blockSize[], int blocks, int processSize[], int proccesses)
{
    int allocation[proccesses];
    int occupied[blocks];
    
    for(int i = 0; i < proccesses; i++){
        allocation[i] = -1;
    }
    
    for(int i = 0; i < blocks; i++){
        occupied[i] = 0;
    }

    for (int i = 0; i < proccesses; i++)
    {
        int indexPlaced = -1;
        for (int j = 0; j < blocks; j++) { 
            if (blockSize[j] >= processSize[i] && !occupied[j])
            {
                if (indexPlaced == -1)
                    indexPlaced = j;
                else if (blockSize[j] < blockSize[indexPlaced])
                    indexPlaced = j;
            }
        }

        if (indexPlaced != -1)
        {
            allocation[i] = indexPlaced;
            occupied[indexPlaced] = 1;
        }
    }

    // Display allocation
    printf("\nProcess No.\tProcess Size\tBlock No.\tBlock Size\n");
    for (int i = 0; i < proccesses; i++) {
        if (allocation[i] != -1)
            printf(" %d\t\t%d\t\t%d\t\t%d\n", i+1, processSize[i], allocation[i]+1, blockSize[allocation[i]]);
        else
            printf(" %d\t\t%d\t\tNot Allocated\n", i+1, processSize[i]);
    }
}

int main() {
    int blockSize[] = {100, 500, 200, 300, 600};
    int blocks = sizeof(blockSize) / sizeof(blockSize[0]);

    int processSize[] = {212, 417, 112, 426};
    int proccesses = sizeof(processSize) / sizeof(processSize[0]);

    implimentBestFit(blockSize, blocks, processSize, proccesses);

    return 0;
}

