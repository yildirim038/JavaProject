package week1.assignment2;

public class disabledWorker implements Workers {
    private int hourlyCost = 10;
    private int weeklyWork = 10;
    public int calculatePrice(){
        return this.hourlyCost * this.weeklyWork;
    }
}
