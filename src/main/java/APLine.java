public class APLine
{
  private double aVal;
  private double bVal;
  private double cVal;
  public APLine(double a, double b, double c){
    aVal = a;
    bVal = b;
    cVal = c;
  }
  public double getSlope(){
    double slope = -a/b;
    return slope;
  }
  public boolean isOnLine(double x, double y){
    if(((aVal*x)+(bVal*y)+cVal) == 0)
      return true;
    return false;
  }
  
}
