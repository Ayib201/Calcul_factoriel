package com.groupeisi;

public class Calculatrice {
    public int CalculatriceFact(int terme1){
        if(terme1 == 0 || terme1 == 1){
            return 1;
        }else {
            return terme1 * CalculatriceFact(terme1 - 1);
        }
    }
}
