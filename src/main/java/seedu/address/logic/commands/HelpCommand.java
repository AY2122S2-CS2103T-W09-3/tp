package seedu.address.logic.commands;

import seedu.address.model.Model;
import seedu.address.ui.HelpWindow;

/**
 * Format full help instructions for every command for display.
 */
public class HelpCommand extends Command {

    public static final StringBuilder HELP_STRING = new StringBuilder();

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    public static final String SHOWING_HELP_MESSAGE = "Opened help window.";

    /**
     * Forms the string for the help command in the help window.
     * @return String for the help command.
     */
    public static String helpCommandString() {
        HELP_STRING.append(HelpWindow.HELP_MESSAGE).append("\n");
        HELP_STRING.append("COMMANDS").append("\n").append("\n").append(AddCommand.MESSAGE_USAGE).append("\n\n");
        HELP_STRING.append("clear: ").append("Clears the records of Expenditure Expert").append("\n\n");
        HELP_STRING.append(DeleteCommand.MESSAGE_USAGE).append("\n\n");
        HELP_STRING.append(EditCommand.MESSAGE_USAGE).append("\n\n");
        HELP_STRING.append("exit: ").append("Exits the app").append("\n\n");
        HELP_STRING.append(FindCommand.MESSAGE_USAGE).append("\n\n");
        HELP_STRING.append("list: ").append("Lists all expenses").append("\n\n");
        return HELP_STRING.toString();
    }

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(SHOWING_HELP_MESSAGE, true, false);
    }
}
