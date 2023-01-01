package exo_;

public class Main {
        public static void main(String[] args) {

            CompteBanque compte=new CompteBanque(1500,"account");
            SanjiEtNamiJob namiSanji = new SanjiEtNamiJob(compte);

            Thread m = new Thread(namiSanji,"meriem");
            Thread r = new Thread(namiSanji,"redouane");

            m.start();
            r.start();

        }
    }
