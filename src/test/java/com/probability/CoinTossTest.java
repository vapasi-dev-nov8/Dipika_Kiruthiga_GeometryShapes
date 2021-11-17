package com.probability;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoinTossTest {

    @Test
    void shouldReturnTrueIfBothProbabilitiesAreEqual(){
        CoinToss chanceOfHead=new CoinToss(0.5);
        CoinToss chanceOfTail=new CoinToss(0.5);
        assertTrue(chanceOfHead.equals(chanceOfTail));
    }


    @Test
    void shouldReturnFalseIfBothProbabilitiesAreEqual(){
        CoinToss chanceOfHead=new CoinToss(0.5);
        CoinToss chanceOfTail=new CoinToss(0.4);
        assertFalse(chanceOfHead.equals(chanceOfTail));

    }

}