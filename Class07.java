
package Java09;
class Cpower{
	public static void power(int x,int n) {
		int a = 1;
		for(int i=1;i<=n;i++)
			a = a*x;
		System.out.println(x + "^" + n + "=" + a);
	}
}

public class Class07 {

	public static void main(String[] args) {
		Cpower.power(2, 5);
		Cpower.power(3, 2);
	}

}
