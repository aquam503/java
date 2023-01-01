public class Main {
    public static void main(String[] args) {
        banque bc = new banque(100,1000);
        int vers= (int) Math.random()*100;
        transfert tr = new transfert(bc,0,vers,100);
        for(int depuis=0; depuis<100; depuis++){
            Thread r = new Thread(tr);
            r.start();
        }
    }
}