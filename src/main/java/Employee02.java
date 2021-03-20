import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//<?xml version="1.0" encoding="UTF-8"?>
//<employee>
//    <department>
//        <id>101</id>
//        <name>IT</name>
//    </department>
//    <firstName>Lokesh</firstName>
//    <id>1</id>
//    <lastName>Gupta</lastName>
//</employee>

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee02 implements Serializable
{
    private Integer id;
    private String firstName;
    private String lastName;
    private Department department;
}
