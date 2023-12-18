package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class n11_Page {

    public n11_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='https://www.n11.com/markalar']")
    public WebElement markalarButton;

    @FindBy(xpath = "//*[text()='A']")
    public WebElement aButton;

    @FindBy(xpath = "//*[@class='list']")
    public WebElement aList;

    @FindBy(xpath = "//*[@id='searchData']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@class='selectedText']")
    public WebElement siralaButton;

    @FindBy(xpath = "(//*[@class='pro'])[1]")
    public WebElement birinciUrun;

    @FindBy(xpath = "//*[@data-seller-id='4121355']")
    public WebElement ilkUrunEkleButton;

    @FindBy(xpath = "//*[@class='content']")
    public WebElement acilanPencere;

    @FindBy(xpath = "//*[@id='sku-5455634207']")
    public WebElement beyazKulaklik;

    @FindBy(xpath = "//*[@id='js-addBasketSku']")
    public WebElement sepeteEkle2;

    @FindBy(xpath = "//*[text()='Kargo Seçenekleri']")
    public WebElement kargoSecenekleri;

    @FindBy(xpath = "//*[text()='Ücretsiz Kargo']")
    public WebElement ucretsizKargo;

    @FindBy(xpath = "//*[@id='view']")
    public List<WebElement> ucretsizKargoList;

    @FindBy(xpath = "//*[@data-value='REVIEWS']")
    public WebElement yorumSayisi;

    @FindBy(xpath = "(//*[@data-seller-id='2983415'])[2]")//(//*[@data-category-id='1000490'])[3]
    public WebElement sonUrun;

    @FindBy(xpath = "//*[@id='sku-5449158828']")////*[@id='sku-5181494055']
    public WebElement siyahKulaklik;

    @FindBy(xpath = "//a[@href='//www.n11.com/sepetim']")
    public WebElement sepet;

    @FindBy(xpath = "//*[@class='btn btnBlack']")
    public WebElement tamamButton;

    @FindBy(xpath = "(//*[@class='spinnerUp spinnerArrow'])[2]")
    public WebElement artirma;

    @FindBy(xpath = "(//*[@class='closeBtn'])[5]")
    public WebElement kapat;

//    @FindBy(xpath = "//*[@class='prodAction']")
//    public WebElement sepetUrunArtirma;

    @FindBy(xpath = "//*[@id='js-buyBtn']")
    public WebElement satinAlButton;
}
