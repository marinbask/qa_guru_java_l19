import org.assertj.core.api.ObjectAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class OwnerGitHubTest extends TestBase {
    @Test
    @DisplayName("Проверяем заголовок страницы")
    public void GithubTitleTest() {
        assertThat(title()).contains("GitHub: Let’s build from here · GitHub");
    }
    @Test
    @DisplayName("Проверяем наличие текста на странице")
    void githubSearch() {
        $(".d-lg-flex.list-style-none").
                $(byText("Solutions")).
                hover();
        $("[href='/enterprise']").click();
        ObjectAssert<By> byObjectAssert = assertThat(byText("The AI-powered\n" +
                "developer platform."));
    }



}


