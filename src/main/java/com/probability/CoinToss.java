package com.probability;


import java.util.Objects;
import java.util.Random;

public class CoinToss {

    private double probabilityOutcome;

    public CoinToss(double probability) {
        this.probabilityOutcome=probability;
    }

    public CoinToss() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinToss coinToss = (CoinToss) o;
        return Double.compare(coinToss.probabilityOutcome, probabilityOutcome) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probabilityOutcome);
    }

}