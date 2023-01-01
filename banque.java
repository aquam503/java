public class banque {
    final double[] comptes =new double[100];
    banque(int a, double b) {
        for (int i = 0; i < a; i++) {
            this.comptes[i] = b;}}
    public double sold_total(){
        int s = 0;
        for(int i=0 ; i<this.comptes.length ; i++){
            s+=this.comptes[i];
        }
        return s;}
}