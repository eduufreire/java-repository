package org.example.case1;

import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {

        JdbcTemplate con = new Conexao().getConexao();

        con.execute("create dabase ");

        Eletronico e1 = new Eletronico(null, "Gameboy", 5700.0, 1, "Nintendo");
        Vestuario v1 = new Vestuario(null, "Calça", 150.5, "M", "Preta", true);

        System.out.println(e1);
        System.out.println(v1);



    }
}
