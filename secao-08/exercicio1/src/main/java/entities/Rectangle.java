package entities;

public class Rectangle {

    public double width;
    public double height;

    public double area() {
       return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public double diagonal() {
        double resultado = Math.pow(width,2) + Math.pow(height,2);
        return Math.sqrt(resultado);
    }

    // SE ELIMINAR ESSA PARTE ABAIXO, NA CLASS PROGRAM ADICIONA OS 3 sout QUE ESTÁ COMENTADO QUE FUNCIONA
    public String toString() {
        return "AREA = " + String.format("%.2f%n", area())
                + "PERIMETER = " + String.format("%.2f%n", perimeter())
                + "DIAGONAL = " + String.format("%.2f%n", diagonal());
    }
}
