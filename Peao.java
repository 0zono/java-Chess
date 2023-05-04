public class Peao extends Peca{
    private boolean firstMove;
    
    public Peao(int[] posicao, Cor cor, Boolean firstMove){
        super(posicao, cor);
        setNome("PEAO");
    }
    
    public void setFirstMove(boolean firstMove) {
        this.firstMove = firstMove;
    }
    
    
     public void movePeao1(Peao peao, boolean dois, Board board){
        if(dois){
            int oldI = peao.getPosicao()[0];
            int oldJ = peao.getPosicao()[1];
            int newI = oldI + 2;
            int newJ = oldJ;
            if(board.getPecaEm(newI, newJ) == null){
                //board.setCasa(peao, newI, newJ);
                //board.setCasa(null, oldI, oldJ);
                firstMove = false;
            }
            else{
                System.out.println("movimento ilegal");
            }
        }
        else{
            int oldI = peao.getPosicao()[0];
            int oldJ = peao.getPosicao()[1];
            int newI = oldI + 1;
            int newJ = oldJ;
            if(board.getPecaEm(newI, newJ) == null){
                board.setCasa(peao, newI, newJ);
                board.setCasa(null, oldI, oldJ);
                firstMove = false;
            }
            else{
                System.out.println("movimento ilegal");
            }
        }
     }
}
