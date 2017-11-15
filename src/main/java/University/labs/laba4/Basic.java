package University.labs.laba4;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        Matrix myCollection = new Matrix();
        myCollection.setCountLists(3);
        myCollection.setCountElements(4);
        myCollection.createMatrix();
        myCollection.showMatrix(myCollection.getMatrix());

        MinMaxInList searching = new MinMaxInList();
        System.out.println("Maximum(with API) = " + searching.getMaximumWithApi(myCollection));
        System.out.println("Minimum(with API) = " + searching.getMinimumWithApi(myCollection));

        System.out.println("Maximum = " + searching.getMaximum(myCollection));
        System.out.println("Minimum = " + searching.getMinimum(myCollection));

    }
}
