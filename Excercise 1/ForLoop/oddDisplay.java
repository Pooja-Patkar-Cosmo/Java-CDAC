
public class oddDisplay {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The odd number from 1 to 1000 : ");
		
		for (int iTemp = 1; iTemp <= 1000; iTemp++) {
			if (iTemp % 2 != 0)
				System.out.println(iTemp);
		}
	}

}
