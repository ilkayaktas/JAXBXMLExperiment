import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//<?xml version="1.0" encoding="UTF-8"?>
//<employee>
//    <employeeId>1</employeeId>
//    <firstName>Lokesh</firstName>
//</employee>

@XmlRootElement(name = "employee")
public class Employee04 implements Serializable
{
    @XmlElement(name="employeeId")
    private Integer id;

    @XmlElement
    private String firstName;

    private String lastName;
    private Department department;
}