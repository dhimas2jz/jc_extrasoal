package soalextra;
import java.util.Scanner;
public class soal3 {
	
	    public static void main(String args[]){
	        Scanner kalimat = new Scanner(System.in);
	        int count=0;
	        String ab,cd = new String();

	        System.out.print("Masukan String : ");cd = kalimat.nextLine() ;
	        char tchar[] = new char[cd.length()];
	        ab = cd.toLowerCase();
	        for(int x=0; x<cd.length();x++){
	            if(ab.charAt(x)=='a' || ab.charAt(x)=='i' || ab.charAt(x)=='u' || ab.charAt(x)=='e' || ab.charAt(x)=='o'){
	                count++;
	            }
	        }
	        System.out.println("Number of  Vowels in the string : "+count);

	    }
	
}
