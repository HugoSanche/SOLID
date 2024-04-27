package com.company.practice;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,5);
        Square square= new Square(10);

        System.out.println(rectangle.calculateArea());
        System.out.println(square.calculateArea());
        useRectangle(rectangle);

    }
    public static void useRectangle(Rectangle rectangle){
        rectangle.setWidth(10);
        rectangle.setHeight(5);



    }
}
