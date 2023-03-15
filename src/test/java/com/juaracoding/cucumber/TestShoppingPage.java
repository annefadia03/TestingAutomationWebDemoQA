package com.juaracoding.cucumber;

import com.juaracoding.cucumber.pages.LoginShoppingPage;
import com.juaracoding.cucumber.pages.ShoppingPage;
import com.juaracoding.cucumber.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestShoppingPage {
    public static WebDriver driver;
    public static LoginShoppingPage loginShoppingPage = new LoginShoppingPage();
    public static ShoppingPage shoppingPage = new ShoppingPage();
    public TestShoppingPage(){
        driver = Hooks.driver;
    }

    @When("User click button ToolsQa Demo Site")
    public void user_click_button_toolsqa_demo_site(){
        System.out.println("User click button ToolsQa Demo Site");
        //step action
        shoppingPage.clickToHome();
        System.out.println("Masuk ke Menu Utama");
    }

    @And("User go to Product Page")
    public void user_go_to_product_page(){
        //step verify
        Assert.assertEquals(shoppingPage.getJudul(), "FOR LADIES");
        System.out.println(shoppingPage.getJudul()+" dipilih");
    }

    @And("User click one product")
    public void user_click_one_product(){
        System.out.println("User click one product");

        //step action
        shoppingPage.clickSepatu();
        shoppingPage.chooseVariant();
        System.out.println("Sepatu Heels : "+shoppingPage.getNamaSepatu());

        //step verify
        Assert.assertEquals(shoppingPage.getNamaSepatu()," BLACK POINTED TOE BARELY THERE PATENT HEELS");

    }

    @And("User adding product to cart")
    public void user_adding_product_to_cart(){
        System.out.println("User adding product to cart");

        //step action
        shoppingPage.clickFixOrder();
        System.out.println("Berhasil menambahkan ke keranjang");
        Hooks.delay(Constants.DETIK);

        //setelah berhasil dimasukan ke chart
        Assert.assertTrue(ShoppingPage.pesanMasukKeranjang().contains("added to your cart"));
    }

    @And("User see the product in the cart")
    public void user_see_the_product_in_the_cart(){
        System.out.println("User see the product in the cart");
        //stepAction
        shoppingPage.clickBtnCart();
        System.out.println("Cart Opened");
        System.out.println("Menu sekarang : "+shoppingPage.getTxtChart());

        //step verify
        Assert.assertEquals(shoppingPage.getTxtChart(),"CART");
        Hooks.delay(Constants.DETIK);

    }

    @And("User click button checkout")
    public void user_click_button_checkout(){
        System.out.println("User click button checkout");
        shoppingPage.clickButtonCheckout();
    }

    @And("User input first name and last name")
    public void user_input_first_name_and_last_name(){
        System.out.println("User input first name and last name");
        shoppingPage.inputFirstNameAndLastName("Anne","Fadia");
    }
    @And("User input company name")
    public void user_input_company_name(){
        System.out.println("User input company name");
        shoppingPage.setInputCompany("Juara Coding");

    }
    @And("User add country")
    public void user_add_country(){
        System.out.println("User add country");
        shoppingPage.setAddCountry("Indonesia");
        Hooks.delay(Constants.DETIK);
    }

    @And("User input street addres")
    public void User_input_street_addres(){
        System.out.println("User input street addres");
        shoppingPage.inputStreetAddres("Padang");
    }

    @And("User input town or city")
    public void user_input_town_or_city(){
        System.out.println("User input town or city");
        shoppingPage.inputCity("Padang");
    }

    @And("User input province")
    public void user_input_province(){
        System.out.println("User input province");
        shoppingPage.setAddProvince("Sumatera Barat");
        Hooks.delay(Constants.DETIK);
    }

    @And("User input postcode")
    public void user_input_postcode(){
        System.out.println("User input province");
        shoppingPage.inputPostCode("26732");
    }
    @And("User input phone")
    public void User_input_phone(){
        System.out.println("User input phone");
        shoppingPage.setInputPhoneNumber("082284300650");
    }

    @And("User click agreement")
    public void user_click_agreement(){
        System.out.println("User click agreement");
        shoppingPage.setClickAgreement();
        Hooks.delay(Constants.DETIK);
    }

    @And("User click button placeorder")
    public void user_click_button_placeorder(){
        System.out.println("User click button placeorder");
        shoppingPage.setBtnPlaceOrder();
    }

    @Then("User get message succes order")
    public void User_get_message_succes_order(){
        System.out.println("User get message succes order");
        shoppingPage.getSuccesOrder();
        Hooks.delay(Constants.DETIK);

        //step verify
        Assert.assertEquals(shoppingPage.getSuccesOrder(),"Thank you. Your order has been received.");
    }
}
