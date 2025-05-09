# Sistema Gerenciamento de Aeroporto

Este projeto consiste em um sistema de gerenciamento de aeroporto focado na venda de passagens aéreas. Desenvolvido na linguagem **Java** utilizando o **NetBeans** como ambiente de desenvolvimento e o **PostgreSQL** como banco de dados. O sistema oferece funcionalidades para cadastrar, listar e excluir voos, passageiros e reservas.

A **interface gráfica do usuário (GUI)** foi construída com as ferramentas visuais do **NetBeans**. O sistema se conecta ao banco de dados **PostgreSQL** para armazenar as informações dos voos, passageiros e reservas.

## Tecnologias Utilizadas:

- Java
- NetBeans
- PostgreSQL
- JDBC (especificamente o driver `org.postgresql.Driver`)
- Swing (framework padrão do Java utilizado no NetBeans GUI Builder)
- Componentes: `JTextField`, `JDateChooser`, `JComboBox`, `JOptionPane`, `JCalendar`, `JTextArea`

## Funcionalidades:

**Cada aba do JTabbedPane (componente Swing utilizado para criar a interface do sistema) possui um CRUD**

- **Adicionar Passageiro:** Permite cadastrar novos passageiros, incluondo informações como nome, cpf, data de nascimento, e-mail e telefone.
- **Atualizar Passageiro:** Permite atualizar as informações do passageiro.
- **Excluir Passageiro:** Permite excluir passageiro do banco de dados.
- **Exibir Passageiro:** Exibe os dados dos passageiros cadastrados.
- **Adicionar Voo:** Permite cadastrar novos voos no sistema, incluindo informações como origem, destino, data e hora de partida, classe do voo e preço da passagem.
- **Atualizar Voo:** Permite atualizar as informações dos voos cadastrados.
- **Excluir Voo:** Permite excluir um voo cadastrado no banco de dados.
- **Exibir Voos:** Permite visualizar os voos cadastrados no sistema.
- **Adicionar Reserva:** Permite adicionar uma reserva relacionando um passageiro e um voo cadastrado.
- **Atualizar Reserva:** Permite atualizar uma reserva cadastrada.
- **Excluir Reserva:** Permite excluir uma reserva cadastrada no banco de dados.
- **Gerar Relatório de Reserva:** Gera um relatório das reservas cadastradas no sistema.

## Requisitos:

- Java Development Kit (JDK)
- NetBeans IDE
- PostgreSQL
- Driver JDBC do PostgreSQL `org.postgresql.Driver` deve estar presente no classpath do projeto

## Configuração do Banco de Dados

1.  **Instale o PostgreSQL:** Siga as instruções de instalação para o seu sistema operacional.
2.  **Crie o banco de dados:** Crie um banco de dados chamado `gerenciamento_aeroporto`
3.  **Crie as tabelas `voo`, `passageiro` e `reserva`:** Execute o seguinte script SQL para criar as tabelas:

&nbsp;&nbsp;&nbsp;&nbsp;CREATE TABLE passageiro(\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;id SERIAL PRIMARY KEY,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;nome VARCHAR(100) NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cpf VARCHAR(14) NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;data_nascimento DATE NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;email VARCHAR(100) NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;telefone VARCHAR(100) NOT NULL\
&nbsp;&nbsp;&nbsp;&nbsp;);

&nbsp;&nbsp;&nbsp;&nbsp;CREATE TABLE voo(\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;id SERIAL PRIMARY KEY,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;origem VARCHAR(100) NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;destino VARCHAR(100) NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;data_partida DATE NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;hora_partida TIME NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;classe VARCHAR(100) NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;preco NUMERIC(6,2) NOT NULL\
&nbsp;&nbsp;&nbsp;&nbsp;);

&nbsp;&nbsp;&nbsp;&nbsp;CREATE TABLE reserva(\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;id SERIAL PRIMARY KEY NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;id_passageiro INT REFERENCES passageiro(id) NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;id_voo INT REFERENCES voo(id) NOT NULL,\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;assento VARCHAR(5) NOT NULL\
&nbsp;&nbsp;&nbsp;&nbsp;);

5.  **Configure a conexão:** No código Java, atualize a URL de conexão:

&nbsp;&nbsp;&nbsp;&nbsp;Class.forName("org.postgresql.Driver");\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"usuário", // Usuário no seu banco de dados\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"senha"); // Senha do seu banco de dados

## Como Executar o Projeto no NetBeans

1.  **Abra o projeto no NetBeans:** Vá em "Arquivo" -> "Abrir Projeto" e selecione a pasta do projeto.
2.  **Adicione a biblioteca do PostgreSQL:** Se a biblioteca do PostgreSQL não estiver listada em "Bibliotecas" no painel "Projetos", clique com o botão direito em "Bibliotecas" -> "Adicionar JAR/Pasta..." e selecione o arquivo `.jar` do driver JDBC do PostgreSQL (https://jdbc.postgresql.org/download/).
3.  **Execute o projeto:** Clique com o botão direito no nó do projeto no painel "Projetos" e selecione "Executar". A interface gráfica do sistema deverá ser iniciada.

## Autoria:

Desenvolvido por Kaylane Raquel como parte do projeto final da disciplina de Programação Orientada a Objetos - Universidade Federal de Uberlândia (UFU).
