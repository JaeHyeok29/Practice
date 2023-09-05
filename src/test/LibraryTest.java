package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import main.Library;

class LibraryTest {
    @Test
    @DisplayName("음수 값의 도서관을 만들 때, IllegalArgumentException 던짐")
    void negativeLibrary_throwIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException,class, () -> new Library(-1));
        assertEquals(exception.getMessage(), NEGATIVE_LIBRARY_MESSAGE);

    }



    @ParameterizedTest
    @ValueSource(strings = {"어린왕자", "엄지공주"})
    void add_success(String bookName) { // 어린왕자 엄지공주가 여기에서 들어가게 된다.
        Library library = new Library(5);

        library.add(bookName);
    }

    @RepeatedTest(10)
    void repeat() {
        System.out.println("dfdf");
    }
}
