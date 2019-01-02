import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;

public class JsonRunner {
    public static void writePersonToJson(Person person) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("person.json"), person);

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        Person p = new Person("Ivan", "Stepanov", 30, false);
        writePersonToJson(p);
    }
}
