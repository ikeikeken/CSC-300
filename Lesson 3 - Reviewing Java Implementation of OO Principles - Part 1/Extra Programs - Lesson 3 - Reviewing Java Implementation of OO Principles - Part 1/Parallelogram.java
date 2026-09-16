// Class Parallelogram definition

public class Parallelogram extends Trapezoid { 
   // constructor
   public Parallelogram(double x1, double y1, double x2, double y2,
      double x3, double y3, double x4, double y4) {
      super(x1, y1, x2, y2, x3, y3, x4, y4);
   } 

   // return width of parallelogram
   public double getWidth() {
      if (getPoint1().getY() == getPoint2().getY()) {
         return Math.abs(getPoint1().getX() - getPoint2().getX());
      }
      else {
         return Math.abs(getPoint2().getX() - getPoint3().getX());
      }
   }

   // return string representation of Parallelogram object
   @Override
   public String toString() 
   {
      String str = String.format("Coordinates of parallelogram are %s", returnCoordsAsString());
   	  return str + String.format("Width is %.2f Height is %.2f  Area is: %.2f\n\n", getWidth(), getHeight(), getArea());
   }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and Prentice      *
 * Hall. All Rights Reserved.                                             *
 * Modified by Rosenthal                                                  *

 *************************************************************************/