package appium.stepDef;

import appium.page.CheckoutPage;
import appium.page.DetailKamarPage;
import appium.page.DetailKostPage;
import appium.page.HomePage;
import appium.page.KonfirmasiPemilikPage;
import appium.page.LoginPage;
import appium.page.PengajuanSewaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.Ko;
import appium.BaseTest;
import appium.page.CheckoutPage;
import appium.page.HomePage;
import appium.page.DetailKamarPage;
import appium.page.DetailKostPage;
import appium.page.PengajuanSewaPage;
import appium.page.KonfirmasiPemilikPage;


public class CheckOutDef extends BaseTest {

    HomePage hp = new HomePage();
    DetailKostPage dkost = new DetailKostPage();
    DetailKamarPage dkamar = new DetailKamarPage();
    PengajuanSewaPage ps = new PengajuanSewaPage();
    CheckoutPage cp = new CheckoutPage();
    KonfirmasiPemilikPage kpp = new KonfirmasiPemilikPage();

    @And ("User click on Kost Permata Medang")
    public void clickKost(){
        hp.clickKost2();
    }

    @And ("User is on Detail Kost page")
    public void onDetailKostPage(){
        dkost.onDetailKostPage();
    }

    @And ("User click Pilih button")
    public void clickPilih(){
        dkost.clickPilih();
    }

    @And ("User is on Detail Kamar page")
    public void onDetailKamarPage(){
        dkamar.onDetailKamarPage();
    }

    @And ("User click on Pilih Tanggal button")
    public void clickKalender(){
        dkamar.clickKalender();
    }

    @And ("User click on 28 Februari 2023")
    public void clickTanggal(){
        dkamar.pilihTanggal();
    }

    @And ("User click Select button")
    public void clickSelect(){
        dkamar.clickSelect();
    }

    @And ("User click Durasi Sewa button")
    public void clickDuration(){
        dkamar.clickDuration();
    }

    @And ("User click Monthly button")
    public void clickMonthly(){
        dkamar.pilihDurasi();
    }

    @And ("User click Ajukan Sewa button")
    public void clickAjukanSewa(){
        dkamar.clickSewaBtn();
    }

    @And ("User is on Pengajuan Sewa Kost page")
    public void onPengajuanSewaPage(){
        ps.onPengajuanSewaPage();
    }

    @And ("User click Ajukan Sewa Kos Sekarang")
    public void clickAjukanSewaSkrg(){
        ps.clickSewaBtn();
    }

    @Then ("User is on Konfirmasi Pemilik Kos page")
    public void onKonfirmasiPage(){
        kpp.onKonfirmasiPenyediaPage();
    }

}
