package main.java.list.operacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;
    public int idade;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
