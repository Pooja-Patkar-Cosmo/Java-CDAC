
public class EvenDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even numbers from 1 to 500 : ");
		
		for (int iTemp = 1; iTemp <= 500; iTemp++) {
			if (iTemp % 2 == 0)
				System.out.println(iTemp);
		}
	}

}
