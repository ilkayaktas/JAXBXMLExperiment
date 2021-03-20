import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

//<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//<employee>
//    <id>1</id>
//    <firstName>Lokesh</firstName>
//    <lastName>Gupta</lastName>
//    <department>
//        <id>101</id>
//        <name>IT</name>
//    </department>
//    <hobbies>
//        <hobby>Swimming</hobby>
//        <hobby>Playing</hobby>
//        <hobby>Karate</hobby>
//    </hobbies>
//</employee>

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee10 implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlAttribute
    private Integer some;
    @Setter @Getter private Integer id;
    @Setter @Getter private String firstName;
    @Setter @Getter private String lastName;
    @Setter @Getter private Department department;

    @XmlElementWrapper(name="hobbies")
    @XmlElement(name="hobby")
    @Setter @Getter private List<String> hobbies;

    public Employee10() {
        super();
    }

    public Employee10(int id, String fName, String lName, Department department) {
        super();
        this.id = id;
        this.some = id+1;
        this.firstName = fName;
        this.lastName = lName;
        this.department = department;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}