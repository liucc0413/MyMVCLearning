package SixTeen;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("country="+locale.getCountry());
        System.out.println("language="+locale.getLanguage());

        Locale currentLocale = new Locale("en","US");
        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", currentLocale);
        MessageFormat mf = new MessageFormat(bundle.getString("k1"));
        System.out.println(mf.format(new Object[]{"刘翠翠"}));
    }
}
