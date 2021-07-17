package entities;

public class Rectangle {

	
	public double width;
	public double height;
	public String resposta;
	
	public double area() {
		
		return width*height;
		
	}
	
	public double perimeter() {
		
		return (width*2)+(height*2);
		
	}
	
	public double diagonal() {
			
		
		return Math.sqrt(width * width + height * height );
		
		
	}
	
	public String toString() {
		return resposta 				
				+String.format("Area = %.2f %n", area()) 
				+String.format("Perimeter = %.2f %n",perimeter())
				+String.format("Diagonial = %.2f %n",diagonal()); 
				
						
	}
}
