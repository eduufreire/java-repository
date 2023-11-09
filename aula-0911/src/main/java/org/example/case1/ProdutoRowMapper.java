package org.example.case1;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoRowMapper implements RowMapper<Produto> {

    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException {

        String tipo = resultSet.getString("tipo");
        if(tipo.equalsIgnoreCase("Eletrônico")){
            Eletronico e1 = new Eletronico();
            e1.setId(resultSet.getInt("id"));
            e1.setNome(resultSet.getString("nome"));
            e1.setPrecoBase(resultSet.getDouble("precoBase"));
            e1.setTensao(resultSet.getInt("tensao"));
            e1.setFabricante(resultSet.getString("fabricante"));
            return e1;
        }


        return null;
    }

}
