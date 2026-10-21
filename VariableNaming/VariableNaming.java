// 問2.以下の不適切な変数名を修正してください。
public class VariableNaming {

  public void calculateNumbers() {
    /*
     * パターン1
     */
    int firstNumber = 10;
    int secondNumber = 20;

    /*
     * パターン2
     */
    int thirdNumber = 5;
    int fourthNumber = 3;

    /*
     * パターン3
     */
    int fifthNumber = 100;

    int firstSum = firstNumber + secondNumber;
    int secondSum = thirdNumber + fourthNumber + fifthNumber;

    System.out.println(firstSum);
    System.out.println(secondSum);
  }
}
