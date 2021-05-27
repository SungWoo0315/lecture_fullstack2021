package kr.java.chapter8;

import java.util.ArrayList;
import java.util.Iterator;

class Shape {
	void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle");
	}
}

public class ExP278Q5ShapeTest {

	public static void main(String[] args) {
		
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		list.add( new Triangle());
		list.add( new Triangle());
		list.add( new Triangle());
		list.add( new Circle());
		
		for (Shape shape : list) {
			shape.draw();
		}

	}
}











