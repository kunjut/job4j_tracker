package ru.job4j.inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONReportTest {
    @Test
    public void whenTestGenerateMethod() {
        String ln = System.lineSeparator();
        String name = "Report's name";
        String body = "Report's body";
        String result = new JSONReport().generate(name, body);
        String expected = "{" + ln
                + "\t\"name\" : \"Report's name\"," + ln
                + "\t\"body\" : \"Report's body\"" + ln
                + "}";
        assertEquals(expected, result);
    }

    @Test
    public void whenNameIsDavidBodyIsNameSong() {
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : \"David Gilmour\"," + ln
                + "\t\"body\" : \"Shine On You Crazy Diamond\"" + ln
                + "}";
        String name = "David Gilmour";
        String body = "Shine On You Crazy Diamond";
        String result = new JSONReport().generate(name, body);
        assertEquals(expected, result);
    }

    @Test
    public void whenHisNameIsJohnBodyIsCena() {
        String name = "John";
        String body = "Cena";
        String expected = "<h1>John</h1>"
                + "<br/>"
                + "<span>Cena</span>";
        String result = new HtmlReport().generate(name, body);
        assertEquals(expected, result);
    }

}