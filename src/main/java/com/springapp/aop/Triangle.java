package com.springapp.aop;

/**
 * Created by Sanelib on 07/10/2015.
 */
public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void display() {
		System.out.println("PointA.getx: " + pointA.getX() + "PointA.gety: " + pointA.getY());
		System.out.println("PointB.getx: " + pointB.getX() + "PointB.gety: " + pointB.getY());
		System.out.println("PointC.getx: " + pointC.getX() + "PointC.gety: " + pointC.getY());
	}
}
