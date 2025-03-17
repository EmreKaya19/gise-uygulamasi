import java.util.Random;

public class tckimlik {
private String tcno;
private String ad;

    public String getTcno() {
        return tcno;
    }
boolean kontrol =true;
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
                System.out.println("gise numaranız:"+rastgele);
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
