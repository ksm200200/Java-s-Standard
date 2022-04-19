package chapter_07;

public class PointTest2 {
	
	public static void main(String[] args) {
		
		Point3D_2 p3d = new Point3D_2();
		System.out.println("p3d.x = " + p3d.x);
		System.out.println("p3d.y = " + p3d.y);
		System.out.println("p3d.z = " + p3d.z);
		
	}
	
	
}

class Point2 {
	int x = 10;
	int y = 20;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D_2 extends Point2 {
	int z = 30;
	
	Point3D_2() {
		this(100, 200, 300);	//Point(int x, int y, int z)를 호출한다.
	}

	public Point3D_2(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
}
