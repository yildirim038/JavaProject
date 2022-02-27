package week1.assignment2;
import java.util.ArrayList;


public class Application {

        public static void main(String[] args)  {
            int randomWorkers = (int)(Math.random()*5+2);
            int totalMoney =0;
            ArrayList workerList = new ArrayList();

            for (int i = 0; i <randomWorkers ; i++) {
                int workerTip = (int)(Math.random()*4);
                if (workerTip == 0) {
                    disabledWorker disabledWorker = new disabledWorker();
                    workerList.add(disabledWorker);
                    totalMoney+=disabledWorker.calculatePrice();
                }
                if (workerTip == 1) {
                    lazyWorker lazyWorker = new lazyWorker();
                    workerList.add(lazyWorker);
                    totalMoney+=lazyWorker.calculatePrice();
                }
                if (workerTip == 2) {
                    childWorker childWorker = new childWorker();
                    workerList.add(childWorker);
                    totalMoney+=childWorker.calculatePrice();
                }
                if (workerTip == 3) {
                    goodWorker goodWorker = new goodWorker();
                    workerList.add(goodWorker);
                    totalMoney+=goodWorker.calculatePrice();
                }
            }
            System.out.println("Toplam Ucret:"+totalMoney+" CHF ");
            for (int i = 0; i < workerList.size(); i++) {
                System.out.println(workerList.get(i));//hangi calisanlarin oldugunu görmek icin ekledim.
            }
        }
        /* Abi biraz basit bir yöntemle yaptim ama java yi tam bilmedigim icin ancak bu sekilde yapabildim. */
}
