package Collectionproram;

import java.util.Objects;

public class Laptop implements Comparable<Laptop>{
private String brand;
private int price;
private String colour;
private int keys;
public Laptop(String brand, int price, String colour, int keys) {
	super();
	this.brand = brand;
	this.price = price;
	this.colour = colour;
	this.keys = keys;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getKeys() {
	return keys;
}
public void setKeys(int keys) {
	this.keys = keys;
}
@Override
public int compareTo(Laptop o) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int hashCode() {
	return Objects.hash(brand, colour, keys, price);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Laptop other = (Laptop) obj;
	return Objects.equals(brand, other.brand) && Objects.equals(colour, other.colour) && keys == other.keys
			&& price == other.price;
}

}
