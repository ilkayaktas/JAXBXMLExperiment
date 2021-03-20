import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

//<?xml version="1.0" encoding="UTF-8"?>
//<employee>
//    <firstName>Lokesh</firstName>
//    <lastName>Gupta</lastName>
//    <department>
//        <id>101</id>
//        <name>IT</name>
//    </department>
//</employee>

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee06 implements Serializable
{
    @XmlTransient
    private Integer id;

    private String firstName;
    private String lastName;
    private Department department;
}