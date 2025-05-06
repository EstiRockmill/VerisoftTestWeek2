import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.print.Book;
import java.util.List;

public class BookDetails extends Base
{
    public static void fillArr(List<WebElement> list)
    {
        for (int i = 0; i < books.length; i++) {
            books[i].setTitle(list.get(i).findElement(By.xpath("//div[1]/div/div[2]/div/span/a")).getText());
            books[i].setAuthor(list.get(i).findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div/div[3]")).getText());
            books[i].setPublisher(list.get(i).findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div/div[4]")).getText());

        }
    }
    public static void printArr(Book b)
    {
        System.out.println("the title is");
    }



}
