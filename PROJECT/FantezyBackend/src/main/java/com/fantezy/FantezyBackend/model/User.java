package com.fantezy.FantezyBackend.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User
{
@Id
@GeneratedValue
String UserName;
String Password;
String CustomerName;
String Role;
Boolean Enabled;
String Email;
String Address;
int Mobile;
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public Boolean getEnabled() {
	return Enabled;
}
public void setEnabled(Boolean enabled) {
	Enabled = enabled;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getMobile() {
	return Mobile;
}
public void setMobile(int mobile) {
	Mobile = mobile;
}

}
