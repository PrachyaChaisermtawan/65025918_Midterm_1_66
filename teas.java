public class teas {
  public static void main(String[] args) {
    Student student1 = new Student(001,"Keen",65,3.00);
    Student student2 = new Student(002,"Teen",64,4.00);
    Student student3 = new Student(003,"ceen",63,3.10);
    Student student4 = new Student(004,"Been",62,2.98);
    
    
    
    student1.ShowDetails();
    System.out.println("Student 1");
    student2.ShowDetails();
    System.out.println("Student 2");
    student3.ShowDetails();
    System.out.println("Student 3");
    student4.ShowDetails();
    System.out.println("Student 4");
  
  
  }
}  
  
  class Student{
    String stName;
    Integer stID,stAdyear;
    double stGPA;

    Student(int ID,String Name,int addmissionYear,double GPA){
      stID = ID;
      stName = Name;
      stAdyear = addmissionYear;
      stGPA = GPA; 
    }
    
    
    public void ShowDetails() {
        
        System.out.println("******************************************");
        System.out.println("ID :"+stID);
        System.out.println("Name :"+stName);
        System.out.println("addmissionYear :"+stAdyear); 
        System.out.println("GPA :"+stGPA);


  }
}