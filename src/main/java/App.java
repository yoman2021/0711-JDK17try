/**Some javadoc.
 *
 * @author 107ncyu
 * @version JDK17
 *
 */
public class App {

  /**Some javadoc.
   *
   * @author 107ncyu
   *
   *
   */
  public static void main(String[] args) {
    System.out.println("hello world");

    GradeConverter converter = new GradeConverter();

    for (int i = 0; i < 105; i++) {
      System.out.println(i + ";" + converter.convert(i));
    }
  }
}