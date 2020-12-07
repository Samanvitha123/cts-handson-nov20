package com.org;

public class Student {
private String name;
@Override
public String toString() {
	return " [name=" + name + ", id=" + id + ", password=" + password + "]";
}
private int id;
private String password;

public Student(String name, int id, String password) {
	super();
	this.name = name;
	this.id = id;
	this.password = password;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
