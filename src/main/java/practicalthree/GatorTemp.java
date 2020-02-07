package practicalthree;

/** Implements a temperature check for dormant gators.
 *
 * @author Solution Repository
 */
public class GatorTemp {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Comfortable gator temperature
    double goodTemp = 10.5;
    // High temperature in celsius
    int tempInF = 55;
    // Evaluate conversion expression
    double tempInC = 5.0 / 9 * (tempInF - 32);
    // Create "truthy" test
    boolean isTemperate = tempInC >= goodTemp;
    // Print result
    System.out.println("Changing temperature from " + tempInF + "F -> " + tempInC + "C");
    System.out.println("Temperature good for gators: " + isTemperate);
  }
}