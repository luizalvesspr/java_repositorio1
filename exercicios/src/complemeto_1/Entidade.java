package complemeto_1;

public class Entidade {
    public double width;
    public double height;
    
    public double area() {
   	 return width*height;
    }
    public double perimeter() {
   	 return (width*2)+(height*2);
    }
    public double diagonal() {
   	 return Math.sqrt(Math.pow(width,2)+ Math.pow(height,2));
    }
    public String toString(){
    	return (" o perimetro é de: "+ perimeter()
    			+ "" +
    			" e a area é de: "+ area());
    	
    }
}
