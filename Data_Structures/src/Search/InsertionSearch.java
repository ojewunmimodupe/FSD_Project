package Search;

public class InsertionSearch 
{

    public static  void main(String[] args){

        int[] arr = {9,12,3,21,44,5,1,10,25};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
     }
    
    public static void insertionSort(int[] arr){

    int len = arr.length;
    
    //Algorithm for insertion sort
    for(int j=1;j<len;j++){
    int key = arr[j];
    int i=j-1;                        //i = 0
    while ((i>-1) && (arr[i]>key)){  // comparing with index values

        arr[i+1]=arr[i];  //Insertion logic if element is small
        i--;
    }
    arr[i+1]=key;
         }
    }
}




