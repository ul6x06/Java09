package Java09;
class nCCircle 
 { 
 private static double pi=3.14; 
 private double radius; 
 
 public nCCircle(double r) 
 { 
 radius=r; 
 } 
 public void show() 
 { 
 System.out.print("半徑:"+radius); 
 System.out.println(", 面積:"+pi*radius*radius); 
 } 
 } 
public class Class16 {
	public static void main(String args[]) 
	 { 
	 nCCircle cir[]; 
	 cir=new nCCircle[6]; 
	 
	 for(int i=0;i<cir.length;i++) 
	 { 
	 cir[i]=new nCCircle((double)i); 
	 cir[i].show(); 
	 } 
	 } 
}
