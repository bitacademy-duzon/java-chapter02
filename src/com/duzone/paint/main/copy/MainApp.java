package com.duzone.paint.main.copy;

import com.duzone.paint.i.Drawable;
import com.duzone.paint.point.ColorPoint;
import com.duzone.paint.point.Point;
import com.duzone.paint.shape.Circle;
import com.duzone.paint.shape.Rect;
import com.duzone.paint.shape.Shape;
import com.duzone.paint.shape.Triangle;
//import com.duzone.paint.shape.*;
import com.duzone.paint.text.GraphicString;

public class MainApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		//drawPoint(p1);
		draw(p1);
		
		Point p2 = new Point(50, 50);
		//p2.show();
		//p2.show(false);
		//drawPoint(p2);
		draw(p2);
		
		Point p3 = new ColorPoint();
		p3.setX(100);
		p3.setY(50);
		((ColorPoint)p3).setColor("red");
		//p3.show(true);
		//p3.show(false);
		//drawPoint(p3);
		draw(p3);
		
		Point p4 = new ColorPoint(200, 100, "yello");
		//drawPoint(p4);
		draw(p4);
		
		Shape triangle = new Triangle();
		triangle.setLineColor("black");
		
		// down cating -> 명시적(Exlicity) 
		// Triangle t1 = (Triangle)triangle;
		((Triangle)triangle).setX1(10);
		draw(triangle);
		
		Rect rect = new Rect();
		// Up Casting ->  암시적(Implicity)
		Shape r1 = rect;
		draw(r1);
		
		Drawable circle = new Circle();
		//drawCircle(circle);
		draw(circle);
		
		draw(new GraphicString("Hello"));
		
		// 연산자 instanceof 테스트
		Shape s = new Circle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
		
		Circle c = (Circle)s;
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Object);
		// 에러: 계층 관계가 아닌 경우에는 연산을 할 수 없음
		//System.out.println(c instanceof Rect);
		
		
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawPoint(Point point) {
//		point.show();
//	}
//	public static void draw(Shape shape) {
//		shape.draw();
//	}
	
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}

}
