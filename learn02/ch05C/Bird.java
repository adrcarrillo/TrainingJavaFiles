package ch05C;

public class Bird {
  int xPos, yPos;

  double fly (int x, int y) {
    double distance = Math.sqrt(x*x + y*y);
//    flap(distance);
    xPos = x;
    yPos = y;
    return distance;
  }
}
