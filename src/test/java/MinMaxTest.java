
import University.labs.laba4.*;
import org.junit.Test;

import static junit.framework.Assert.*;

public class MinMaxTest {

    @Test
    public void getMinMax() throws Exception {
        Matrix myCollection = new Matrix();
        myCollection.setCountLists(3);
        myCollection.setCountElements(4);
        myCollection.createMatrix();
        MinMaxInList searching = new MinMaxInList();

       // Проверяет, что обе переменные относятся к разным объектам.
        assertNotSame(searching.getMinimum(myCollection), searching.getMaximum(myCollection)); //
    }


//    @Test
//        public void testApiForMax() throws Exception {
//        Matrix myCollection = new Matrix();
//        myCollection.setCountLists(3);
//        myCollection.setCountElements(4);
//        myCollection.createMatrix();
//        MinMaxInList searching = new MinMaxInList();
//
//        int first = searching.getMaximum(myCollection);
//        int second = searching.getMaximumWithApi(myCollection);
//
//        assertEquals(first, second);
//    }
//    @Test
//    public void testApiForMin() throws Exception {
//        Matrix myCollection = new Matrix();
//        myCollection.setCountLists(3);
//        myCollection.setCountElements(4);
//        myCollection.createMatrix();
//        MinMaxInList searching = new MinMaxInList();
//
//        int first = searching.getMinimum(myCollection);
//        int second = searching.getMinimumWithApi(myCollection);
//
//        assertEquals(first, second);
//    }
//    @Test
//    public void something() throws Exception {
//        assertEquals(1, 2);
//    }
    @Test
        public void notNull() throws Exception {
        Matrix myCollection = new Matrix();
        assertNotNull(myCollection);
    }

}
