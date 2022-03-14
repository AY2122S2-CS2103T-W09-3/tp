package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.ExpenditureExpert;
import seedu.address.model.Model;

/**
 * Clears the expenditure expert.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Expenditure Expert has been cleared!";
    public static final String HELP_COMMAND = COMMAND_WORD + ": Clears the records of Expenditure Expert\n\n";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setExpenditureExpert(new ExpenditureExpert());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
