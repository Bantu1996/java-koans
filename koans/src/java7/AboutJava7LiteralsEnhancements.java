package java7;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutJava7LiteralsEnhancements {

    @Koan
    public void binaryLiterals() {
        //binary literals are marked with 0b prefix
        short binaryLiteral = 0b1111;
        short binarLiterals = 0B1111;
        assertEquals(binaryLiteral, binarLiterals);
    }

    @Koan
    public void binaryLiteralsWithUnderscores() {
        //literals can use underscores for improved readability
        short binaryLiteral = 0b1111_1111;
        short binaryLiterals = 0B1111_1111;
        assertEquals(binaryLiteral, binaryLiterals);
    }

    @Koan
    public void numericLiteralsWithUnderscores() {
        long literal = 111_111_111L;
        //notice capital "B" - a valid binary literal prefix
        short multiplier = 0B1_000;
        assertEquals(literal * multiplier, 888888888l);
    }

    @Koan
    public void negativeBinaryLiteral() {
        int negativeBinaryLiteral = 0b1111_1111_1111_1111_1111_1111_1111_1100 / 4;
        assertEquals(negativeBinaryLiteral, -1);
    }

    @Koan
    public void binaryLiteralsWithBitwiseOperator() {
        int binaryLiteral = ~0b1111_1111;
        assertEquals(binaryLiteral, -256);
    }

}
