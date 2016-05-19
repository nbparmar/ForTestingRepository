package com.springapp.autowirearray;

/**
 * Created by Sanelib on 24/09/2015.
 */
public class Triangle implements Draw {

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

	@Override
	public void draw() {
		System.out.println("PointA==> x: " + pointA.getX() + ", y: " + pointA.getY());
		System.out.println("PointB==> x: " + pointB.getX() + ", y: " + pointB.getY());
		System.out.println("PointC==> x: " + pointC.getX() + ", y: " + pointC.getY());
	}
}
