package week1.assignment2;

public class lazyWorker implements Workers {
    private int hourlyCost = 23;
    private int weeklyWork = 20;
    public int calculatePrice(){
        return this.hourlyCost * this.weeklyWork;
    }
}
