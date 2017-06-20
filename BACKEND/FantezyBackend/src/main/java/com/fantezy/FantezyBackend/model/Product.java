package com.fantezy.FantezyBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Product
{
@Id
@GeneratedValue
int ProdId;
String ProdName;
int catid;
int suppid;
int Quantity;
int Price;
String ProdDesc;
public int getProdId() {
	return ProdId;
}
public void setProdId(int prodId) {
	ProdId = prodId;
}
public String getProdName() {
	return ProdName;
}
public void setProdName(String prodName) {
	ProdName = prodName;
}
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public int getSuppid() {
	return suppid;
}
public void setSuppid(int suppid) {
	this.suppid = suppid;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public String getProdDesc() {
	return ProdDesc;
}
public void setProdDesc(String prodDesc) {
	ProdDesc = prodDesc;
}
}
