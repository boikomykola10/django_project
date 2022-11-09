package helpDesk;

import core.BaseSeleniumPage;
import org.junit.Test;

public class HelpDeskTest extends BaseSeleniumPage {

    @Test
    public void checkTicket() {
        String title = "Oleh Youtuber";
        String body = "Повідомлення в тех. підтримку за допомогою селеніуму";
        String email = "testYou@fake.ru";
        MainPage mainPage = new MainPage();
        mainPage.createTicket(title, body, email);
    }
}
