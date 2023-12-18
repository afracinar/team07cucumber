package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.n11_Page;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class n11_StepDefinitions {

    n11_Page n11_page = new n11_Page();
    ExcelUtils excelUtils;
    List<Map<String, String>> excelData;

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici markalar butonuna tiklar")
    public void kullaniciMarkalarButonunaTiklar() {
        ReusableMethods.waitFor(10);
        Driver.clickWithJS(n11_page.markalarButton);
    }

    @Then("kullanici A harfine tiklar")
    public void kullaniciAHarfineTiklar() {
        n11_page.aButton.click();
    }

//    @And("A harfli tum markalar excelde yazdirilir")
//    public void aHarfliTumMarkalarExceldeYazdirilir() throws IOException {
//
//        List<WebElement> tumAHarfliMarkalar = Driver.getDriver().findElements(By.xpath("//*[@class='list']"));
//        for (WebElement w : tumAHarfliMarkalar) {
//            System.out.println("tumAHarfliMarkalar = " + w.getText());
//        }
//        String path = "./src/test/resources/Capitals.xlsx";
//        FileInputStream fileInputStream = new FileInputStream(path);
//        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        Sheet sheet = workbook.getSheet("n11_sheet");
//        Row row = sheet.createRow(0);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("MARKALAR");
//
//        for (int i = 0; i < tumAHarfliMarkalar.size(); i++) {
//            row = sheet.createRow(i+1);
//            cell = row.createCell(0);
//            String hepsi =tumAHarfliMarkalar.get(i).getText();
//            cell.setCellValue(hepsi);
//        }
//        FileOutputStream fileOutputStream = new FileOutputStream(path);
//        workbook.write(fileOutputStream);
//    }


    @And("A harfindeki tum markalarin ismi excel {string} sayfasina yazdirilir")
    public void aHarfindekiTumMarkalarinIsmiExcelSayfasinaYazdirilir(String sayfaAdi) throws IOException {

//        List<String> listele = ReusableMethods.getElementsText(By.xpath("//*[@class='list']"));
//
//        for (int i = 0; i < listele.size(); i++) {
//
//            String path = "./src/test/resources/Capitals.xlsx";
//            excelUtils = new ExcelUtils(path, sayfaAdi);
//
//            excelUtils.setCellData(listele.get(i), i + 12, i+1);
//
//        }



   //     =======================================================
//        String path = "./src/test/resources/Capitals.xlsx";
//        FileInputStream fileInputStream = new FileInputStream(path);
//        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        Sheet sheet = workbook.getSheet(sayfaAdi);
//        Row row = sheet.createRow(0);
//        Cell cell = row.createCell(7);
//        cell.setCellValue("MARKALAR");
//        FileOutputStream fileOutputStream = new FileOutputStream(path);
//        workbook.write(fileOutputStream);
//    }
    }
    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }
}

