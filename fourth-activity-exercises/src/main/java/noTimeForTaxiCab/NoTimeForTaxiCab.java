package noTimeForTaxiCab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class NoTimeForTaxiCab {
    // You're airdropped near Easter Bunny Headquarters in a city somewhere. "Near",
    // unfortunately, is as close as you can get.
    // The instructions on the Easter Bunny Recruiting Document the Elves
    // intercepted start here, and nobody had time to work them out further.
    //
    // The Document indicates that you should start at the given coordinates (where
    // you just landed) and face North.
    // Then, follow the provided sequence: either turn left (L) or right (R) 90
    // degrees, then walk forward the given number of blocks,
    // ending at a new intersection.
    //
    // There's no time to follow such instructions on foot, so you take a moment and
    // work out the destination.
    // Given that you can only walk on the street grid of the city, how far is the
    // shortest path to the destination?
    //
    // For more info of the street grid of the city: https://en.wikipedia.org/wiki/Taxicab_geometry
    //
    // Example:
    // - Following R2, L3 leaves you 2 blocks East and 3 blocks North, or 5 blocks
    // away.
    // - R2, R2, R2 leaves you 2 blocks due South of your starting position, which
    // is 2 blocks away.
    // - R5, L5, R5, R3 leaves you 12 blocks away.
    //
    // Write a method to calculate how many blocks away Easter Bunny HQ is.
    public static int getResultPartA(String fileName){
        return 0;
    }

    // --- Part Two ---
    //
    // Then, you notice the instructions continue on the back of the Recruiting
    // Document.
    // Easter Bunny HQ is actually at the first location you visit twice.
    //
    // Example:
    // - If your instructions are R8, R4, R4, R8, the first location you visit twice
    // is 4 blocks away, due East.
    //
    // Write a method to calculate how many blocks away the first location you visit
    // twice is.
    public static int getResultPartB(String fileName){
        return 0;
    }

}
