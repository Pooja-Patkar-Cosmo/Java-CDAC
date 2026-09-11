
public class MultipleOfSeven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Multiple of 7 from 1 to 200 : ");
		
		for (int iTemp = 1; iTemp <= 200; iTemp++) {
			if (iTemp % 7 == 0)
				System.out.println(iTemp);
		}
	}

}
