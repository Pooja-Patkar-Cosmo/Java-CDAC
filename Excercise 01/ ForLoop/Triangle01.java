
public class Triangle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0 ; j <= i; j++){
				if ( j <=i)
					System.out.print(num++ + " ");
			}
			System.out.println();	
		}	

	}

}
