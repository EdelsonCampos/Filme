⚙️ Funcionalidades principais:
Conexão com banco de dados MySQL (utilizando o driver JDBC);

Cadastro de filmes com nome, data de lançamento e categoria;

Listagem de todos os filmes cadastrados no banco;

Edição de registros existentes;

Exclusão de filmes por ID;

Conversão de datas entre os formatos Java (dd/MM/yyyy) e SQL (yyyy-MM-dd).

🧱 Estrutura:
ConexaoJDBC.java: Classe responsável por estabelecer e encerrar a conexão com o banco de dados.

ProdutoDAO.java: Classe DAO que implementa as operações de CRUD (Create, Read, Update, Delete) sobre a tabela cadastro.

filmeCadastro.java: Classe modelo (POJO) que representa o objeto Filme, com atributos e métodos de acesso.

jdbcfilmes.main: Contém o ponto de entrada da aplicação e exibe a interface de listagem de filmes (FilmeListagem).

💾 Banco de Dados:
Nome do banco: cenaflix

Tabela: cadastro

Campos esperados: id, nomeFilme, dataLancamento, categoria

📚 Tecnologias utilizadas:
Java SE

JDBC (Java Database Connectivity)

MySQL

Apache NetBeans IDE
