package common;

public class Coche {
   
	String color;
	String marca;
	int año;

public Coche() {
	
}

public Coche(String color, String marca, int año) {
	this.color = color;
	this.marca = marca;
	this.año = año;
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

public int getAño() {
	return año;
}

public void setAño(int año) {
	this.año = año;
}

@Override
public String toString() {
	return "Coche [color=" + color + ", marca=" + marca + ", año=" + año + "]";
}

}