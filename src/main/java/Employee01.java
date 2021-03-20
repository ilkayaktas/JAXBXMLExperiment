import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//<employee>
//    <firstName>Lokesh</firstName>
//    <id>1</id>
//    <lastName>Gupta</lastName>
//</employee>

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee01 implements Serializable
{
    private Integer id;
    private String firstName;
    private String lastName;
}
