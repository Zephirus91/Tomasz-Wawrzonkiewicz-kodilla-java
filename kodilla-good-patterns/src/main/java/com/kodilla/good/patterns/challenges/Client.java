package com.kodilla.good.patterns.challenges;

public class Client {
    private final String name;
    private final String surname;
    private final int telephone;
    private final String adress;

    public Client(String name, String surname, int telephone, String adress) {
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (telephone != client.telephone) return false;
        if (!name.equals(client.name)) return false;
        if (!surname.equals(client.surname)) return false;
        return adress.equals(client.adress);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + telephone;
        result = 31 * result + adress.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telephone=" + telephone +
                ", adress='" + adress + '\'' +
                '}';
    }
}
