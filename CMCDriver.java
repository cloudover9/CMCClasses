import java.util.Scanner;
/*
 * File:CMCDriver.java
 */
import java.util.*;
/**
 * The main class for the CMC project
 * @author Ian Bush
 * @version February 25, 2018
 */
public class CMCDriver
{
  public static void main(String [] args)
  {
    System.out.println("Welcome to CMC");
    Scanner sc = new Scanner(System.in);
    
    new AccountInterface().start();
  }
}