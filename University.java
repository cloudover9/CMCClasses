/** 
 * File: University.java
 * 
 * @author Sara Laufers
 * @version February 22, 2018
 * 
 * Description: The University Class holds the properties and 
 * appropriate methods to access these properties of a university
 */

import java.util.ArrayList;

public class University{
  
  // ================================= INSTANCE VARIABLES =================================
  /** The name of the school */
  private String schoolName;
  /** The state of where the Univserity is located ie: Minnesota, California ... */
  private String state;
  /** Suburban, small-city, urban, unknown (-1) ... */
  private String location;
  /** Either private, state, city, or unknown (-1) */
  private String control;
  /** Number of students in the University */
  private int students;
  /** Percentage of female students */
  private int femPerc;
  /** Average SAT verbal score of admitted students */
  private int satV;
  /** Average SAT math score of admitted students */
  private int satM;
  /** The cost of paying for the university */
  private int cost;
  /** Percentage of financial aid that the University offers */
  private int finAidPerc;
  /** Number of applicants */
  private int applicants;
  /** Percentage of applicants that get admitted*/
  private int admitted;
  /** Percentage of admitted students that choose to enroll */
  private int enrolled;
  /** The standard academic scale of the university (1-5)*/
  private int acadScale;
  /** The social life scale of the university (1-5)*/
  private int socScale;
  /** The quality of life scale of the university */
  private int qualScale;
  /** The academic fields the school is best known for ie: Tech, Nursing, etc*/
  private ArrayList<String> emphases;

  // ================================= CONSTRUCTOR =================================
  public University(){
    this.schoolName = "";
    this.state = "";
    this.location = "";
    this.control = "";
    this.students = 0;
    this.femPerc = 0;
    this.satV = 0;
    this.satM = 0;
    this.cost = 0;
    this.finAidPerc = 0;
    this.applicants = 0;
    this.admitted = 0;
    this.enrolled = 0;
    this.acadScale = 0;
    this.socScale = 0;
    this.qualScale = 0;
    this.emphases = new ArrayList<String>();
  }
  
  // ================================= METHODS =================================
  
  // --------------------------------- Accessors ---------------------------------
  public String getName(){
    return schoolName;
  }
  
  public String getState(){
    return state;
  }
  
  public String getLocation(){
    return location;
  }
  
  public String getControl(){
    return control;
  }
  
  public int getStudents(){
    return students;
  }
  
  public int getFemPerc(){
    return femPerc;
  }
  
  public int getSatV(){
    return satV;
  }
  
  public int getSatM(){
    return satM;
  }
  
  public int getCost(){
    return cost;
  }
  
  public int getFinAidPerc(){
    return finAidPerc;
  }
  
  public int getApplicants(){
    return applicants;
  }
  
  public int getAdmitted(){
    return admitted;
  }
  
  public int getEnrolled(){
    return enrolled;
  }
  
  public int getAcadScale(){
    return acadScale;
  }
  
  public int getSocScale(){
    return socScale;
  }
  
  public int getQualScale(){
    return qualScale;
  }
  
  public ArrayList<String> getEmphases(){
    return emphases;
  }
  
  public ArrayList<String> getUniversityDetails(){
    ArrayList<String> detailList = new ArrayList<String>();
    detailList.add(this.getName());
    detailList.add(this.getState());
    detailList.add(this.getLocation());
    detailList.add(this.getControl());
    detailList.add(Integer.toString(this.getStudents()));
    detailList.add(Integer.toString(this.getFemPerc()));
    detailList.add(Integer.toString(this.getSatV()));
    detailList.add(Integer.toString(this.getSatM()));
    detailList.add(Integer.toString(this.getCost()));
    detailList.add(Integer.toString(this.getFinAidPerc()));
    detailList.add(Integer.toString(this.getApplicants()));
    detailList.add(Integer.toString(this.getAdmitted()));
    detailList.add(Integer.toString(this.getEnrolled()));
    detailList.add(Integer.toString(this.getAcadScale()));
    detailList.add(Integer.toString(this.getSocScale()));
    detailList.add(Integer.toString(this.getQualScale()));
    return detailList;
  }
  
  // --------------------------------- Mutators ---------------------------------
  public void setName(String schoolName){
    this.schoolName = schoolName;
  }
  
  public void setState(String state){
    this.state = state;
  }
  
  public void setLocation(String location){
    this.location = location;
  }
  
  public void setControl(String control){
    this.control = control;
  }
  
  public void setStudents(int students){
    this.students = students;
  }
  
  public void setFemPerc(int femPerc){
    this.femPerc = femPerc;
  }
  
  public void setSatV(int satV){
    this.satV = satV;
  }
  
  public void setSatM(int satM){
    this.satM = satM;
  }
  
  public void setCost(int cost){
    this.cost = cost;
  }
  
  public void setFinAidPerc(int finAidPerc){
    this.finAidPerc = finAidPerc;
  }
  
  public void setApplicants(int applicants){
    this.applicants = applicants;
  }
  
  public void setAdmitted(int admitted){
    this.admitted = admitted;
  }
  
  public void setEnrolled(int enrolled){
    this.enrolled = enrolled;
  }
  
  public void setAcadScale(int acadScale){
    this.acadScale = acadScale;
  }
  
  public void setSocScale(int socScale){
    this.socScale = socScale;
  }
  
  public void setQualScale(int qualScale){
    this.qualScale = qualScale;
  }
  
  public void addEmphases(String field){
    this.emphases.add(field);
  }
  
  public void removeEmphases(String field){
    this.emphases.remove(field);
  }
}