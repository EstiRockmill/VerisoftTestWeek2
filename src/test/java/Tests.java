
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Tests extends Base
{

    @Test(priority = 1)
    public void login()
    {
        logIn.actionLogIn(getData("userName"),getData("password"));

    }
    @Test(priority = 2)
    public void bookPage()
    {
        driver.navigate().to("https://demoqa.com/books");
    }

    @Test(priority = 3)
    public void searchBook1()
    {
        function.search("git Pocket");
        assertEquals(function.getBookCount(),1);
    }
    @Test(priority = 4)
    public void searchBook2()
    {
        function.search("very soft");
        assertEquals(function.getBookCount(),0);
        function.fundElem();
    }

    @Test(priority = 5)
    public void FillBookDetails()
    {
        books = new Book[driver.findElements(By.className("rt-rt-group")).size()];
        BookDetails.fillArr(driver.findElements(By.className("rt-rt-group")));
    }
//    @Test(priority = 6)
//    public void printBook()
//    {
//for (Book book : books){
//    BookDetails.printArr();
//}
// }

//    @AfterMethod
//    public void afterMethod() throws InterruptedException {
//        Thread.sleep(5000);
//    }
}
