// Class Square definition

public class Square extends Rectangle  {
   // constructor
   public Square(double x1, double y1, double x2, double y2,
      double x3, double y3, double x4, double y4) {
      super(x1, y1, x2, y2, x3, y3, x4, y4);
   } 

   // return string representation of Square object
   @Override
   public String toString() {
      String str = String.format("Coordinates of square are %s", returnCoordsAsString());
   	  return str + String.format("Side is %.2f  Area is: %.2f\n\n", getHeight(), getArea());
   } 
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and Prentice      *
 * Hall. All Rights Reserved.                                             *
 * Modified By Rosenthal                                                  *
                   
 *************************************************************************/