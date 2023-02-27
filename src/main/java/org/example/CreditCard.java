package org.example;

public class CreditCard implements Cloneable{
    private final String name;
    private final int cardNumber;
    private final String expDate;

    CreditCard(String name, int cardNumber, String expDate){
        this.name = name;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }

    public boolean equals(CreditCard newCard) {
        return this.cardNumber == newCard.cardNumber;
    }

    @Override
    public CreditCard clone() throws CloneNotSupportedException {
        return (CreditCard) super.clone();
    }

}


