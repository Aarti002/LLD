package SplitwiseApplication.Split.Strategy;

import SplitwiseApplication.Split.Split;
import SplitwiseApplication.User.User;

import java.util.ArrayList;
import java.util.List;

public class EqualSplits implements SplitStrategy {
    @Override
    public List<Split> createSplits(List<User> users, Double totalAmt, List<Integer> percentage) {
        Double eachToPay = totalAmt / users.size();
        List<Split> splitList = new ArrayList<>();
        for(int i=0;i<users.size();i++) {
            Split newSplit = new Split(users.get(i), eachToPay, percentage.get(i));
            splitList.add(newSplit);
        }
        return splitList;
    }
}
