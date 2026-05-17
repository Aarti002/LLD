package SplitwiseApplication.Split.Factory;

import SplitwiseApplication.Split.ConcreteSplit.EqualExpenseSplit;
import SplitwiseApplication.Split.ConcreteSplit.ExpenseSplit;
import SplitwiseApplication.Split.ConcreteSplit.PercentExpenseSplit;
import SplitwiseApplication.Split.ConcreteSplit.UnequalExpenseSplit;
import SplitwiseApplication.Split.Enum.SplitType;

public class SplitFactory {

    public static ExpenseSplit createSplit(SplitType type) {
        switch (type) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentExpenseSplit();
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
