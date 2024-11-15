import java.util.ArrayList;

public class Lecturer extends Person {

    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    //constructor
    public Lecturer(String name, String position, Department department) {
        super.setName(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    // lecturer's details
    @Override
    public void displayInfo(){
        System.out.println("Lecturer's Name: "+ super.getName());
        System.out.println("Having position: "+ this.position + ". Working on" + this.department);
    }
    
    // getter and setter for position
    public void setName(String position){
        this.position = position;
    }
    public String getPosition(){
        return this.position;
    }

    //getter and setter for department
    public void setDepartment(Department depatment){
        this.department = department;
    }
    public Department getDepartment(){
        return this.department;
    }

    public void displayDepartmentInfo(){
        if(department != null){
           System.out.println(department);
        }
        else{
            System.out.println("No department assigned");
        }
    }

    // add course method
    public void addCourse(Course course){
        coursesTeaching.add(course);
    }

    // remove course
    public void removeCourse(Course course){
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching(){
        System.out.println("Courses overview");

        // foreach loop
        for(Course unit: coursesTeaching){
            System.out.println(unit);
        };
    }
    


}
