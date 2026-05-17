package SplitwiseApplication.Split.ConcreteSplit;

import SplitwiseApplication.Split.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {

    @Override
    public boolean validateSplit(List<Split> splits, Double totalAmt) {
        Double amt = 0.0;
        for(int i=0;i<splits.size()-1;i++) {
            if(!splits.get(i).getAmt().equals(splits.get(i+1).getAmt())) {
                return false;
            }
            amt+=splits.get(i).getAmt();
        }
        amt+=splits.getLast().getAmt();
        return amt.equals(totalAmt);
    }
}
