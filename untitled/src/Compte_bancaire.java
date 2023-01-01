public class Compte_bancaire {
    private int solde;
    Compte_bancaire(int solde){
        this.solde = solde;
    }
    public int getSolde() {
        return solde;
    }
    public void setSolde(int solde) {

        this.solde = solde;
    }
    public void retirer(int solde) {
        this.solde -= solde;
    }
}