import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.otus.java.basic.homeworks.homework31.ArrayMethods;

import java.util.Arrays;

public class TestArrayMethods {




    @ParameterizedTest
    @CsvSource(value = {
            "'1,2,1,2','2'",
            "'1,1,2,2','2,2'",
            "'2,1,2,1,2','2'",
            "'1,1,1,2,1','NULL'"
    },nullValues ={"NULL"})
    public void testDoesNotThrow(String csvArray, String expected){
        int[] expectedArray;
        int[] actualArray = Arrays.stream(csvArray.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (expected == null){
            expectedArray = new int[0];
        } else {
           expectedArray = Arrays.stream(expected.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        Assertions.assertDoesNotThrow(()->{
                    ArrayMethods.executeArray(actualArray);
                }
        );
        Assertions.assertArrayEquals(expectedArray, ArrayMethods.executeArray(actualArray));
    }

    @ParameterizedTest
    @CsvSource({
            "'2,2,3,2'",
            "'3,4,2,2'",
            "'2,2,2,5'",
            "'3,2,0,2,8'"
    })
    public void testThrowException(String csvArray){
        int[] actualArray = Arrays.stream(csvArray.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        Assertions.assertThrows(RuntimeException.class, ()->{
            ArrayMethods.executeArray(actualArray);
                }
        );
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2,1,2'",
            "'1,1,2,2'",
            "'2,1,2,1'",
            "'1,1,1,2,1'",
            "'1,2'",
            "'1,2,2,1'"
                })
    public void testWhenTrue(String csvArray){
        int[] actualArray = Arrays.stream(csvArray.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        Assertions.assertTrue(ArrayMethods.checkArray(actualArray));
    }

    @ParameterizedTest
    @CsvSource(value ={
            "'1,1,1,1'",
            "'1,1'",
            "'1,3'",
            "'2,2,2,2'",
            "'2,1,2,3'",
            "'3,3,3,4,0'",
            "'NULL'"
    }, nullValues = {"NULL"})
    public void testWhenFalse(String csvArray){
        int[] actualArray;
        if (csvArray == null){
            actualArray =  new int[0];
        }else {
            actualArray = Arrays.stream(csvArray.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        Assertions.assertFalse(ArrayMethods.checkArray(actualArray));
    }
}
