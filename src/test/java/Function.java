import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.*;

public class Function {
    @FindBy(id = "searchBox")
    private WebElement input;
    @FindBy(className = "mr-2")
    public List<WebElement> bookList;
    @FindBy(className = "rt-noData")
    private WebElement text;

    public void search(String bookName) {
        input.click();
        input.clear();
        input.sendKeys(bookName);
    }

    public int getBookCount() {
        return bookList.size();
    }

    public void fundElem() {
        assertEquals(text.getText(), "No rows found");
    }
}
