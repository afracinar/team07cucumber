package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import page.n11_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class n11_Arama_Urun_EklemeStepDefinitions {

    n11_Page n11_page = new n11_Page();
    List<String> kargoList = new ArrayList<>();

    @When("kullanici arama kutusuna kulaklik yazip arar")
    public void kullanici_arama_kutusuna_kulaklik_yazip_arar() {
        n11_page.searchBox.sendKeys("Kulaklik", Keys.ENTER);
    }

    @Then("kullanici sirala butonundan yorum sayisini secer")
    public void kullanici_sirala_butonundan_yorum_sayisini_secer() {
        n11_page.siralaButton.click();
        ReusableMethods.waitFor(1);
        n11_page.yorumSayisi.click();
    }

    @Then("kullanici ucretsiz kargo olanlari secip listeler")
    public void kullanici_ucretsiz_kargo_olanlari_secip_listeler() {
        Driver.clickWithJS(n11_page.kargoSecenekleri);

        n11_page.ucretsizKargo.click();

        for (WebElement w : n11_page.ucretsizKargoList) {
            System.out.println("Sepetteki isimler : " + w.getText());
            kargoList.add(w.getText());
        }
    }

    @Then("kullanici ilk sayfadaki birinci ve sonuncu urunu sepete ekler")
    public void kullanici_ilk_sayfadaki_birinci_ve_sonuncu_urunu_sepete_ekler() {

        Driver.clickWithJS(n11_page.ilkUrunEkleButton);
        Driver.clickWithJS(n11_page.beyazKulaklik);
        ReusableMethods.waitFor(2);
        Driver.clickWithJS(n11_page.sepeteEkle2);

        ReusableMethods.waitFor(5);
        Driver.clickWithJS(n11_page.sonUrun);
        Driver.clickWithJS(n11_page.siyahKulaklik);
        ReusableMethods.waitFor(3);
        Driver.clickWithJS(n11_page.sepeteEkle2);
    }

    @And("kullanici sepete gider ucuz urunu {int} adet yapar")
    public void kullaniciSepeteGiderUcuzUrunuAdetYapar(int urun) {
        ReusableMethods.waitFor(3);
        n11_page.sepet.click();
        ReusableMethods.waitFor(3);
        Driver.clickWithJS(n11_page.kapat);
        Driver.clickWithJS(n11_page.artirma);
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici misafir olarak odemeye gecer")
    public void kullanici_misafir_olarak_odemeye_gecer() {
        Driver.clickWithJS(n11_page.satinAlButton);
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }
}
