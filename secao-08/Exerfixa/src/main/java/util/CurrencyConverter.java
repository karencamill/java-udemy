package util;

public class CurrencyConverter {

    public double price;
    public double quanti;

    public double resultado() {
       // return price * quanti * 0.06; ASSIM RETORNA SÓ O VALOR DA TAXA
        return price * quanti * 1.06; // 100% + 6% ASSIM RETORNAR O VALOR JÁ COM A TAXA
    }
}


