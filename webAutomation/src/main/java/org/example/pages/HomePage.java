package org.example.pages;

import org.example.modles.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    By searchIcon = By.cssSelector("summary[aria-label='Search']");
    By searchBar = By.id("Search-In-Modal");
    By searchResults = By.cssSelector("li[id^='predictive-search-option'] a");
    By productName = By.cssSelector(".predictive-search__item-heading");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage search(String searchItem) {
        actions.click(searchIcon);
        actions.type(searchBar, searchItem);
        return this;
    }

    public List getSearchItems() {
        List elements = waits.waitUntilAllElementsAreVisible(searchResults);
        List items = new ArrayList<>();

        for(Object element : elements) {
            String name = actions.getChildText((WebElement) element, productName);
            Item item = new Item(name);
            item.setName(name);
            items.add(item);
        }

        return items;
    }
}
