import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//<employee>
//....
//</employee>

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.PROPERTY)
@ToString
public class Employee00 implements Serializable {
    private int id;
    private String name;
}
