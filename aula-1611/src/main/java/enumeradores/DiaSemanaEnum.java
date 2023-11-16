package enumeradores;

//Tipo especial, mas existe na programação em outras linguagens
//Constante mais robusta, serve para trabalhar com valores fixo
public enum DiaSemanaEnum {

    // Atributos ou variveis "final", são MACRO_CASE

    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    private int codigo;

    DiaSemanaEnum(int codigo) {
        this.codigo = codigo;
    }

    public static DiaSemanaEnum of(int codigo){
        switch (codigo) {
            case 1:
                return DOMINGO;
            case 2:
                return SEGUNDA;
            case 3:
                return TERCA;
            case 4:
                return QUARTA;
            case 5:
                return QUINTA;
            case 6:
                return SEXTA;
            case 7:
                return SABADO;
        }
        return null;
    }

    public int getCodigo(){
        return codigo;
    }

}
