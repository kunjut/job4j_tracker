package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Input input = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction()
        };
        new StartUI(out).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        int id = item.getId();
        String replacedName = "New item name";
        Output out = new StubOutput();
        Input input = new StubInput(
                new String[]{"0", String.valueOf(id), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditAction(),
                new ExitAction()
        };
        new StartUI(out).init(input, tracker, actions);
        assertThat(tracker.findById(id).getName(), is("New item name"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        int id = item.getId();
        Output out = new StubOutput();
        Input input = new StubInput(
                new String[]{"0", String.valueOf(id), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI(out).init(input, tracker, actions);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Input input = new StubInput(
                new String[]{"0"}
        );
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(input, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:" + System.lineSeparator()
                        + "0. Exit Program" + System.lineSeparator()
        ));
    }
}
