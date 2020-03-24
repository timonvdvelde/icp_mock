import java.util.Scanner;
import java.util.Arrays;

/* Note: this file needs comments!
*/

class Plant {
  int currentWaterLevel;
  int optimalWaterLevel;

  Plant(int cwaterlevel, int owaterlevel) {
    currentWaterLevel = cwaterlevel;
    optimalWaterLevel = owaterlevel;
  }

  /* Gives water to the plant
   */
  void giveWater(int water) {
    currentWaterLevel = currentWaterLevel + water;
    // currentWaterLevel += water;
  }

  /* Reduces water by 2
  */
  void waitDay() {
    currentWaterLevel = currentWaterLevel - 2;
  }

  String checkHealth() {
    int diff = currentWaterLevel - optimalWaterLevel;

    if (diff > 5 || diff < -5) {
      return "This plant is dead.";
    }
    if (diff > 3) {
      return "Too much water, don't do anything!";
    }
    if (diff < -3) {
      return "Give water quick!";
    }

    return "All good";
  }
}

class Main {
  static int[] createEvens(int n) {
    int[] intArray = new int[n];

    // say n = 5
    // i = 0, 1, 2, 3, 4
    // 2 * i = 0, 2, 4, 6, 8
    for (int i = 0; i < n; i++) {
      intArray[i] = 2 * i;
    }

    return intArray;
  }

  public static void main(String[] args) {
    // Assignment 1
    Plant plant1 = new Plant(5, 5);
    System.out.println(plant1.checkHealth());
    plant1.waitDay();
    plant1.waitDay();
    System.out.println(plant1.checkHealth());
    plant1.giveWater(8);
    System.out.println(plant1.checkHealth());
    plant1.giveWater(2);
    System.out.println(plant1.checkHealth());

    // Assignment 2
    Scanner input = new Scanner(System.in);
    System.out.println("Please give an integer.");
    int n = input.nextInt();

    int[] myArray = createEvens(n);

    // Quick way to print an array.
    // System.out.println(Arrays.toString(myArray));

    for (int i = 0; i < n; i++) {
      System.out.println(myArray[i]);
    }
  }
}
