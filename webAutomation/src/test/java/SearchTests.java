import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.HomePage;
import org.example.pages.LauncherPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests {
    List searchItems;
    @Test

    public void verifyIfSearchTermShowsRelevantResults() {
        //Arrange
        String searchItem = "Jeans";
        String searchKey = "Jean";
        String browser = "chrome";
        WebDriverManager.chromedriver();
        WebDriver webDriver = new ChromeDriver();
        LauncherPage launcherPage = new LauncherPage(webDriver);
        launcherPage.navigateTo("https://web-playground.ultralesson.com/");

        //Act
        HomePage homepage = new HomePage(webDriver);
        homepage.search(searchItem);
         searchItems= homepage.getSearchItems();

        //Assert
        Assert.assertEquals(4,
                searchItems.size());
//        Assert.assertTrue(searchItems.stream().allMatch(item -> item.getName().contains(searchKey)));
    }
//    @Test
//    public void verifySearchUnavailableProduct() {
//        // Arrange
//        String unavailableProduct = "Unobtainium Widget";
//        WebDriver webDriver =new DriverCreator().create("chrome");
//
//        LauncherPage launcherPage = new LauncherPage(webDriver);
//        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//
//        // Act
//        HomePage homepage = new HomePage(webDriver);
//        homepage.search(unavailableProduct);
//        List  searchItems = homepage.getSearchItems();
//
//        // Assert
//       Assert.assertTrue(searchItems.isEmpty());
//    }
//    @Test
//    public void verifyBrandSearchListsOnlyBrandItems() {
//        // Arrange
//        String brandName = "Nike";
//        WebDriver webDriver = null;
//
//        LauncherPage launcherPage = new LauncherPage(webDriver);
//        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//
//        // Act
//        HomePage homepage = new HomePage(webDriver);
//        homepage.search(brandName);
////        List<Item> searchItems = homepage.getSearchItems();
//
//        // Assert
//        Assert.assertTrue(searchItems.stream().allMatch(item -> item.getName().contains(brandName)));
//    }
//    @Test
//    public void verifySearchResultCountMatchesDisplayedItems() {
//        // Arrange
//        String searchItem = "Shoes";
//        WebDriver webDriver = null;
//
//        LauncherPage launcherPage = new LauncherPage(webDriver);
//        launcherPage.navigateTo("https://web-playground.ultralesson.com/");
//
//        // Act
//        HomePage homepage = new HomePage(webDriver);
//        homepage.search(searchItem);
//        List<Item> searchItems = homepage.getSearchItems();
////        int itemCountDisplayed = homepage.getItemCount(); // Assume getItemCount method returns the number displayed on the page
//
//        // Assert
////        Assert.assertEquals(searchItems.size(), itemCountDisplayed);
//    }
//
}