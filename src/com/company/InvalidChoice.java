package com.company;

public class InvalidChoice extends Exception {
  public String toString() {
      return "\nInvalid choice your options are 1, 2 or 3 \n";
  }
}
