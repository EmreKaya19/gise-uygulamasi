import java.util.Random;

public class tckimlik {
private String tcno;
private String ad;
private int giseno;

    public int getGiseno() {
        return giseno;
    }

    public void setGiseno(int giseno) {
        this.giseno = giseno;
    }

    public String getTcno() {
        return tcno;
    }
boolean kontrol =false;

    public boolean isKontrol() {
        return kontrol;
    }

    public void setKontrol(boolean kontrol) {
        this.kontrol = kontrol;
    }

    public void setTcno(String tcno) {
        if (tcno.length()==11){
            for (int i=0;i<tcno.length();i++){
                char c=tcno.charAt(i);
                if (Character.isDigit(c)){
                    kontrol=true;
                }else {
                    kontrol=false;
                    System.out.println("tckno tamamen sayılardan olusmalıdır...");
                    break;
                }

            }
            if (kontrol==true){
                System.out.println("islem basarılı...");
                this.tcno = tcno;
                Random random= new Random();
                int rastgele= random.nextInt(100);
                giseno=rastgele;
            }
        }else {
            System.out.println("tckno 11 karakterden olusmalıdır");
        }

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
