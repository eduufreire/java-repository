public class SuperPoder {

    private String nome;
    private Integer categoria;


    public SuperPoder(String nome, Integer categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "SuperPoder{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
