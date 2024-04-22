public class APLine
{
  public APLine(double a, double b, double c){
    private double aVal = a;
    private double bVal = b;
    private double cVal = c;
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
