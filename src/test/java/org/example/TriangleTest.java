package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.lesson4.TriangleFindTheArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {
    //2. Разместите тесты на эту функцию в классе src/test/java/.../TriangleTest.java.
    @BeforeAll
    static void BeforeAll(){
        logger.info("Info");
        logger.debug("Debug");
        logger.error("Error");
       }
    //ПОЧЕМУ НЕ ЧИТАЕТ РУCCКИЕ БУКВЫ?
    @Test
    @DisplayName("No incorrect sizes")
    void NoIncorrectSizes(){
        Assertions.assertThrows(Exception.class,() -> TriangleFindTheArea.TriangleArea(5,10,0));
    }

   @Test
    @DisplayName(value = "The area is true")
    void AreaIsTrue() throws Exception{
       Assertions.assertEquals(7, TriangleFindTheArea.TriangleArea(7,10,7));;

    }


    //3. Настройте генерацию отчёта и по желанию — логирование.
    private static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);


}
