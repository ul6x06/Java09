package Java09;
class nCRectangle {
int width;
int height;
public nCRectangle(int w,int h){
	width = w;
	height = h;
	System.out.println("width="+width);
	System.out.println("height="+height);
}
public nCRectangle(){
	this(10,8);
	System.out.println("width="+width);
	System.out.println("height="+height);
}

}
public class Class01ac{
	public static void main(String args[]) {
		nCRectangle r1 = new nCRectangle(1,2);
		nCRectangle r2 = new nCRectangle();
	} 
}

