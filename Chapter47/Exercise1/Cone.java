
public class Cone {
  double r;
  double h;

  public Cone(double r, double h) {
    this.r = r;
    this.h = h;
  }

  public double getR() {
    return this.r;
  }
  public double getH() {
    return this.h;
  }
  public void setR(double r) {
    this.r = r;
  }
  public void setH(double h) {
    this.h = h;
  }

  public double slantHeight() {
    return java.lang.Math.sqrt((this.r*this.r) + (this.h*this.h));
  }
  public double angle() {
    return java.lang.Math.atan(this.r/this.h);
  }
}
