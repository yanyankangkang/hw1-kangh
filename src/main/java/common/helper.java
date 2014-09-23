package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class helper {
  private File inputFile;

  int denominator, numerator;

  static public ArrayList<String> dict = new ArrayList<String>();

  public helper(String file_name) throws FileNotFoundException {
    inputFile = new File(file_name);
    Scanner in = new Scanner(inputFile);
    while (in.hasNext()) {
      String line = in.nextLine();
      String s[] = line.split("\\|");
      dict.add(s[2]);
    }
  }

  public void Match(String s) {
    if (dict.contains(s)) {
      numerator++;
    }
  }

  public double accuracy() {
    return numerator * 1.0 / denominator;
  }

}
