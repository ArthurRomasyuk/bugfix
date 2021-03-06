package bug_3;

import bug_1.CustomEnum;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReading {
    public static void main(String[] args) throws IOException {
        String username = "admin";
        String password = "1234";

        Properties properties = new Properties();
        InputStream inputStream = CustomEnum.class.getResourceAsStream("credentials.properties");//please use relative path, not absolute
       //так как у нас относительный путь, а стрим мы подтягиваем в CustomEnum, то нам необходимо переименовать папку в  ресурсах
        // с bug_2 на bug_1
        properties.load(inputStream);
        final String adminUserName = properties.getProperty(username);
        final String adminPassword = properties.getProperty(password);

        System.out.println("should be the same " + username == adminUserName);
        System.out.println("should be the same " + password == adminPassword);
    }
}
