package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.readAllLines;

public class DemoTest {
    public static String getAddToCartButtonSelector(String productName) {
        return String.format(
                "//*[contains(text(), \"%s\")]//ancestor::div[@class=\"details\"]//button[contains(text(), \"Add to cart\")]",
                productName);

    }

    @Test
    public void test() throws IOException {
        System.out.println(
                getAddToCartButtonSelector("Nokia Lumia 1020")
        );

        readAllLines(
                Paths.get("credentials.csv").toAbsolutePath(),
                UTF_8
        ).forEach(System.out::println);
//        forEach(line -> {
//            System.out.println(line);
//        });

    }
}
