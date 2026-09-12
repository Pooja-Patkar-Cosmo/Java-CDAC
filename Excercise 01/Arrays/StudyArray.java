import java.util.*;

public class StudyArray {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		//Instantiate the array of size n
		int Arr[] = new int[n];
		
		// Input the array elements
		System.out.print("Enter the elements: ");
		for (int i = 0; i < n; i++)
			Arr[i] = sc.nextInt();
			
		int sum = 0;
		
		Arrays.sort(Arr);
	//---------------------------------------------------------------------
	// 2. Sorted array
	//---------------------------------------------------------------------
			
		System.out.println();
		System.out.print("Sorted array : ");
		for (int i = 0; i < n; i++) { 
			sum += Arr[i];
			System.out.print(Arr[i] + " ");
		} 
	//---------------------------------------------------------------------	
	//3. Sum of elements
	//---------------------------------------------------------------------
		System.out.println();
		System.out.println("Sum : " + sum); 
		
	//---------------------------------------------------------------------	
	//4. Average of elements
	//---------------------------------------------------------------------
		System.out.println("Average : " + (sum/n)); 
	
	//---------------------------------------------------------------------		
	// 5. Copied array
	//---------------------------------------------------------------------
		int copy[] = new int[n];
		
		for (int i = 0; i < n; i++)
				copy[i] = Arr[i];
		
		System.out.print("The copied array : ");
		for (int i = 0; i < n; i++)
			System.out.print(copy[i] + " ");

			
	//---------------------------------------------------------------------		
	// 6. Minimum and Maximum values
	//---------------------------------------------------------------------
		int maxValue = Arr[0];
		int minValue = Arr[0];
		
		
		for (int i = 0; i < n; i++) { 
			if (Arr[i] < minValue)
				minValue = Arr[i];
			
			if (Arr[i] > maxValue)
				maxValue = Arr[i];
		} 
		System.out.println();
		System.out.println("Minimum Value : " + minValue + "  Maximum Value : " + maxValue);
		
		
	//---------------------------------------------------------------------		
	// 7. Reverse an array
	//---------------------------------------------------------------------
		
		int reversed[] = new int[n];
		
		for (int i = 0; i < n; i++)
				reversed[n-1-i] = Arr[i];
		
		System.out.println();
		System.out.print("The reversed array : ");
		for (int i = 0; i < n; i++)
			System.out.print(reversed[i] + " ");

	//---------------------------------------------------------------------		
	// 8. Find duplicate values 
	//---------------------------------------------------------------------
	
		System.out.println();
		System.out.println("Duplicate values: ");
		for (int i = 0; i < n-1; i++) { 
			for ( int j = i+1; j < n; j++) {
				if (Arr[i] == Arr[j]) {
					System.out.print(Arr[i] + " ");
					break;   // prevents printing the same number multiple times
				}
			}
		}
			
		sc.close();	
		
	}

}
