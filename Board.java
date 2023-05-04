public class Board {
    private Peca[][] casa;

    public void setCasa(Peca peca, int i, int j){
        this.casa[i][j] = peca;
    }
    public Peca[][] getCasa(){
        return casa;
    }

    public Board() {
        casa = new Peca[8][8];
        initBoard();
        posicionarPecas();
    }

    //i = linhas, j= colunas
    private void initBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                casa[i][j] = null;
            }
        }
    }

    private void posicionarPecas() {
        
        casa[0][0] = new Torre(new int[]{0, 0}, Peca.Cor.PRETO);
        casa[0][1] = new Cavalo(new int[]{0, 1}, Peca.Cor.PRETO);
        casa[0][2] = new Bispo(new int[]{0, 2}, Peca.Cor.PRETO);
        casa[0][3] = new Dama(new int[]{0, 3}, Peca.Cor.PRETO);
        casa[0][4] = new Rei(new int[]{0, 4}, Peca.Cor.PRETO);
        casa[0][5] = new Bispo(new int[]{0, 5}, Peca.Cor.PRETO);
        casa[0][6] = new Cavalo(new int[]{0, 6}, Peca.Cor.PRETO);
        casa[0][7] = new Torre(new int[]{0, 7}, Peca.Cor.PRETO);
        for (int j = 0; j < 8; j++) {
            casa[1][j] = new Peao(new int[]{1, j}, Peca.Cor.PRETO, true);
        }

        
        casa[7][0] = new Torre(new int[]{7, 0}, Peca.Cor.BRANCO);
        casa[7][1] = new Cavalo(new int[]{7, 1}, Peca.Cor.BRANCO);
        casa[7][2] = new Bispo(new int[]{7, 2}, Peca.Cor.BRANCO);
        casa[7][3] = new Dama(new int[]{7, 3}, Peca.Cor.BRANCO);
        casa[7][4] = new Rei(new int[]{7, 4}, Peca.Cor.BRANCO);
        casa[7][5] = new Bispo(new int[]{7, 5}, Peca.Cor.BRANCO);
        casa[7][6] = new Cavalo(new int[]{7, 6}, Peca.Cor.BRANCO);
        casa[7][7] = new Torre(new int[]{7, 7}, Peca.Cor.BRANCO);
        for (int j = 0; j < 8; j++) {
            casa[6][j] = new Peao(new int[]{6, j}, Peca.Cor.BRANCO, true);
        }
    }

    public Peca getPecaEm(int i, int j) {
        if (i < 0 || i >= 8 || j < 0 || j >= 8) {
            throw new IllegalArgumentException("Invalid square");

        }
        return casa[i][j];
    }

    public void displayBoard(){
        for(int i = 0; i < 8; i++){
            System.out.println("\n");
            for(int j = 0; j < 8; j++){
                Peca pecaB = getPecaEm(i, j);
                if(pecaB == null){
                    System.out.print("VAZIO ");
                    
                }
                else{
                    System.out.print(pecaB.getNome() + " ");
                }
            }
        }
    }
}


