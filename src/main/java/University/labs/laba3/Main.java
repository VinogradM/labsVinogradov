package University.labs.laba3;

public class Main {
    public static void main(String[] args) {
        Matrix massiv = new Matrix();
        massiv.setNumberColumns(3);
        massiv.setNumberRows(4);
        massiv.setMassiv();
        massiv.showMassiv();

        SearchMinMax searching = new SearchMinMax();
        searching.setNumberColumns(massiv.getNumberColumns());
        searching.setNumberRows(massiv.getNumberRows());
        searching.setMassiv(massiv.getMassiv());
        System.out.println("min = " + searching.getMin());
        System.out.println("max = " + searching.getMax());
        System.out.println("Work with stream: ");
//        System.out.println("min = " + searching.getMinWithApi());
//        System.out.println("max = " + searching.getMaxWithApi());
    }
}
