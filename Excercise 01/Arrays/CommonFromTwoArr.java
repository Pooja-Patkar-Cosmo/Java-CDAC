import java.util.Scanner;

public class CommonFromTwoArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 =sc.nextInt();
		
		//Instantiate the array of size n
		int Arr1[] = new int[n1];
		
		// Input the array elements
		System.out.print("Enter the elememts for Arr1: ");
		for (int i = 0; i < n1; i++)
			Arr1[i] = sc.nextInt();
		
//--------------------------------------------------------------------
		System.out.print("Enter n2: ");
		int n2 =sc.nextInt();
					
		int Arr2[] = new int[n2];
		
		// Input the array elements
		System.out.print("Enter the elements for Arr2: ");
		for (int i = 0; i < n2; i++)
			Arr2[i] = sc.nextInt();
		
		//Displaying the arrays
		System.out.println();
		System.out.print("Arr1 : ");
		for (int i = 0; i < n1; i++) { 
			System.out.print(Arr1[i] + " ");
		} 
		
		System.out.println();
		System.out.print("Arr2 : ");
		for (int i = 0; i < n2; i++) { 
			System.out.print(Arr2[i] + " ");
		} 
		
		System.out.println();
		System.out.print("Common elements are : ");
		for ( int i = 0 ; i < n1; i++ ) {
			for ( int j = 0; j < n2; j++) {
				if (Arr1[i] == Arr2[j])
					System.out.print(Arr1[i] + " ");
			}
		}
		
		sc.close();
		
	}

}
