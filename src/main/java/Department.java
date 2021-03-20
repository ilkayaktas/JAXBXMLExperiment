import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ilkayaktas on 20.03.2021 at 13:40.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }
}
