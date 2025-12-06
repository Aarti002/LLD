package ATMManagementSystem.Core;

import ATMManagementSystem.ATMState.ATMStates;
import ATMManagementSystem.ATMState.NextStates.Idle;

public class ATM {
    ATMStates atmStates;
    private int currentBalance;
    private int twoThousandsNotes;
    private int fiveHundredsNotes;
    private int hundredsNotes;

    public ATM(int n1, int n2, int n3) {
        twoThousandsNotes = n1;
        fiveHundredsNotes = n2;
        hundredsNotes = n3;
        this.atmStates = new Idle();
    }

    public void setAtmStates(ATMStates state) {
        this.atmStates = state;
    }

    public ATMStates getAtmState() {
        return this.atmStates;
    }

    public void setNewBalance(int balance) {
        this.currentBalance = balance;
    }

    public void updateBalance(int deductedAmt) {
        int currAmt = getAvailableAmount() - deductedAmt;
        setNewBalance(currAmt);
    }

    public int getAvailableAmount() {
        return this.currentBalance = twoThousandsNotes*2000+fiveHundredsNotes*500+hundredsNotes*100;
    }

    public void printCurrentState() {
        System.out.println("Current State: "+this.atmStates);
    }

    public int getTwoThousandsNotes() {
        return twoThousandsNotes;
    }

    public int getFiveHundredsNotes() {
        return fiveHundredsNotes;
    }

    public int getHundredsNotes() {
        return hundredsNotes;
    }

    public void deductTwoThousands(int notesToBeDeducted) {
        this.twoThousandsNotes = getTwoThousandsNotes() - notesToBeDeducted;
    }

    public void deductFiveHundreds(int notesToBeDeducted) {
        this.fiveHundredsNotes = getFiveHundredsNotes() - notesToBeDeducted;
    }

    public void deductHundreds(int notesToBeDeducted) {
        this.hundredsNotes = getHundredsNotes() - notesToBeDeducted;
    }
}
