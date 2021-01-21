package com.kodilla.good.patterns.challenges;

public class Seller {
    private final String sellerName;
    private final String adress;
    private final String mail;

    public Seller(String sellerName, String adress, String mail) {
        this.sellerName = sellerName;
        this.adress = adress;
        this.mail = mail;
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getAdress() {
        return adress;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerName='" + sellerName + '\'' +
                ", adress='" + adress + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
