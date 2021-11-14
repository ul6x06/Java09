package Java09;
class CRectangle {
int width;
int height;
public CRectangle(int w,int h){
	width = w;
	height = h;
	System.out.println("width="+width);
	System.out.println("height="+height);
}
public CRectangle(){
	width = 10;
	height = 8;
	System.out.println("width="+width);
	System.out.println("height="+height);
}

}
public class Class01ab{
	public static void main(String args[]) {
		CRectangle r1 = new CRectangle(1,2);
		CRectangle r2 = new CRectangle();
	} 
}
