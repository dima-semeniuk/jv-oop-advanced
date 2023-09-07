package core.basesyntax;

public class Main {
    public static final int NUMBER_OF_FIGURES = 6;
    public static final int HALF_OF_THE_FIGURES = NUMBER_OF_FIGURES / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < HALF_OF_THE_FIGURES) {
                figures[i] = figureSupplier.getRandomFigure();
                continue;
            }
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
