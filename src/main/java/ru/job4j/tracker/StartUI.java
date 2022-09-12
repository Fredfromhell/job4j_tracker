package ru.job4j.tracker;

import java.sql.SQLException;
import java.util.List;

public class StartUI {
    private static Output out;

    public StartUI(Output out) {
        StartUI.out = out;
    }

    public void init(Input input, Store memTracker, List<UserAction> actions) throws SQLException {
        boolean run = true;
        while (run) {
            StartUI.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, memTracker);
        }
    }

    private static void showMenu(List<UserAction> actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) throws Exception {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        try (SqlTracker memTracker = new SqlTracker()) {
            memTracker.init();
                    List<UserAction> actions = List.of(
                    new CreateAction(output),
                    new AllItems(output),
                    new EditItem(output),
                    new DeleteItem(output),
                    new FindItemId(output),
                    new FindItemName(output),
                    new Exit()
            );
            new StartUI(output).init(input, memTracker, actions);
        }
    }

}