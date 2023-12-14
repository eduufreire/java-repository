package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    @DisplayName("Somar quano acionado com valores 2 e 2 deve retornar 4")
    void somarQuandoAcionadoComValor2e2DeveRetornar4(){

        //Range
        Calculadora calculadora = new Calculadora();
        Integer valor1 = 2;
        Integer valor2 = 2;

        Integer valorEsperado = 4;

        //Act
        Integer resultado = calculadora.somar(valor1, valor2);
        assertEquals(valorEsperado, resultado);

    }


    @Test
    @DisplayName("Somar qunado acionado com valores nulos deve lançar IllegalArguments")
    void somarQuandoAcionadoComValoresNulosDeveLancarExpection(){

        //arrange
        Calculadora calculadora = new Calculadora();

        String mensagemEsperada = "Valores não podem ser nulos";
        //Act
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.somar(null, null)
        );

        String mensagem = exception.getMessage();

        assertEquals(mensagemEsperada, mensagem);

    }

}