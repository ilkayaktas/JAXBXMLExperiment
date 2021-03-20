import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//<?xml version="1.0" encoding="UTF-8"?>
//<employee id="1">
//    <department>
//        <id>101</id>
//        <name>IT</name>
//    </department>
//    <firstName>Lokesh</firstName>
//    <lastName>Gupta</lastName>
//</employee>

@XmlRootElement(name = "employee")
public class Employee05 implements Serializable
{
    @XmlAttribute
    private Integer id;

    private String firstName;
    private String lastName;
    private Department department;
}