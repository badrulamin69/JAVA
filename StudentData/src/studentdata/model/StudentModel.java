
package studentdata.model;

public class StudentModel {
    
    int id;
    String name;
    String email;
    String Course;
    String contact;

    public StudentModel() {
    }

    public StudentModel(int id, String name, String email, String Course, String contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.Course = Course;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
