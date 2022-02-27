package week1.assignment2;

public class childWorker implements Workers{
    private int hourlyCost = 10;
    private int weeklyWork = 30;
    public int calculatePrice(){
        return this.hourlyCost * this.weeklyWork;
    }
}
