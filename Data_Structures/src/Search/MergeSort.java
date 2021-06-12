package Search;

public class MergeSort 
{    
    void merge(int arr[], int l, int m, int r)
    {      
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];  //Defining the size of the left side of the array
        int R[] = new int [n2];  //Defining the size of the left side of the array

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];   //copy left array into temporary left array created
        
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];  //copy left array into temporary left array created

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2)  //we are checking the value of 1 and r array and swapping it
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }    
        while (j < n2)     ////we are checking the value of 1 and r array and increamenting
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {            
            int m = (l+r)/2;

            sort(arr, l, m);           //1st half
            sort(arr , m+1, r);       //2nd half
            merge(arr, l, m, r);  // merging of 1st + 2nd after sorting them individually
        }
    }
}

