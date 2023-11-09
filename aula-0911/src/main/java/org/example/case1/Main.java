package org.example.case1;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        JdbcTemplate con = new Conexao().getConexao();

        con.execute("drop table if exists produto");
        con.execute("""
               create table produto(
                    id int primary key auto_increment,
                    nome varchar(50) not null,
                    precoBase decimal(10, 2) not null,
                    tensao int,
                    peso decimal(10, 2),
                    fabricante varchar(50),                    
                    tamanho varchar(5),
                    cor varchar(50),
                    whiteLabel boolean,
                    tipo varchar(50)
               ); 
               """);


        Eletronico e1 = new Eletronico(null, "Gameboy", 5700.0, 1, "Nintendo");

        con.update("insert into produto (nome, precoBase, tensao, peso, fabricante, tipo) values(?, ?, ?, ?, ?, ?)",
                e1.getNome(), e1.getPrecoBase(), e1.getTensao(), null, e1.getFabricante(), "Eletrônico");



        Vestuario v1 = new Vestuario(null, "Calça", 150.5, "M", "Preta", true);

        con.update("insert into produto (nome, precoBase, tamanho, peso, fabricante, tipo) values(?, ?, ?, ?, ?, ?)",
               v1.getNome(), v1.getPrecoBase(), v1.getTamanho(), null, v1.getFabricante(), "Vestuário");


        List<Produto> todosProdutos = con.query("select * from produto", new ProdutoRowMapper());

        System.out.println(todosProdutos);



    }
}
