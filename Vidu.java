public class Vidu {
	public static void main(String[] args) {
		int a= 100;
		int b= 24;
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		// Kiểu 1: ép kiểu ngầm định
		float c = a;
		float d = b;
		
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
		
		// Kiểu 2: ép kiểu tường minh
		float e= 9.89f;
		float f= 13.9f;
		
		System.out.println("e = "+ e);
		System.out.println("f = "+ f);
		
		int g= (int)e;
		int h=(int)f;
		
		System.out.println("g = "+ g);
		System.out.println("h = "+ h);
		
		// Kiểu 3: ép kiểu giữa biến nguyên thủy và đối tượng
		int x= new Integer(32);
		System.out.println("x = "+x);
		
		System.out.println("Dev 2");
	}
}
