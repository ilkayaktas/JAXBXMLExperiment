import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

//<?xml version="1.0" encoding="UTF-8"?>
//<employee>
//    <id>1</id>
//    <firstName>Lokesh</firstName>
//    <lastName>Gupta</lastName>
//    <department>
//        <id>101</id>
//        <name>IT</name>
//    </department>
//</employee>

@XmlRootElement(name = "employee")
@XmlType(propOrder={"id", "firstName" , "lastName", "department" })
public class Employee03 implements Serializable
{
    private Integer id;
    private String firstName;
    private String lastName;
    private Department department;
}