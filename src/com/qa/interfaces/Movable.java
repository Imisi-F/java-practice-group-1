package com.qa.interfaces;

import com.qa.inheritance.Point;

public interface Movable {
         public Point getCurrentLocation();
         public void move(double x, double y);
}
