package org.example.case1;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.nio.file.attribute.BasicFileAttributes;

public class Conexao {

    private JdbcTemplate conexao;

    public Conexao(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:h2:file:./banco");
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUsername("sa");
        dataSource.setPassword("");

        this.conexao = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConexao(){
        return conexao;
    }

}
