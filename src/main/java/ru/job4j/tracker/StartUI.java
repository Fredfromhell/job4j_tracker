package ru.job4j.tracker;

import java.util.ArrayList;

public class StartUI {
    private static Output out;

    public StartUI(Output out) {
        StartUI.out = out;
    }

    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            StartUI.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private static void showMenu(ArrayList<UserAction> actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new AllItems(output));
        actions.add(new EditItem(output));
        actions.add(new DeleteItem(output));
        actions.add(new FindItemId(output));
        actions.add(new FindItemName(output));
        actions.add(new Exit());

        new StartUI(output).init(input, tracker, actions);
    }
}