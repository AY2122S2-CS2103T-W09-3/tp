package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.expense.Expense;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyExpenditureExpert {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Expense> getExpenseList();

}
