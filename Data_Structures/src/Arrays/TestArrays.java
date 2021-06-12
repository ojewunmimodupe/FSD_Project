package Arrays;

public class TestArrays {

	public static void main(String[] args) {
		double[] mylist = {1.9, .9, 3.4, 3.5};
		
		//print all the array elements
		for (int i = 0; i<mylist.length; i++) {
			System.out.println(mylist[i]+ " " +i);
			
			
		}
		int ar1[]= new int[4]; //integer array - 4 elements
		
		double ar[]=new double[7]; //double type array
		int size = ar1.length; // 7
		System.out.println("size of array is :" + size);
		
		
		//summing all elements
		double total = 0;
		for(int i=0; i<mylist.length; i++) {
			total +=mylist[i]; //total=total+mylist[i];
		}
		System.out.println("Total is"+ total);
		
		//Finding the largest element
		double max = mylist[0]; //1.9 = max(default)
		for (int i = 1; i<mylist.length; i++) {
			if(mylist[i] > max) max = mylist[i];
		}
		System.out.println("Max is" + max);
		

	}

}
