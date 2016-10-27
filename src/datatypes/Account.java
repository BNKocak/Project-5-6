package datatypes;

import java.util.List;

public class Account {

    private String voornaam;
    private String achternaam;
    private String email;
    private String wachtwoord;
    private String mobielnummer;
    private String huistelnummer;
    private List<String> adres;

    public Account(String voornaam, String achternaam,String email,String wachtwoord,
                   String mobielnummer,String huistelnummer,List<String> adres) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.wachtwoord = wachtwoord;
        this.mobielnummer = mobielnummer;
        this.huistelnummer = huistelnummer;
        this.adres = adres;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getEmail() {
        return email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public String getMobielnummer() {
        return mobielnummer;
    }

    public String getHuistelnummer() {
        return huistelnummer;
    }

    public List<String> getAdres() {
        return adres;
    }
}
