package Chapter_4;

public class class_test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		a =10;
		
		//TriAngle tri1 = new TriAngle();
		Trianangle_class tri1;
		tri1 = new Trianangle_class();
		//TriAngle 클래스로 tri1이라는 이름의 객체를 선언
		tri1.bottom = 10;
		tri1.height = 20;
		tri1.color = "red";
		
		double s = tri1.tri_area();
		System.out.print(s);
		
		
		Trianangle_class tri2 = new Trianangle_class();
		tri2.bottom = 100;
		tri2.height = 200;
		tri2.color = "blue";
		tri2.tri_area();
		
		Trianangle_class tri3 = new Trianangle_class();
		
		
		Square squ1 = new Square();
		squ1.height = 10;
		squ1.width = 20;
		squ1.square_area();
		
		
	}

}
