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
final class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle()
    {
       System.out.println("I'm a Triangle");
    }
    public Triangle setBase(double y)
    {
       base=y;
       return this;
    }
    public Triangle setHeight(double z)
    {
       height=z;
       return this;
    }
    @Override
    public void onAreaChange()
    {
       area=(base/2)*height;
       System.out.println(area);
    }
}