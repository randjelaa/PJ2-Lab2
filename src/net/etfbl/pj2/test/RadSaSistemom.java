package net.etfbl.pj2.test;
import java.util.Properties;

/** Klasa za rad sa klasom System
 * @author Andjela R.
 * @version 1.0
 */
public class RadSaSistemom {
    public static void main(String[] args) {
       String propertiesArray[] = {"java.version", "java.home", "java.vm.name", 
                                   "java.class.version", "java.library.path", 
                                   "os.name", "user.name"};
       Properties properties = System.getProperties();
       for (String key : propertiesArray) {
            String value = properties.getProperty(key);
            System.out.println(key + " = " + value);
       }  
    }
}
