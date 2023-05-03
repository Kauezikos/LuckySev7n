/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDAO;

import ConexaoDoBanco.*;
import java.sql.*;
import ModelBean.JogoBean;
import java.util.*;

/**
 *
 * @author anton
 */
public class JogoDao {

    // variavel que recebe a conexao da outra classe
    private Connection conecta;

    public JogoDao() {
        // atribui a variavel a conexao do banco
        this.conecta = new ConnectionFactory().conecta();

    }

    //metodo de inserir o jogo no banco
    public void InserirJogo(JogoBean obj) {
        try {
            // criar o comando sql

            String cmdsql = "insert into jogo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            // organizar o comando e executar
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            // setando os valores em cada um dos registros
            stmt.setInt(1, obj.getCodJogo());
            stmt.setInt(2, obj.getNum1());
            stmt.setInt(3, obj.getNum2());
            stmt.setInt(4, obj.getNum3());
            stmt.setInt(5, obj.getNum4());
            stmt.setInt(6, obj.getNum5());
            stmt.setInt(7, obj.getNum6());
            stmt.setInt(8, obj.getNum7());
            stmt.setInt(9, obj.getNum8());
            stmt.setInt(10, obj.getNum9());
            stmt.setInt(11, obj.getNum10());
            stmt.setInt(12, obj.getNum11());
            stmt.setInt(13, obj.getNum12());
            stmt.setInt(14, obj.getNum13());
            stmt.setInt(15, obj.getNum14());
            stmt.setInt(16, obj.getNum15());

            // executar o comando
            stmt.execute();

            //fecha conxeão
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException("DEU ERRO");
        }

    }

    //Listar os jogos
    public List<JogoBean> listarJogo(int jogo) {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like ?";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setInt(1, jogo);

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Metodo de alterar
    public void AlterarJogo(JogoBean obj) {
        try {
            // criar o comando sql

            String cmdsql = "update jogo set num1=?,num2=?,num3=?,num4=?,num5=?,num6=?,num7=?"
                    + ",num8=?,num9=?,num10=?,num11=?,num12=?,num13=?,num14=?,num15=? where codJogo=?";

            // organizar o comando e executar
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            // setando os valores em cada um dos registros
            
            stmt.setInt(1, obj.getNum1());
            stmt.setInt(2, obj.getNum2());
            stmt.setInt(3, obj.getNum3());
            stmt.setInt(4, obj.getNum4());
            stmt.setInt(5, obj.getNum5());
            stmt.setInt(6, obj.getNum6());
            stmt.setInt(7, obj.getNum7());
            stmt.setInt(8, obj.getNum8());
            stmt.setInt(9, obj.getNum9());
            stmt.setInt(10, obj.getNum10());
            stmt.setInt(11, obj.getNum11());
            stmt.setInt(12, obj.getNum12());
            stmt.setInt(13, obj.getNum13());
            stmt.setInt(14, obj.getNum14());
            stmt.setInt(15, obj.getNum15());
            stmt.setInt(16, obj.getCodJogo());

            // executar o comando
            stmt.execute();

            //fecha conxeão
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException("DEU ERRO");
        }

    }
    //valores do jogo 1
     public List<JogoBean> listarJogo1 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista1 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 1";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista1.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 2
     public List<JogoBean> listarJogo2 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista2 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 2";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista2.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista2;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 3
     public List<JogoBean> listarJogo3 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista3 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 3";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista3.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista3;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 4
     public List<JogoBean> listarJogo4 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista4 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 4";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista4.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista4;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 5
     public List<JogoBean> listarJogo5 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista5 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 5";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista5.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista5;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 6
     public List<JogoBean> listarJogo6 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista6 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 6";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista6.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista6;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 7
     public List<JogoBean> listarJogo7 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista7 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 7";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista7.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista7;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 8
     public List<JogoBean> listarJogo8 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista8 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 8";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista8.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista8;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 9
     public List<JogoBean> listarJogo9 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista9 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 9";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista9.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista9;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 10
     public List<JogoBean> listarJogo10 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista10 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 10";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista10.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista10;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     //valores do jogo 11
     public List<JogoBean> listarJogo11 () {
        try {
            //Cria a Array que armazena o numeros
            List<JogoBean> lista11 = new ArrayList<JogoBean>();
            //criar o comando sql
            String cmdsql = "select * from jogo where codjogo like 11";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            

            // resultado do select é guardado dentro do result set
            ResultSet rs = stmt.executeQuery();
            //Lista o jogo

            while (rs.next()) {

                JogoBean jg = new JogoBean();
                jg.setCodJogo(rs.getInt("codJogo"));
                jg.setNum1(rs.getInt("num1"));
                jg.setNum2(rs.getInt("num2"));
                jg.setNum3(rs.getInt("num3"));
                jg.setNum4(rs.getInt("num4"));
                jg.setNum5(rs.getInt("num5"));
                jg.setNum6(rs.getInt("num6"));
                jg.setNum7(rs.getInt("num7"));
                jg.setNum8(rs.getInt("num8"));
                jg.setNum9(rs.getInt("num9"));
                jg.setNum10(rs.getInt("num10"));
                jg.setNum11(rs.getInt("num11"));
                jg.setNum12(rs.getInt("num12"));
                jg.setNum13(rs.getInt("num13"));
                jg.setNum14(rs.getInt("num14"));
                jg.setNum15(rs.getInt("num15"));
                // adiciona a lista a variavel que obteve os registros das colunas
                lista11.add(jg);
            }
            // retorna a lista apos n ter mais o que adicionar
            return lista11;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
