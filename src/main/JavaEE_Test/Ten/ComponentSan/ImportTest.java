package Ten.ComponentSan;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
@ImportResource(locations = {"spring-ceshi-zhuanyong.xml"})
@Import(Food.class)
public class ImportTest {
}
