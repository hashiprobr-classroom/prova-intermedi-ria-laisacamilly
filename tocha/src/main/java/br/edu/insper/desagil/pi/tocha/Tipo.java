package br.edu.insper.desagil.pi.tocha;

public class Tipo {

    //Sobel_x:
    public Imagem sobel_x(Imagem imagem){
        // inicializa saída

        int[][] entrada = imagem.getPixels();

        int altura = entrada.length;
        if (altura < 3) {
            throw new IllegalStateException("altura pequena");
        }

        int largura = entrada[0].length;
        if (largura < 3) {
            throw new IllegalStateException("largura pequena");
        }

        int[][] saida = new int[altura - 2][largura - 2];

        // inicializa kernel

        double[][] kernel = new double[3][3];
        kernel[0][0] = -1;
        kernel[0][1] = 0;
        kernel[0][2] = 1;
        kernel[1][0] = -2;
        kernel[1][1] = 0;
        kernel[1][2] = 2;
        kernel[2][0] = -1;
        kernel[2][1] = 0;
        kernel[2][2] = 1;

        // calcula saída

        for (int y = 1; y < altura - 1; y++) {
            for (int x = 1; x < largura - 1; x++) {
                double s = 0;
                for (int dy = -1; dy < 2; dy++) {
                    for (int dx = -1; dx < 2; dx++) {
                        s += entrada[y + dy][x + dx] * kernel[dy + 1][dx + 1];
                    }
                }
                saida[y - 1][x - 1] = (int) s;
            }
        }

        return new Imagem(saida);
    }

    public Imagem sobel_y(Imagem imagem){
        // inicializa saída

        int[][] entrada = imagem.getPixels();

        int altura = entrada.length;
        if (altura < 3) {
            throw new IllegalStateException("altura pequena");
        }

        int largura = entrada[0].length;
        if (largura < 3) {
            throw new IllegalStateException("largura pequena");
        }

        int[][] saida = new int[altura - 2][largura - 2];

        // inicializa kernel

        double[][] kernel = new double[3][3];
        kernel[0][0] = -1;
        kernel[0][1] = -2;
        kernel[0][2] = -1;
        kernel[1][0] = 0;
        kernel[1][1] = 0;
        kernel[1][2] = 0;
        kernel[2][0] = 1;
        kernel[2][1] = 2;
        kernel[2][2] = 1;

        // calcula saída

        for (int y = 1; y < altura - 1; y++) {
            for (int x = 1; x < largura - 1; x++) {
                double s = 0;
                for (int dy = -1; dy < 2; dy++) {
                    for (int dx = -1; dx < 2; dx++) {
                        s += entrada[y + dy][x + dx] * kernel[dy + 1][dx + 1];
                    }
                }
                saida[y - 1][x - 1] = (int) s;
            }
        }

        return new Imagem(saida);
    }

    //Teste

}




