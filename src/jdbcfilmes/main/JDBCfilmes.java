package jdbcfilmes.main;

import java.sql.SQLException;
import jdbcfilmes.vieww.FilmeListagem;

public class JDBCfilmes {

    public static void main(String[] args) throws SQLException {
        FilmeListagem pl = new FilmeListagem();
        pl.setVisible(true);
     //   filmeCadastro p = new filmeCadastro("Se Beber, Não Case!", "2024-01-30", "Novo");

        //ProdutoDAO.cadastrar(p);
    }

}
