package soalextra;

public class soal6 {
	
	public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        // Calling function
        obj.Area(30, 20);
        obj.Area(12.5, 4.5);
        Circle obj1 = new Circle();
        // Calling function
        obj1.Area(3);
        obj1.Area(5.5);
        Square obj2 = new Square();
        // Calling function
        obj2.Area(20);
        obj2.Area(5.2);
        
    }
}
class Square 
{

    void Area(double side)
    {
        System.out.println("perimeter: "+ side * side);
    }

    void Area(float side)
    {
        System.out.println("area: "+ side * side);
    }
}
class Circle 
{
    static final double PI = Math.PI;
  
    void Area(double r)
    {
        double A = PI * r * r;
  
        System.out.println("width :" + A);
    }
  

    void Area(float r)
    {
        double A = PI * r * r;
  
        System.out.println("length :" + A);
    }
}
class Rectangle 
{

    void Area(double l, double b)
    {
        System.out.println("Rectangle: " + l * b);
    }

    void Area(int l, int b)
    {
        System.out.println("Rectangle: " + l * b);
    }
    void Area(double l, int b)
    {
        System.out.println("Rectangle: " + l * b);
    }
	
}
