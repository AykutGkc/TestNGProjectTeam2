package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;


    static {
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties=new Properties(); //objeyi olusturduk ve atamasini gerceklestirdik.
            properties.load(fis); //fis'in okudugu bilgileri propertiesE' yükledik
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //properties dosyasindaki key degerini alip test methodumda kullanabilmek icin bir mehod olusturmaliyiz.
    public static String getProperty(String Key){ //String bir deger döndürmesi icin String bir parametre atariz.
        /*
        Test methodundan gönderdigimiz string key degerini alip ConfigReader class'indan
        getProperty() methodunu kullanarak bu key'E ait value'yu bize getirir.
         */

        return properties.getProperty(Key);
    }

}
