package Collectionproram;

import java.util.Objects;

public class Car {
private String brand;
private int wheel;
private int price;
public Car(String brand, int wheel, int price) {
	super();
	this.brand = brand;
	this.wheel = wheel;
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getWheel() {
	return wheel;
}
public void setWheel(int wheel) {
	this.wheel = wheel;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public int hashCode() {
	return Objects.hash(brand, price, wheel);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	return Objects.equals(brand, other.brand) && price == other.price && wheel == other.wheel;
}
@Override
public String toString() {
	return "Car [brand=" + brand + ", wheel=" + wheel + ", price=" + price + "]";
}

}
