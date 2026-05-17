package SplitwiseApplication.Split.Strategy;

import SplitwiseApplication.Split.Split;
import SplitwiseApplication.User.User;

import java.util.List;

public interface SplitStrategy {
    List<Split> createSplits(List<User> users, Double totalAmt, List<Integer> percentage);
}