 
package association;
 
public class Students implements CSE,EEE{
    
    private String name ,department;
    private int age ;
     
     Students(String name,int age,String department){
     this.name = name;
     this.age = age;
     this.department = department;
    }
    
    public String getName(){
      return name;
    }
    public int getAge(){
      return age;
    }
    public String getDepartment(){
      return department;
    }
    @Override
    public String showWork(){
    if(department.equals("CSE"))
    {
     return "He is doing Programming";
    }
    else 
        return "He is making Robot" ;
   
    }
    
    @Override
    public String showApp(){
      return "This is our VideoMergerApp";
    }
    @Override
    public String showRobot(){
      return "This is our Robot Transformer";
    }
    
}
