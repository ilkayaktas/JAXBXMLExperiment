import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

//<?xml version="1.0" encoding="UTF-8"?>
//<employee>
//    <hobbies>Swimming</hobbies>
//    <hobbies>Playing</hobbies>
//    <hobbies>Karate</hobbies>
//</employee>

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee07 implements Serializable
{
    private List<String> hobbies;
}