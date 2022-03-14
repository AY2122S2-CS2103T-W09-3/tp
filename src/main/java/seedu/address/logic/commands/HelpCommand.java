package seedu.address.logic.commands;

import seedu.address.model.Model;
import seedu.address.ui.HelpWindow;

/**
 * Format full help instructions for every command for display.
 */
public class HelpCommand extends Command {

    public static final StringBuilder helpString = new StringBuilder();

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    public static final String SHOWING_HELP_MESSAGE = "Opened help window.";

    public static String helpCommandString() {
        helpString.append(HelpWindow.HELP_MESSAGE).append("\n");
        helpString.append("COMMANDS").append("\n").append("\n").append(AddCommand.MESSAGE_USAGE).append("\n\n");
        helpString.append("clear: ").append("Clears the records of Expenditure Expert").append("\n\n");
        helpString.append(DeleteCommand.MESSAGE_USAGE).append("\n\n");
        helpString.append(EditCommand.MESSAGE_USAGE).append("\n\n");
        helpString.append("exit: ").append("Exits the app").append("\n\n");
        helpString.append(FindCommand.MESSAGE_USAGE).append("\n\n");
        helpString.append("list: ").append("Lists all expenses").append("\n\n");
        return helpString.toString();
    }

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(SHOWING_HELP_MESSAGE, true, false);
    }
}
