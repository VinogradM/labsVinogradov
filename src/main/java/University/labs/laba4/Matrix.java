package University.labs.laba4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
    private int countElements;
    private int countLists;
    private List<List<Integer>> matrix = new ArrayList();

    public int getCountElements() {
        return countElements;
    }

    public void setCountElements(int countElements) {
        this.countElements = countElements;
    }

    public int getCountLists() {
        return countLists;
    }

    public void setCountLists(int countLists) {
        this.countLists = countLists;
    }



    public void createMatrix() {
        Random rand = new Random();

        for (int i = 0; i < countLists; i++) {
            List<Integer> list = new ArrayList();
            for (int j = 0; j < countElements; j++) {
                list.add(rand.nextInt(1000) - 100);
            }
            matrix.add(list);
        }

    }

    public void showMatrix(List<List<Integer>> matrix) {
        matrix.forEach(System.out::println);
    }

    public List<List<Integer>> getMatrix(){
        return matrix;
    }
}