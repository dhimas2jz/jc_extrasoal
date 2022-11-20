package soalextra;

public class soal7 {
	
	public static void main(String[] args)
    {
        double basicSalary, hra, da, PF, netSalary;
        //basic salary of employee declared
        basicSalary = 15000;
        
        //calculating HRA, DA and PF
        hra = basicSalary * 0.1;
        da = basicSalary * 0.07;
        PF = basicSalary * 0.08;
        //Calculating net salary by adding basicSalary, hra, da and deducting PF from that
        netSalary = basicSalary + hra + da - PF;
        System.out.println("The Basic salary is:" + basicSalary);
        System.out.println("The HRA is:" + hra);
        System.out.println("The DA is:" + da);
        System.out.println("The PF is:" + PF);
        System.out.println("The net salary is:" + netSalary);
    }
	
}
