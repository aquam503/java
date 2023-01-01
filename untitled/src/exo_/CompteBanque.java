package exo_;
public class CompteBanque {
    private int  solde;
    public String name;
    CompteBanque(int solde,String name){
        this.solde=solde;
        this.name=name;
    }
    public int getSolde(){
        return this.solde;
    }
    public void retirer( double d){
        this.solde-=d;
    }
}
