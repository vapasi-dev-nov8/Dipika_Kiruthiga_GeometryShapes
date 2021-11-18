package com.probability;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoinTossTest {

    @Test
    //P(A)=P(B)
    void shouldReturnTrueIfBothProbabilitiesAreEqual() {
        CoinToss chanceOfHead = new CoinToss(0.5);
        CoinToss chanceOfTail = new CoinToss(0.5);
        assertTrue(chanceOfHead.equals(chanceOfTail));
    }

    @Test
    void shouldReturnFalseIfBothProbabilitiesAreNotEqual() {
        CoinToss chanceOfHead = new CoinToss(0.5);
        CoinToss chanceOfTail = new CoinToss(0.4);
        assertFalse(chanceOfHead.equals(chanceOfTail));
    }

    @Test
        // P(A and B) = P(A) * P(B)
    void probabilityOfTwoEventsOccurringTogether() {
        CoinToss probabilityOfEvent1 = new CoinToss(0.5);
        CoinToss probabilityOfEvent2 = new CoinToss(0.5);
        CoinToss expectedProbability = new CoinToss(0.25);
        CoinToss result=probabilityOfEvent1.probabilityOfTwoEvents(probabilityOfEvent2);
        assertTrue(expectedProbability.equals(result));
    }

    /*@Test
    // P(A') = 1 - p(A)
    void probabilityOfEventsNotOcurring(){
    CoinToss probabilityOfOneEvent = new CoinToss(0.5);
    CoinToss expectedProbability = new CoinToss(0.5);
    //CoinToss result= 1-(calculateProbabilityNotOccuring(probabilityOfOneEvent));
    assertEquals(expectedProbability,calculateProbabilityNotOccuring(probabilityOfOneEvent)));
    }*/

    @Test
        //P(A or B) = P(A) + P(B) - P(A and B)
    void probabilityOfEitherOfTwoEventsOccuring(){
        CoinToss probabilityOfEvent1 = new CoinToss(0.5);
        CoinToss probabilityOfEvent2 = new CoinToss(0.5);
        CoinToss expectedProbability = new CoinToss(0.75);
        CoinToss result=probabilityOfEvent1.calculateProbabilityOfEitherEventsOccuring(probabilityOfEvent2);
        assertTrue(expectedProbability.equals(result));
    }

}
