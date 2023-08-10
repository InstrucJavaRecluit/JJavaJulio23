package common;

public class Coche {
   
	String color;
	String marca;
	int a�o;

public Coche() {
	
}

public Coche(String color, String marca, int a�o) {
	this.color = color;
	this.marca = marca;
	this.a�o = a�o;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getA�o() {
	return a�o;
}

public void setA�o(int a�o) {
	this.a�o = a�o;
}

@Override
public String toString() {
	return "Coche [color=" + color + ", marca=" + marca + ", a�o=" + a�o + "]";
}

}