package com.probability;


import java.util.Objects;

public class CoinToss {

    private double probabilityOutcome;

    public CoinToss(double probability) {
        this.probabilityOutcome=probability;
    }


    public CoinToss probabilityOfTwoEvents(CoinToss event2Value) {
        CoinToss probabilityOfTwoEventsOccuringTogether = new CoinToss(this.probabilityOutcome * event2Value.probabilityOutcome);
        return probabilityOfTwoEventsOccuringTogether;
    }

    public CoinToss calculateProbabilityNotOccuring(CoinToss chanceOfEvent) {
        CoinToss probabilityOfEventNotOccuring= new CoinToss(this.probabilityOutcome- chanceOfEvent.probabilityOutcome);
        return  probabilityOfEventNotOccuring;
    }

    public CoinToss calculateProbabilityOfEitherOfEventsOccuring(CoinToss event2Value) {
        CoinToss probabilityOfEitherOfTwoEventsOccuring= new CoinToss(this.probabilityOutcome +event2Value.probabilityOutcome-(this.probabilityOutcome*event2Value.probabilityOutcome));
        return probabilityOfEitherOfTwoEventsOccuring;
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

    @Override
    public String toString() {
        return "CoinToss{" +
                "probabilityOutcome=" + probabilityOutcome +
                '}';
    }
}
