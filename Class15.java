
package Java09;
class CCircle 
 { 
 private static double pi=3.14; 
 private double radius; 
 
 public CCircle(double r) 
 { 
 radius=r; 
 } 
 public static double average(CCircle c[]) 
 { 
 double a=0.0; 
 for(int i=0;i<c.length;i++) 
 a+=c[i].radius; 
 return (a/c.length); 
 } 
 } 

public class Class15 {

	
	public static void main(String[] args) {
		CCircle cir[]; 
		 cir=new CCircle[4]; 
		 cir[0]=new CCircle(1.0); 
		 cir[1]=new CCircle(2.0); 
	     cir[2]=new CCircle(3.0); 
	     cir[3]=new CCircle(4.0);
		 System.out.println(CCircle.average(cir)); 
		

	}

}
