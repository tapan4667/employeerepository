package Collectionproram;

public class Mug {
private String brandName;
private int price;
private int capacity;
public Mug(String brandName,int price,int capacity) {
	this.brandName=brandName;
	this.price=price;
	this.capacity=capacity;
}
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
@Override
public String toString() {
	return "Mug [brandName=" + brandName + ", price=" + price + ", capacity=" + capacity + "]";
}

}
