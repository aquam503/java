import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class transfert implements Runnable {
    banque bq;
    private Lock bankLock=new ReentrantLock();
    private Condition suffisant= bankLock.newCondition();
    int de; int vers; double m;
    transfert(banque bq ,int de, int vers, double m){
       this.de=de; this.vers=vers; this.m=m; this.bq=bq;
    }
    @Override
    public void run(){
        bankLock.lock();
        try {
            while(this.bq.comptes[de]<m)
                suffisant.await();
            this.bq.comptes[de] -= m;
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

            this.bq.comptes[vers] += m;
            System.out.println(this.bq.sold_total());
            suffisant.signalAll();}

        catch (InterruptedException e) {
            throw new RuntimeException(e);}

        finally {
            bankLock.unlock();
        }}

}
