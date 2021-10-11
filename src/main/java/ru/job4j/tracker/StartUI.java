package ru.job4j.tracker;

public class StartUI {
    private static Output out;

    public StartUI(Output out) {
        StartUI.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            StartUI.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private static void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output), new AllItems(output), new EditItem(output), new DeleteItem(output),
                new FindItemId(output), new FindItemName(output), new Exit()
        };
        new StartUI(output).init(input, tracker, actions);
    }
}