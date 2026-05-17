package SplitwiseApplication.Split.ConcreteSplit;

import SplitwiseApplication.Split.Split;

import java.util.List;

public class PercentExpenseSplit implements ExpenseSplit {
    @Override
    public boolean validateSplit(List<Split> splits, Double totalAmt) {
        Double amt = 0.0;
        for(int i=0;i<splits.size()-1;i++) {
            if(splits.get(i).getPercent() > 100 ||  splits.get(i).getPercent() <= 0) {
                return false;
            }
            amt+=splits.get(i).getAmt();
        }
        amt+=splits.getLast().getAmt();
        return amt.equals(totalAmt);
    }
}
