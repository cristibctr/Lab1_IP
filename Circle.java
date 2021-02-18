/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1_ip;

/**
 *
 * @author crist
 */
final class Circle extends Shape {
    double radius;
    final double pi = 3.147;
    public Circle()
    {
        System.out.println("I'm a Circle");
    }
    public Circle(String str)
    {
        System.out.println("I'm a shape, a " + str + "!");
    }
    public Circle setRadius(double x)
    {
        radius=x;
        return this;
    }
    @Override
    public void onAreaChange()
    {
        area=Math.pow(radius, 2)*pi;
        System.out.println(area);
    }

}
