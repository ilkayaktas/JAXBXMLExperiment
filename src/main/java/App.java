import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

/**
 * Created by ilkayaktas on 19.03.2021 at 22:44.
 */

public class App {
    public static void main(String[] args)
    {
        Employee10 employee = new Employee10(1, "Lokesh", "Gupta", new Department(101, "IT"));

        employee.setHobbies(Arrays.asList("Swimming","Playing", "Karate"));

        String result = toXML(employee);

        System.out.println(result);

        employee = fromXML(result);

        System.out.println(employee);
    }

    private static String toXML(Employee10 employee)
    {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee10.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            //Print XML String to file
            jaxbMarshaller.marshal(employee, new File("employee.xml"));

            //Print XML String to console
            jaxbMarshaller.marshal(employee, new OutputStreamWriter(System.out));

            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(employee, sw);

            return sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Employee10 fromXML(String xml){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee10.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            //Print XML String to file
            StringReader reader = new StringReader(xml);
            Employee10 employee = (Employee10) unmarshaller.unmarshal(reader);
            return employee;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
