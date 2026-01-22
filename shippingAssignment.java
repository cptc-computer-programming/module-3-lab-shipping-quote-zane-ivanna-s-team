public class shippingAssignment {
  public static final double WEIGHT_RATE = 0.50;
  public static final double DENSITY_RATE = 1.0;
  public static final double SURFACE_AREA_RATE = 0.25;

    public static void main(String[] args) {
        int weight = (int)(Math.random() * 15) + 1; 
        int width = (int)(Math.random() * 15) + 1; 
        int length = (int)(Math.random() * 15) + 1; 
        int height = (int)(Math.random() * 15) + 1; 
        int volume = length * width  * height;
        boolean density = getDensity(weight, volume);
        int surfaceArea = getSurfaceArea(length, height, width);
        double densityCost = densityCost(density, DENSITY_RATE);
        double surfaceAreaCost = surfaceAreaCost(surfaceArea, SURFACE_AREA_RATE);
      }  
    
    public static boolean getDensity (int weight, int volume ) {
      return (weight / volume) >= 40;
    }

    public static int getSurfaceArea(int length, int height, int width) {
      return 2 * ((length * height) + (length * width) + (width * height));
    }

    public static double densityCost(boolean density, double rate) {
      if (density == true) {
        double densityCost = rate;
        return densityCost;
      }
      else {
        return 0;
      }
    }

    public static double surfaceAreaCost(int surfaceArea, double rate) {
      return surfaceArea * rate;
    }
    
}
