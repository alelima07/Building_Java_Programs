
public class Chap3Ex13 {



	public static void main(String[] args) {

System.out.println(pay(5.50, 6));

System.out.println(pay(4.00, 11));

}

	public static double pay(double sal, int hr) {

double pay;

if(hr>8) {

pay = sal*8 + (1.5*sal*(hr-8));

}else pay = sal*hr;

return pay;


}

}