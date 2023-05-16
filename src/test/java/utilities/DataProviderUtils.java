package utilities;

import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;

public class DataProviderUtils {
    @DataProvider
    public Object[][] sehirVerileri() {
        return new Object[][]{{"Ankara","IcAnadolu","06"},{"Izmir","Ege","35"},{"Diyarbakir","Dogu","21"}};
    }

    @DataProvider
    public Object[][] kullanicilar() {
        return new Object[][]{{"Aykut","123456789"},{"Gül","1242513512"},{"Erol","3253253253"}};
    }


    @DataProvider
    public Object[][] ihtimaller() throws FileNotFoundException {
        ExcelUtils excelUtils=new ExcelUtils("src/test/java/resourcesErel/veri.xlsx", "veriler");
        return excelUtils.getDataArray();
    }

    @DataProvider
    public Object[][] email() throws FileNotFoundException {
        ExcelUtils excelUtils=new ExcelUtils("src/test/java/resourcesErel/email.xlsx", "email");
        return excelUtils.getDataArray();
    }


    @DataProvider
    public Object[][] passWord() throws FileNotFoundException {
        ExcelUtils excelUtils=new ExcelUtils("src/test/java/resourcesErel/password.xlsx", "password");
        return excelUtils.getDataArray();
    }
}

