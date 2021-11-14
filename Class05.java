package Java09;

class CCount {
	private static int cnt = 0;

	public CCount() {
		count();
	}

	public static void count() {
		cnt++;
	}

	public static void setZero() {
		cnt = 0;
	}

	public static void setValue(int n) {
		cnt = n;
	}

	public static void show() {
		System.out.println("cnt=" + cnt);
	}
}

public class Class05 {
	public static void main(String args[]) {
		CCount c1 = new CCount();
		CCount c2 = new CCount();
		CCount c3 = new CCount();
		CCount.show();
		CCount.setZero();
		CCount.show();
		CCount.setValue(13);
		CCount.show();

	}
}
