public class Bispo extends Peca{
    public Bispo(int[] posicao, Cor cor){
        super(posicao, cor);
        setNome("BISPO");
    }

    public void moveBispo(Bispo peca, int caso, Board board){
        int i = peca.getPosicao()[0];
        int j = peca.getPosicao()[1];
    
        switch (caso){
            case 1: // movimento diagonal para cima e para a direita
                for (int k = 1; i+k < 8 && j+k < 8; k++) {
                    if (board.getPecaEm(i+k, j+k) == null) {
                        
                    } else {
                        break; // há uma peça bloqueando o caminho
                    }
                }
                break;
            case 2: // movimento diagonal para cima e para a esquerda
                for (int k = 1; i+k < 8 && j-k >= 0; k++) {
                    if (board.getPecaEm(i+k, j-k) == null) {
                        
                    } else {
                        break; // há uma peça bloqueando o caminho
                    }
                }
                break;
            case 3: // movimento diagonal para baixo e para a direita
                for (int k = 1; i-k >= 0 && j+k < 8; k++) {
                    if (board.getPecaEm(i-k, j+k) == null) {
                        
                    } else {
                        break; // há uma peça bloqueando o caminho
                    }
                }
                break;
            case 4: // movimento diagonal para baixo e para a esquerda
                for (int k = 1; i-k >= 0 && j-k >= 0; k++) {
                    if (board.getPecaEm(i-k, j-k) == null) {
                        
                    } else {
                        break; // há uma peça bloqueando o caminho
                    }
                }
                break;
        }
    }
}
