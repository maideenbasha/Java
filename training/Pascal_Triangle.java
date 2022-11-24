
import java.util.Scanner;;
public class Pascal_Triangle {

	public static void main(String[] args) {
		
		System.out.println("ENTER NO OF LINES");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int space=n;

		for(int i=0;i<n;i++) {
			
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			int number=1;
			for(int j=0;j<=i;j++) {
				System.out.print(number+" ");
			    number = number * (i-j)/(j+1);
			}
			space--;
			System.out.println();
				}
	}

}