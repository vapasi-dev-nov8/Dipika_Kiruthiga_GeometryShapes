package com.shapes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @ParameterizedTest
    @MethodSource("provideSideAndArea")
    void shouldCalculateAreaOfSquare(double side,double expectedArea){
        //Given
        Square square = new Square(side);
        //When
        double actualArea = square.area();
        //Then
        assertEquals(expectedArea,actualArea);
    }


    private static Stream<Arguments> provideSideAndArea() {
        return Stream.of(
                Arguments.of(2.0, 4.0),
                Arguments.of(4.5, 20.25),
                Arguments.of(0.0, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSideAndPerimeter")
    void shouldCalculatePerimeterOfSquare(double side,double expectedPerimeter){
        //Given
        Square square = new Square(side);
        //When
        double actualPerimeter = square.perimeter();
        //Then
        assertEquals(expectedPerimeter,actualPerimeter);
    }

    public static Stream<Arguments> provideSideAndPerimeter() {
        return Stream.of(
                Arguments.of(2.0, 8.0),
                Arguments.of(4.5, 18.0),
                Arguments.of(0.0, 0.0)
        );
    }
}
