public class Cylinder {
  double r;
  double h;

  public Cylinder(double r, double h) {
    this.r = r;
    this.h = h;
  }

  public double getArea() {
    return (Math.PI * (this.r*this.r) * this.h);
  }
  public double getSA() {
    return (2 * (Math.PI) * (this.r * this.r) * this.h) + (2 * (Math.PI) * this.r * this.h);
  }
}
