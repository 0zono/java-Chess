public abstract class Peca {
    int[] posicao = new int[2];
    protected enum Cor{
        BRANCO, PRETO
    }
    private Cor cor;
    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Peca(int[] posicao, Cor cor){
        setPosicao(posicao);
        setCor(cor);
    }

    public void setPosicao(int posicao[]){
        this.posicao = posicao;
    }
    public int[] getPosicao(){
        return posicao;
    }

    public void setCor(Cor cor){
        this.cor = cor;
    }
    public Cor getCor() {
        return cor;
    }

}
