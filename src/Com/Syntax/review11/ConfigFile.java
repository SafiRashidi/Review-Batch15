package Com.Syntax.review11;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {
        // location of the file
        String path = "Files/Config.properties";
        // navigate to the file
        // whenever we have to read the data from a file we use FileInputStream
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);

            System.out.println(properties.getProperty("userName"));

        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
        }catch (NullPointerException e){
            System.out.println("You are trying to call a method on Null object");
        }catch (IIOException e){
            System.out.println("IO Exception Occurred");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
