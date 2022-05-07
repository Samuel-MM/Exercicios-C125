package br.inatel.cdg.pai;

public abstract class SeuTipo implements Comparable<SeuTipo> {
    protected String nome;
    protected double preco;

    public SeuTipo(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public String getNome(){
        return nome;
    }

    public void getInfo(){
        System.out.println("Nome: " + nome + ", preço: " + preco);
    }

    //Ordenação de forma decrescente
    @Override
    public int compareTo(SeuTipo o){
        if(this.preco < o.getPreco()) return 1;
        else if (this.preco > o.getPreco()) return -1;
        return 0;
    }
}