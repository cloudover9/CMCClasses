import dblibrary.project.csci230.*;
import java.util.*;
/*
 * File:AdminInterface.java
 */

/**
 * All the functionalities which the admin should be able to do
 * @author Ian Bush
 * @version February 22, 2018
 */
public class AdminInterface
{
  private AdminFuncController ad;
  
  /**
   * Constructor for the AdminInterface
   */
  public AdminInterface()
  {
    this.ad = new AdminFuncController();
  }
  
  /**
   * Shows a list of all universities in the system
   */
  public void viewUniversities()
  {
    ad.viewUniversities();
  }
  
  /**
   * Shows a list of all users in the system (both general and admin)
   */
  public void viewUsers()
  {
    ad.viewUsers();
  }
  
  /**
   * Modifies a university
   * 
   * @param univ The University to modify
   */
  public void editUniversity(String univ)
  {
    // Ask which university to edit
    // Continuous loop asking what to edit
    ad.saveUnivChanges(univ);
  }
  
  /**
   * Adds a university to the database
   */
  public void addUniversity()
  {
    Scanner sc = new Scanner(System.in);
    String schoolName = sc.next("Enter school name");
    String state = sc.next("Enter state");
    String location = sc.next("Enter location");
    String control = sc.next("Enter control");
    System.out.println("Enter number of students");
    int students = sc.nextInt();
    System.out.println("Enter female percentage");
    int femPerc = sc.nextInt();
    System.out.println("Enter SAT verbal score");
    int satV = sc.nextInt();
    System.out.println("Enter SAT math score");
    int satM = sc.nextInt();
    System.out.println("Enter cost");
    int cost = sc.nextInt();
    System.out.println("Enter financial aid percentage");
    int finAidPerc = sc.nextInt();
    System.out.println("Enter applicants");
    int applicants = sc.nextInt();
    System.out.println("Enter number of admitted students");
    int admitted = sc.nextInt();
    System.out.println("Enter number of enrolled students");
    int enrolled = sc.nextInt();
    System.out.println("Enter academic scale");
    int acadScale = sc.nextInt();
    System.out.println("Enter quality scale");
    int qualScale = sc.nextInt();
    ArrayList<String> emphases = new ArrayList<String>();
    String emphasis = sc.next("Enter an emphasis. Press enter without typing anything to finish.");
    while(!emphasis.equals("")){
      emphases.add(emphasis);
      emphasis = sc.next("Enter an emphasis. Press enter without typing anything to finish.");
    }
    University u = new University(schoolName, state, location, control, students, femPerc, satV, satM, cost,
                                  finAidPerc, applicants, admitted, enrolled, acadScale, qualScale, emphases);
    ad.addUniversity(u);
  }
  
  /**
   * Adds an account to the database
   */
  public void addAccount()
  {
    ArrayList<String> information = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    
    // Ask the admin for new username
    System.out.println("Please enter a new username");
    information.add(sc.next());
    
    // Ask the admin for new password
    System.out.println("Please enter a new password");
    information.add(sc.next());
    
    // Enter the active as "y" (default)
    // y is stored as a character in Database; changed to character in AdminFuncController
    information.add("y");
    
    // Ask the admin for new first name
    System.out.println("Please enter the user's first name");
    information.add(sc.next());
    
    // Ask the admin for new last name
    System.out.println("Please enter the user's last name");
    information.add(sc.next());
    
    // Ask the admin for new type
    System.out.println("Please enter the user's type");
    information.add(sc.next());
    
    ad.addAccount(information);
  }
  
  /**
   * Modifies a user
   * @param usr the user to modify
   */
  public void editUser(Account usr)
  {
    ad.saveAccountChanges(usr);
  }
  
  /**
   * Deactivates a user
   * pre: the admin must agree (type y for yes) on prompt
   * post: the user will be deactivated, and no longer able to access the system
   * @param usr the user to deactivate
   */
  public void deactivate(Account usr)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Are you sure you want to deactivate this user?" + '\n'
                         + "Type y for 'yes'" + '\n' + "Type n for 'no'");
    String prompt = sc.next();
    if(prompt == "y"){
      char active = usr.getActive();
      if(active == 'y'){
        usr.setActive('n');
      }
      ad.saveAccountChanges(usr);
    }
  }
  
  /**
   * Brings the admin to their homepage
   */
  public void homepage()
  {
    Scanner sc = new Scanner(System.in);
    String prompt = sc.next("Welcome to the Admin Homepage:" + '\n' + 
                            "\nType 1 to Manage Universities" + '\n' + 
                            "\nType 2 to Manage Users" + '\n' + 
                            "\nType 3 to Logout");
    if(prompt == "1"){
      String cmd1 = sc.next("Would you like to add or edit Universities?" + '\n' +
                            "Type a to Add Universities" + '\n' + 
                            "Type e to Edit Universities");
      if(cmd1 == "a"){
        addUniversity();
      }
      else if(cmd1 == "e"){
        editUniversity();
      }
      else{
      }
    }
    else if(prompt == "2"){
      
    }
    else{
      
    }
    
    
  }
}