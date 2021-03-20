import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

//<?xml version="1.0" encoding="UTF-8"?>
//<employee>
//    <hobbies>
//        <hobby>Swimming</hobby>
//        <hobby>Playing</hobby>
//        <hobby>Karate</hobby>
//    </hobbies>
//</employee>

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee09 implements Serializable
{
    @XmlElementWrapper(name="hobbies")
    @XmlElement(name="hobby")
    private List<String> hobbies;
}