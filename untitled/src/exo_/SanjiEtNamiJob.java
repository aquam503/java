package exo_;
import static java.lang.Thread.sleep;
public class SanjiEtNamiJob implements Runnable {
    CompteBanque compte;

    SanjiEtNamiJob(CompteBanque compte){
        this.compte=compte;
    }
    public void run() {
        while(true){
            synchronized (this){
                if (demandeRetrait(100)){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(Thread.currentThread().getName() + " reveillé");
                    this.compte.retirer(100);
                    System.out.println(Thread.currentThread().getName() + ":" + this.compte.getSolde() + " solde");
                }}}
    }
    public boolean demandeRetrait(double d){
        return this.compte.getSolde()>=d;

    }
}

