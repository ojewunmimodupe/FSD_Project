package Search;

import java.util.Arrays;

public class ExponentialSearch 

{

public static  void main(String[] args){

    int[] arr = {6,12,18,24,32, 33, 43, 46, 47, 49, 52,56,58,59,60,63,65,67,70,83,84,87,88,90,92,94,100};
    int length= (arr.length-1);
    System.out.println( "Array length is: "+length);
    int value = 100;
    int outcome = exponentialSearch(arr,length,value);

    if(outcome<0){
       System.out.println( "Element is not present in the array");
    }else {
        System.out.println( "Element is  present in the array at index :"+outcome);
       }
    }
    
public static int exponentialSearch(int[] arr ,int length, int value ){

        if(arr[0]==value){   // Boundary condition for zero or first element 
            return 0;
            }
        
        if(arr[length]==value){  //Boundary  condition to last element
        	return length;
        	
        }
        int i=1;
        while(i<length && arr[i]<=value){

            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);  //Use pre-defined function of the array search using the binarysearch method
        }
}



