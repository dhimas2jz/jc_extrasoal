package soalextra;
import java.util.Scanner;
public class soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int x;
		        int y;
		        Scanner input = new Scanner(System.in);

		        System.out.print("Masukan Jumlah Sisi : ");
		        x = input.nextInt();
		        
		        System.out.print("Masukan Sisi : ");
		        y = input.nextInt();


		        double area_pentagon=(long)(5.0/2.0)*x*y;
		        System.out.println("Area pentagon adalah = "+area_pentagon);

	}

}
