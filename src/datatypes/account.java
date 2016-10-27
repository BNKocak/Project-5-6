package datatypes;

import java.util.List;

public class account {

    private String voornaam;
    private String achternaam;
    private Boolean isadmin;
    private String email;
    private String wachtwoord;
    private String mobielnummer;
    private String huistelnummer;
    private List<String> favorites;
    private List<String> wishlist;
    private List<String> winkelwagen;
    private List<String> adres;

    public account(String voornaam, String achternaam,Boolean isadmin,String email,String wachtwoord,
                   String mobielnummer,String huistelnummer,List<String> favorites,List<String> wishlist,
                   List<String> winkelwagen,List<String> adres) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.isadmin = isadmin;
        this.email = email;
        this.wachtwoord = wachtwoord;
        this.mobielnummer = mobielnummer;
        this.huistelnummer = huistelnummer;
        this.favorites = favorites;
        this.wishlist = wishlist;
        this.winkelwagen = winkelwagen;
        this.adres = adres;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public Boolean getIsadmin() {
        return isadmin;
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

    public List<String> getFavorites() {
        return favorites;
    }

    public List<String> getWishlist() {
        return wishlist;
    }

    public List<String> getWinkelwagen() {
        return winkelwagen;
    }

    public List<String> getAdres() {
        return adres;
    }
}
