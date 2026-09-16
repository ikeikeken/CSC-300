// Class Point definition

public class Point { 
   private double x; // x coordinate
   private double y; // y coordinate
 
   public Point(){} //default constructor
   
   // two-argument constructor
   public Point(double x, double y) {
      this.x = x; 
      this.y = y;
   } 

   // return x
   public double getX() {
      return x;
   } 

   // return y
   public double getY() {
      return y;
   }
   
   // return string representation of Point object
   @Override
   public String toString() {
      return String.format("(%.2f, %.2f)", getX(), getY());
   }
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and Prentice      *
 * Hall. All Rights Reserved.                                             *
 * Modified By Rosenthal                                                  *
           
 *************************************************************************/