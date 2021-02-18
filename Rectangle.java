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
final class Rectangle implements ShapeInterface{
    public double height = 4, width = 2, area = 5;
    @Override
    public void printShape()
    {
        System.out.println("I'm a Rectangle");
    }
    @Override
    public double getArea()
    {
        System.out.println(area);
        return area;
    }
    @Override
    public void onAreaChange()
    {
        area = width*height;
        System.out.println(area);
    }
    public void onAreaChange(int sWidth, int sHeight)
    {
        area = sWidth*sHeight;
        System.out.println(area);
    }
}
