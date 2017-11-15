package University.labs.laba3;

public class Matrix {
    private int numberRows;
    private int numberColumns;
    private int massiv[][] ;

    public void setNumberRows(int numberRows) {
        this.numberRows = numberRows;
    }

    public void setNumberColumns(int numberColumns) {
        this.numberColumns = numberColumns;
    }

    public int getNumberRows() {
        return numberRows;
    }

    public int getNumberColumns() {
        return numberColumns;
    }

    public void setMassiv() {
        massiv = new int[numberRows][numberColumns];
        int a = 0;
        int b = 10;

        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberColumns; j++) {
                massiv[i][j] = a + (int) (Math.random() * b);
            }
        }
    }
    public void showMassiv() {
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberColumns; j++) {
                System.out.println("[" + i + "][" + j + "] = " + massiv[i][j] + ",");
            }
        }
    }

    public int[][] getMassiv() {
        return massiv;
    }
}

