package SplitwiseApplication.Split.ConcreteSplit;

import SplitwiseApplication.Split.Split;

import java.util.List;

public interface ExpenseSplit {
    boolean validateSplit(List<Split> splits, Double totalAmt);
}
