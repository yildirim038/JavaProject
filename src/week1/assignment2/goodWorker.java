package week1.assignment2;

public class goodWorker implements Workers {
    private int hourlyCost = 40;
    private int weeklyWork = 40;
    public int calculatePrice(){
        return this.hourlyCost * this.weeklyWork;
    }
}
