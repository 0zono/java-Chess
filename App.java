public class App {
    public static void main(String[] args) throws Exception {
        Board tabuleiro = new Board();
        Peao peao1 = (Peao) tabuleiro.getPecaEm(1, 1);

        boolean dois = true;
        peao1.movePeao1(peao1, dois, tabuleiro);
        /*System.out.println(tabuleiro.getPecaEm(2, 1));
        System.out.println(tabuleiro.getPecaEm(1, 1));
        System.out.println(tabuleiro.getPecaEm(3, 1));*/
        tabuleiro.displayBoard();
        

    }
}
