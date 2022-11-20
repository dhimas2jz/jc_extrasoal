package soalextra;
import java.util.Scanner;
public class soal1 {

	    public static void main(String[] args) {
	        // TODO code application logic here
	        int min, jumlah, i, loc = 1, array[];
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Masukkan jumlah urutan: ");
	        jumlah = scan.nextInt();
	        array = new int[jumlah];

	        System.out.println("Masukkan "+jumlah+" angka");
	        for(i = 0; i < jumlah; i++) {
	            System.out.print("masukan angka ke-"+ (i+1) +": " );
	            array[i] = scan.nextInt();
	        }
	        min = array[0];

	        for(i = 0; i < jumlah; i++) {
	            if (array[i] < min){
	                min = array[i];
	            }
	        }
	        System.out.println("Nilai terkecil adalah "+min);
	    }
	
}
