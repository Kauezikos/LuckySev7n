/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import ModelBean.*;
import ModelDAO.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

// GERAR O JOGUIM hora da verdade
    public void gerar() {
        // arrays criadas para armazenar os dados numericos pra depois contar
        int resut1[] = new int[15];
        int resut2[] = new int[15];
        int resut3[] = new int[15];
        int resut4[] = new int[15];
        int resut5[] = new int[15];
        int resut6[] = new int[15];
        int resut7[] = new int[15];
        int resut8[] = new int[15];
        int resut9[] = new int[15];
        int resut10[] = new int[15];
        int resut11[] = new int[15];
// variaveis de auxilio
        int entra[] = new int[5];
        int sair[] = new int[5];
        int aleatorios[] = new int[5];
        int randon[] = new int[5];

        // variavel mestre
        int lucky[] = new int[15];
        // contadores 
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0,
                cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0, cont11 = 0,
                cont12 = 0, cont13 = 0, cont14 = 0, cont15 = 0, cont16 = 0,
                cont17 = 0, cont18 = 0, cont19 = 0, cont20 = 0, cont21 = 0,
                cont22 = 0, cont23 = 0, cont24 = 0, cont25 = 0;

//chama a classe Dao por um objeto
        JogoDao dao = new JogoDao();
        // chamando o metodo de listar especifico pra cada jogo

        List<JogoBean> listarjogo1 = dao.listarJogo1();
        List<JogoBean> listarjogo2 = dao.listarJogo2();
        List<JogoBean> listarjogo3 = dao.listarJogo3();
        List<JogoBean> listarjogo4 = dao.listarJogo4();
        List<JogoBean> listarjogo5 = dao.listarJogo5();
        List<JogoBean> listarjogo6 = dao.listarJogo6();
        List<JogoBean> listarjogo7 = dao.listarJogo7();
        List<JogoBean> listarjogo8 = dao.listarJogo8();
        List<JogoBean> listarjogo9 = dao.listarJogo9();
        List<JogoBean> listarjogo10 = dao.listarJogo10();
        List<JogoBean> listarjogo11 = dao.listarJogo11();
// laço de repetição para jogar o valor da lista pra array
        try {
            for (JogoBean jg : listarjogo1) {

                resut1[0] = jg.getNum1();
                resut1[1] = jg.getNum2();
                resut1[2] = jg.getNum3();
                resut1[3] = jg.getNum4();
                resut1[4] = jg.getNum5();
                resut1[5] = jg.getNum6();
                resut1[6] = jg.getNum7();
                resut1[7] = jg.getNum8();
                resut1[8] = jg.getNum9();
                resut1[9] = jg.getNum10();
                resut1[10] = jg.getNum11();
                resut1[11] = jg.getNum12();
                resut1[12] = jg.getNum13();
                resut1[13] = jg.getNum14();
                resut1[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 1" + e);
        }
        try {
            for (JogoBean jg : listarjogo2) {

                resut2[0] = jg.getNum1();
                resut2[1] = jg.getNum2();
                resut2[2] = jg.getNum3();
                resut2[3] = jg.getNum4();
                resut2[4] = jg.getNum5();
                resut2[5] = jg.getNum6();
                resut2[6] = jg.getNum7();
                resut2[7] = jg.getNum8();
                resut2[8] = jg.getNum9();
                resut2[9] = jg.getNum10();
                resut2[10] = jg.getNum11();
                resut2[11] = jg.getNum12();
                resut2[12] = jg.getNum13();
                resut2[13] = jg.getNum14();
                resut2[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 2" + e);
        }
        try {
            for (JogoBean jg : listarjogo3) {

                resut3[0] = jg.getNum1();
                resut3[1] = jg.getNum2();
                resut3[2] = jg.getNum3();
                resut3[3] = jg.getNum4();
                resut3[4] = jg.getNum5();
                resut3[5] = jg.getNum6();
                resut3[6] = jg.getNum7();
                resut3[7] = jg.getNum8();
                resut3[8] = jg.getNum9();
                resut3[9] = jg.getNum10();
                resut3[10] = jg.getNum11();
                resut3[11] = jg.getNum12();
                resut3[12] = jg.getNum13();
                resut3[13] = jg.getNum14();
                resut3[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 3" + e);
        }
        try {
            for (JogoBean jg : listarjogo4) {

                resut4[0] = jg.getNum1();
                resut4[1] = jg.getNum2();
                resut4[2] = jg.getNum3();
                resut4[3] = jg.getNum4();
                resut4[4] = jg.getNum5();
                resut4[5] = jg.getNum6();
                resut4[6] = jg.getNum7();
                resut4[7] = jg.getNum8();
                resut4[8] = jg.getNum9();
                resut4[9] = jg.getNum10();
                resut4[10] = jg.getNum11();
                resut4[11] = jg.getNum12();
                resut4[12] = jg.getNum13();
                resut4[13] = jg.getNum14();
                resut4[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 4" + e);
        }
        try {
            for (JogoBean jg : listarjogo5) {

                resut5[0] = jg.getNum1();
                resut5[1] = jg.getNum2();
                resut5[2] = jg.getNum3();
                resut5[3] = jg.getNum4();
                resut5[4] = jg.getNum5();
                resut5[5] = jg.getNum6();
                resut5[6] = jg.getNum7();
                resut5[7] = jg.getNum8();
                resut5[8] = jg.getNum9();
                resut5[9] = jg.getNum10();
                resut5[10] = jg.getNum11();
                resut5[11] = jg.getNum12();
                resut5[12] = jg.getNum13();
                resut5[13] = jg.getNum14();
                resut5[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 5" + e);
        }
        try {
            for (JogoBean jg : listarjogo6) {

                resut6[0] = jg.getNum1();
                resut6[1] = jg.getNum2();
                resut6[2] = jg.getNum3();
                resut6[3] = jg.getNum4();
                resut6[4] = jg.getNum5();
                resut6[5] = jg.getNum6();
                resut6[6] = jg.getNum7();
                resut6[7] = jg.getNum8();
                resut6[8] = jg.getNum9();
                resut6[9] = jg.getNum10();
                resut6[10] = jg.getNum11();
                resut6[11] = jg.getNum12();
                resut6[12] = jg.getNum13();
                resut6[13] = jg.getNum14();
                resut6[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 6" + e);
        }
        try {
            for (JogoBean jg : listarjogo7) {

                resut7[0] = jg.getNum1();
                resut7[1] = jg.getNum2();
                resut7[2] = jg.getNum3();
                resut7[3] = jg.getNum4();
                resut7[4] = jg.getNum5();
                resut7[5] = jg.getNum6();
                resut7[6] = jg.getNum7();
                resut7[7] = jg.getNum8();
                resut7[8] = jg.getNum9();
                resut7[9] = jg.getNum10();
                resut7[10] = jg.getNum11();
                resut7[11] = jg.getNum12();
                resut7[12] = jg.getNum13();
                resut7[13] = jg.getNum14();
                resut7[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 7" + e);
        }
        try {
            for (JogoBean jg : listarjogo8) {

                resut8[0] = jg.getNum1();
                resut8[1] = jg.getNum2();
                resut8[2] = jg.getNum3();
                resut8[3] = jg.getNum4();
                resut8[4] = jg.getNum5();
                resut8[5] = jg.getNum6();
                resut8[6] = jg.getNum7();
                resut8[7] = jg.getNum8();
                resut8[8] = jg.getNum9();
                resut8[9] = jg.getNum10();
                resut8[10] = jg.getNum11();
                resut8[11] = jg.getNum12();
                resut8[12] = jg.getNum13();
                resut8[13] = jg.getNum14();
                resut8[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 8" + e);
        }
        try {
            for (JogoBean jg : listarjogo9) {

                resut9[0] = jg.getNum1();
                resut9[1] = jg.getNum2();
                resut9[2] = jg.getNum3();
                resut9[3] = jg.getNum4();
                resut9[4] = jg.getNum5();
                resut9[5] = jg.getNum6();
                resut9[6] = jg.getNum7();
                resut9[7] = jg.getNum8();
                resut9[8] = jg.getNum9();
                resut9[9] = jg.getNum10();
                resut9[10] = jg.getNum11();
                resut9[11] = jg.getNum12();
                resut9[12] = jg.getNum13();
                resut9[13] = jg.getNum14();
                resut9[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 9" + e);
        }
        try {
            for (JogoBean jg : listarjogo10) {

                resut10[0] = jg.getNum1();
                resut10[1] = jg.getNum2();
                resut10[2] = jg.getNum3();
                resut10[3] = jg.getNum4();
                resut10[4] = jg.getNum5();
                resut10[5] = jg.getNum6();
                resut10[6] = jg.getNum7();
                resut10[7] = jg.getNum8();
                resut10[8] = jg.getNum9();
                resut10[9] = jg.getNum10();
                resut10[10] = jg.getNum11();
                resut10[11] = jg.getNum12();
                resut10[12] = jg.getNum13();
                resut10[13] = jg.getNum14();
                resut10[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 10" + e);
        }
        try {
            for (JogoBean jg : listarjogo11) {

                resut11[0] = jg.getNum1();
                resut11[1] = jg.getNum2();
                resut11[2] = jg.getNum3();
                resut11[3] = jg.getNum4();
                resut11[4] = jg.getNum5();
                resut11[5] = jg.getNum6();
                resut11[6] = jg.getNum7();
                resut11[7] = jg.getNum8();
                resut11[8] = jg.getNum9();
                resut11[9] = jg.getNum10();
                resut11[10] = jg.getNum11();
                resut11[11] = jg.getNum12();
                resut11[12] = jg.getNum13();
                resut11[13] = jg.getNum14();
                resut11[14] = jg.getNum15();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lista 11" + e);
        }

        // Verificar os vetores resut e contar quantas vezes determinado numero aparece
        try {
            for (int i = 0; i < resut1.length; i++) {
                if (resut1[i] == 1) {
                    cont1++;
                }
                if (resut1[i] == 2) {
                    cont2++;
                }
                if (resut1[i] == 3) {
                    cont3++;
                }
                if (resut1[i] == 4) {
                    cont4++;
                }
                if (resut1[i] == 5) {
                    cont5++;
                }
                if (resut1[i] == 6) {
                    cont6++;
                }
                if (resut1[i] == 7) {
                    cont7++;
                }
                if (resut1[i] == 8) {
                    cont8++;
                }
                if (resut1[i] == 9) {
                    cont9++;
                }
                if (resut1[i] == 10) {
                    cont10++;
                }
                if (resut1[i] == 11) {
                    cont11++;
                }
                if (resut1[i] == 12) {
                    cont12++;
                }
                if (resut1[i] == 13) {
                    cont13++;
                }
                if (resut1[i] == 14) {
                    cont14++;
                }
                if (resut1[i] == 15) {
                    cont15++;
                }
                if (resut1[i] == 16) {
                    cont16++;
                }
                if (resut1[i] == 17) {
                    cont17++;
                }
                if (resut1[i] == 18) {
                    cont18++;
                }
                if (resut1[i] == 19) {
                    cont19++;
                }
                if (resut1[i] == 20) {
                    cont20++;
                }
                if (resut1[i] == 21) {
                    cont21++;
                }
                if (resut1[i] == 22) {
                    cont22++;
                }
                if (resut1[i] == 23) {
                    cont23++;
                }
                if (resut1[i] == 24) {
                    cont24++;
                }
                if (resut1[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 1" + e);
        }
        try {
            for (int i = 0; i < resut2.length; i++) {
                if (resut2[i] == 1) {
                    cont1++;
                }
                if (resut2[i] == 2) {
                    cont2++;
                }
                if (resut2[i] == 3) {
                    cont3++;
                }
                if (resut2[i] == 4) {
                    cont4++;
                }
                if (resut2[i] == 5) {
                    cont5++;
                }
                if (resut2[i] == 6) {
                    cont6++;
                }
                if (resut2[i] == 7) {
                    cont7++;
                }
                if (resut2[i] == 8) {
                    cont8++;
                }
                if (resut2[i] == 9) {
                    cont9++;
                }
                if (resut2[i] == 10) {
                    cont10++;
                }
                if (resut2[i] == 11) {
                    cont11++;
                }
                if (resut2[i] == 12) {
                    cont12++;
                }
                if (resut2[i] == 13) {
                    cont13++;
                }
                if (resut2[i] == 14) {
                    cont14++;
                }
                if (resut2[i] == 15) {
                    cont15++;
                }
                if (resut2[i] == 16) {
                    cont16++;
                }
                if (resut2[i] == 17) {
                    cont17++;
                }
                if (resut2[i] == 18) {
                    cont18++;
                }
                if (resut2[i] == 19) {
                    cont19++;
                }
                if (resut2[i] == 20) {
                    cont20++;
                }
                if (resut2[i] == 21) {
                    cont21++;
                }
                if (resut2[i] == 22) {
                    cont22++;
                }
                if (resut2[i] == 23) {
                    cont23++;
                }
                if (resut2[i] == 24) {
                    cont24++;
                }
                if (resut2[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 2" + e);
        }
        try {
            for (int i = 0; i < resut3.length; i++) {
                if (resut3[i] == 1) {
                    cont1++;
                }
                if (resut3[i] == 2) {
                    cont2++;
                }
                if (resut3[i] == 3) {
                    cont3++;
                }
                if (resut3[i] == 4) {
                    cont4++;
                }
                if (resut3[i] == 5) {
                    cont5++;
                }
                if (resut3[i] == 6) {
                    cont6++;
                }
                if (resut3[i] == 7) {
                    cont7++;
                }
                if (resut3[i] == 8) {
                    cont8++;
                }
                if (resut3[i] == 9) {
                    cont9++;
                }
                if (resut3[i] == 10) {
                    cont10++;
                }
                if (resut3[i] == 11) {
                    cont11++;
                }
                if (resut3[i] == 12) {
                    cont12++;
                }
                if (resut3[i] == 13) {
                    cont13++;
                }
                if (resut3[i] == 14) {
                    cont14++;
                }
                if (resut3[i] == 15) {
                    cont15++;
                }
                if (resut3[i] == 16) {
                    cont16++;
                }
                if (resut3[i] == 17) {
                    cont17++;
                }
                if (resut3[i] == 18) {
                    cont18++;
                }
                if (resut3[i] == 19) {
                    cont19++;
                }
                if (resut3[i] == 20) {
                    cont20++;
                }
                if (resut3[i] == 21) {
                    cont21++;
                }
                if (resut3[i] == 22) {
                    cont22++;
                }
                if (resut3[i] == 23) {
                    cont23++;
                }
                if (resut3[i] == 24) {
                    cont24++;
                }
                if (resut3[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 3" + e);
        }
        try {
            for (int i = 0; i < resut4.length; i++) {
                if (resut4[i] == 1) {
                    cont1++;
                }
                if (resut4[i] == 2) {
                    cont2++;
                }
                if (resut4[i] == 3) {
                    cont3++;
                }
                if (resut4[i] == 4) {
                    cont4++;
                }
                if (resut4[i] == 5) {
                    cont5++;
                }
                if (resut4[i] == 6) {
                    cont6++;
                }
                if (resut4[i] == 7) {
                    cont7++;
                }
                if (resut4[i] == 8) {
                    cont8++;
                }
                if (resut4[i] == 9) {
                    cont9++;
                }
                if (resut4[i] == 10) {
                    cont10++;
                }
                if (resut4[i] == 11) {
                    cont11++;
                }
                if (resut4[i] == 12) {
                    cont12++;
                }
                if (resut4[i] == 13) {
                    cont13++;
                }
                if (resut4[i] == 14) {
                    cont14++;
                }
                if (resut4[i] == 15) {
                    cont15++;
                }
                if (resut4[i] == 16) {
                    cont16++;
                }
                if (resut4[i] == 17) {
                    cont17++;
                }
                if (resut4[i] == 18) {
                    cont18++;
                }
                if (resut4[i] == 19) {
                    cont19++;
                }
                if (resut4[i] == 20) {
                    cont20++;
                }
                if (resut4[i] == 21) {
                    cont21++;
                }
                if (resut4[i] == 22) {
                    cont22++;
                }
                if (resut4[i] == 23) {
                    cont23++;
                }
                if (resut4[i] == 24) {
                    cont24++;
                }
                if (resut4[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 4" + e);
        }
        try {
            for (int i = 0; i < resut5.length; i++) {
                if (resut5[i] == 1) {
                    cont1++;
                }
                if (resut5[i] == 2) {
                    cont2++;
                }
                if (resut5[i] == 3) {
                    cont3++;
                }
                if (resut5[i] == 4) {
                    cont4++;
                }
                if (resut5[i] == 5) {
                    cont5++;
                }
                if (resut5[i] == 6) {
                    cont6++;
                }
                if (resut5[i] == 7) {
                    cont7++;
                }
                if (resut5[i] == 8) {
                    cont8++;
                }
                if (resut5[i] == 9) {
                    cont9++;
                }
                if (resut5[i] == 10) {
                    cont10++;
                }
                if (resut5[i] == 11) {
                    cont11++;
                }
                if (resut5[i] == 12) {
                    cont12++;
                }
                if (resut5[i] == 13) {
                    cont13++;
                }
                if (resut5[i] == 14) {
                    cont14++;
                }
                if (resut5[i] == 15) {
                    cont15++;
                }
                if (resut5[i] == 16) {
                    cont16++;
                }
                if (resut5[i] == 17) {
                    cont17++;
                }
                if (resut5[i] == 18) {
                    cont18++;
                }
                if (resut5[i] == 19) {
                    cont19++;
                }
                if (resut5[i] == 20) {
                    cont20++;
                }
                if (resut5[i] == 21) {
                    cont21++;
                }
                if (resut5[i] == 22) {
                    cont22++;
                }
                if (resut5[i] == 23) {
                    cont23++;
                }
                if (resut5[i] == 24) {
                    cont24++;
                }
                if (resut5[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 5" + e);
        }
        try {
            for (int i = 0; i < resut6.length; i++) {
                if (resut6[i] == 1) {
                    cont1++;
                }
                if (resut6[i] == 2) {
                    cont2++;
                }
                if (resut6[i] == 3) {
                    cont3++;
                }
                if (resut6[i] == 4) {
                    cont4++;
                }
                if (resut6[i] == 5) {
                    cont5++;
                }
                if (resut6[i] == 6) {
                    cont6++;
                }
                if (resut6[i] == 7) {
                    cont7++;
                }
                if (resut6[i] == 8) {
                    cont8++;
                }
                if (resut6[i] == 9) {
                    cont9++;
                }
                if (resut6[i] == 10) {
                    cont10++;
                }
                if (resut6[i] == 11) {
                    cont11++;
                }
                if (resut6[i] == 12) {
                    cont12++;
                }
                if (resut6[i] == 13) {
                    cont13++;
                }
                if (resut6[i] == 14) {
                    cont14++;
                }
                if (resut6[i] == 15) {
                    cont15++;
                }
                if (resut6[i] == 16) {
                    cont16++;
                }
                if (resut6[i] == 17) {
                    cont17++;
                }
                if (resut6[i] == 18) {
                    cont18++;
                }
                if (resut6[i] == 19) {
                    cont19++;
                }
                if (resut6[i] == 20) {
                    cont20++;
                }
                if (resut6[i] == 21) {
                    cont21++;
                }
                if (resut6[i] == 22) {
                    cont22++;
                }
                if (resut6[i] == 23) {
                    cont23++;
                }
                if (resut6[i] == 24) {
                    cont24++;
                }
                if (resut6[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 6" + e);
        }
        try {
            for (int i = 0; i < resut7.length; i++) {
                if (resut7[i] == 1) {
                    cont1++;
                }
                if (resut7[i] == 2) {
                    cont2++;
                }
                if (resut7[i] == 3) {
                    cont3++;
                }
                if (resut7[i] == 4) {
                    cont4++;
                }
                if (resut7[i] == 5) {
                    cont5++;
                }
                if (resut7[i] == 6) {
                    cont6++;
                }
                if (resut7[i] == 7) {
                    cont7++;
                }
                if (resut7[i] == 8) {
                    cont8++;
                }
                if (resut7[i] == 9) {
                    cont9++;
                }
                if (resut7[i] == 10) {
                    cont10++;
                }
                if (resut7[i] == 11) {
                    cont11++;
                }
                if (resut7[i] == 12) {
                    cont12++;
                }
                if (resut7[i] == 13) {
                    cont13++;
                }
                if (resut7[i] == 14) {
                    cont14++;
                }
                if (resut7[i] == 15) {
                    cont15++;
                }
                if (resut7[i] == 16) {
                    cont16++;
                }
                if (resut7[i] == 17) {
                    cont17++;
                }
                if (resut7[i] == 18) {
                    cont18++;
                }
                if (resut7[i] == 19) {
                    cont19++;
                }
                if (resut7[i] == 20) {
                    cont20++;
                }
                if (resut7[i] == 21) {
                    cont21++;
                }
                if (resut7[i] == 22) {
                    cont22++;
                }
                if (resut7[i] == 23) {
                    cont23++;
                }
                if (resut7[i] == 24) {
                    cont24++;
                }
                if (resut7[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 7" + e);
        }
        try {
            for (int i = 0; i < resut8.length; i++) {
                if (resut8[i] == 1) {
                    cont1++;
                }
                if (resut8[i] == 2) {
                    cont2++;
                }
                if (resut8[i] == 3) {
                    cont3++;
                }
                if (resut8[i] == 4) {
                    cont4++;
                }
                if (resut8[i] == 5) {
                    cont5++;
                }
                if (resut8[i] == 6) {
                    cont6++;
                }
                if (resut8[i] == 7) {
                    cont7++;
                }
                if (resut8[i] == 8) {
                    cont8++;
                }
                if (resut8[i] == 9) {
                    cont9++;
                }
                if (resut8[i] == 10) {
                    cont10++;
                }
                if (resut8[i] == 11) {
                    cont11++;
                }
                if (resut8[i] == 12) {
                    cont12++;
                }
                if (resut8[i] == 13) {
                    cont13++;
                }
                if (resut8[i] == 14) {
                    cont14++;
                }
                if (resut8[i] == 15) {
                    cont15++;
                }
                if (resut8[i] == 16) {
                    cont16++;
                }
                if (resut8[i] == 17) {
                    cont17++;
                }
                if (resut8[i] == 18) {
                    cont18++;
                }
                if (resut8[i] == 19) {
                    cont19++;
                }
                if (resut8[i] == 20) {
                    cont20++;
                }
                if (resut8[i] == 21) {
                    cont21++;
                }
                if (resut8[i] == 22) {
                    cont22++;
                }
                if (resut8[i] == 23) {
                    cont23++;
                }
                if (resut8[i] == 24) {
                    cont24++;
                }
                if (resut8[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 8" + e);
        }
        try {
            for (int i = 0; i < resut9.length; i++) {
                if (resut9[i] == 1) {
                    cont1++;
                }
                if (resut9[i] == 2) {
                    cont2++;
                }
                if (resut9[i] == 3) {
                    cont3++;
                }
                if (resut9[i] == 4) {
                    cont4++;
                }
                if (resut9[i] == 5) {
                    cont5++;
                }
                if (resut9[i] == 6) {
                    cont6++;
                }
                if (resut9[i] == 7) {
                    cont7++;
                }
                if (resut9[i] == 8) {
                    cont8++;
                }
                if (resut9[i] == 9) {
                    cont9++;
                }
                if (resut9[i] == 10) {
                    cont10++;
                }
                if (resut9[i] == 11) {
                    cont11++;
                }
                if (resut9[i] == 12) {
                    cont12++;
                }
                if (resut9[i] == 13) {
                    cont13++;
                }
                if (resut9[i] == 14) {
                    cont14++;
                }
                if (resut9[i] == 15) {
                    cont15++;
                }
                if (resut9[i] == 16) {
                    cont16++;
                }
                if (resut9[i] == 17) {
                    cont17++;
                }
                if (resut9[i] == 18) {
                    cont18++;
                }
                if (resut9[i] == 19) {
                    cont19++;
                }
                if (resut9[i] == 20) {
                    cont20++;
                }
                if (resut9[i] == 21) {
                    cont21++;
                }
                if (resut9[i] == 22) {
                    cont22++;
                }
                if (resut9[i] == 23) {
                    cont23++;
                }
                if (resut9[i] == 24) {
                    cont24++;
                }
                if (resut9[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 9" + e);
        }
        try {
            for (int i = 0; i < resut10.length; i++) {
                if (resut10[i] == 1) {
                    cont1++;
                }
                if (resut10[i] == 2) {
                    cont2++;
                }
                if (resut10[i] == 3) {
                    cont3++;
                }
                if (resut10[i] == 4) {
                    cont4++;
                }
                if (resut10[i] == 5) {
                    cont5++;
                }
                if (resut10[i] == 6) {
                    cont6++;
                }
                if (resut10[i] == 7) {
                    cont7++;
                }
                if (resut10[i] == 8) {
                    cont8++;
                }
                if (resut10[i] == 9) {
                    cont9++;
                }
                if (resut10[i] == 10) {
                    cont10++;
                }
                if (resut10[i] == 11) {
                    cont11++;
                }
                if (resut10[i] == 12) {
                    cont12++;
                }
                if (resut10[i] == 13) {
                    cont13++;
                }
                if (resut10[i] == 14) {
                    cont14++;
                }
                if (resut10[i] == 15) {
                    cont15++;
                }
                if (resut10[i] == 16) {
                    cont16++;
                }
                if (resut10[i] == 17) {
                    cont17++;
                }
                if (resut10[i] == 18) {
                    cont18++;
                }
                if (resut10[i] == 19) {
                    cont19++;
                }
                if (resut10[i] == 20) {
                    cont20++;
                }
                if (resut10[i] == 21) {
                    cont21++;
                }
                if (resut10[i] == 22) {
                    cont22++;
                }
                if (resut10[i] == 23) {
                    cont23++;
                }
                if (resut10[i] == 24) {
                    cont24++;
                }
                if (resut10[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 10" + e);
        }
        try {
            for (int i = 0; i < resut11.length; i++) {
                if (resut11[i] == 1) {
                    cont1++;
                }
                if (resut11[i] == 2) {
                    cont2++;
                }
                if (resut11[i] == 3) {
                    cont3++;
                }
                if (resut11[i] == 4) {
                    cont4++;
                }
                if (resut11[i] == 5) {
                    cont5++;
                }
                if (resut11[i] == 6) {
                    cont6++;
                }
                if (resut11[i] == 7) {
                    cont7++;
                }
                if (resut11[i] == 8) {
                    cont8++;
                }
                if (resut11[i] == 9) {
                    cont9++;
                }
                if (resut11[i] == 10) {
                    cont10++;
                }
                if (resut11[i] == 11) {
                    cont11++;
                }
                if (resut11[i] == 12) {
                    cont12++;
                }
                if (resut11[i] == 13) {
                    cont13++;
                }
                if (resut11[i] == 14) {
                    cont14++;
                }
                if (resut11[i] == 15) {
                    cont15++;
                }
                if (resut11[i] == 16) {
                    cont16++;
                }
                if (resut11[i] == 17) {
                    cont17++;
                }
                if (resut11[i] == 18) {
                    cont18++;
                }
                if (resut11[i] == 19) {
                    cont19++;
                }
                if (resut11[i] == 20) {
                    cont20++;
                }
                if (resut11[i] == 21) {
                    cont21++;
                }
                if (resut11[i] == 22) {
                    cont22++;
                }
                if (resut11[i] == 23) {
                    cont23++;
                }
                if (resut11[i] == 24) {
                    cont24++;
                }
                if (resut11[i] == 25) {
                    cont25++;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na contagem lista 11" + e);
        }
        // atribui a variavel dos numeros que entram, o valor 0 para comparar
        try {
            for (int i = 0; i < entra.length; i++) {
                entra[i] = 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir 0 no entra" + e);
        }
        // observa se o valor da primeira posição ainda está 0, senao, atribui o valor de acordo com a contagem
        try {
            if (entra[0] == 0 && cont1 <= 5) {
                entra[0] = 1;
            } else if (entra[0] == 0 && cont2 <= 5) {
                entra[0] = 2;
            } else if (entra[0] == 0 && cont3 <= 5) {
                entra[0] = 3;
            } else if (entra[0] == 0 && cont4 <= 5) {
                entra[0] = 4;
            } else if (entra[0] == 0 && cont5 <= 5) {
                entra[0] = 5;
            } else if (entra[0] == 0 && cont6 <= 5) {
                entra[0] = 6;
            } else if (entra[0] == 0 && cont7 <= 5) {
                entra[0] = 7;
            } else if (entra[0] == 0 && cont8 <= 5) {
                entra[0] = 8;
            } else if (entra[0] == 0 && cont9 <= 5) {
                entra[0] = 9;
            } else if (entra[0] == 0 && cont10 <= 5) {
                entra[0] = 10;
            } else if (entra[0] == 0 && cont11 <= 5) {
                entra[0] = 11;
            } else if (entra[0] == 0 && cont12 <= 5) {
                entra[0] = 12;
            } else if (entra[0] == 0 && cont13 <= 5) {
                entra[0] = 13;
            } else if (entra[0] == 0 && cont14 <= 5) {
                entra[0] = 14;
            } else if (entra[0] == 0 && cont15 <= 5) {
                entra[0] = 15;
            } else if (entra[0] == 0 && cont16 <= 5) {
                entra[0] = 16;
            } else if (entra[0] == 0 && cont17 <= 5) {
                entra[0] = 17;
            } else if (entra[0] == 0 && cont18 <= 5) {
                entra[0] = 18;
            } else if (entra[0] == 0 && cont19 <= 5) {
                entra[0] = 19;
            } else if (entra[0] == 0 && cont20 <= 5) {
                entra[0] = 20;
            } else if (entra[0] == 0 && cont21 <= 5) {
                entra[0] = 21;
            } else if (entra[0] == 0 && cont22 <= 5) {
                entra[0] = 22;
            } else if (entra[0] == 0 && cont23 <= 5) {
                entra[0] = 23;
            } else if (entra[0] == 0 && cont24 <= 5) {
                entra[0] = 24;
            } else if (entra[0] == 0 && cont25 <= 5) {
                entra[0] = 25;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no entra 1" + e);
        }
        // posição 2
        try {

            if (entra[1] == 0 && cont1 <= 5 && entra[0] != 1) {

                entra[1] = 1;

            } else if (entra[1] == 0 && cont2 <= 5 && entra[0] != 2) {

                entra[1] = 2;

            } else if (entra[1] == 0 && cont3 <= 5 && entra[0] != 3) {

                entra[1] = 3;
            } else if (entra[1] == 0 && cont4 <= 5 && entra[0] != 4) {

                entra[1] = 4;

            } else if (entra[1] == 0 && cont5 <= 5 && entra[0] != 5) {

                entra[1] = 5;

            } else if (entra[1] == 0 && cont6 <= 5 && entra[0] != 6) {

                entra[1] = 6;
            } else if (entra[1] == 0 && cont7 <= 5 && entra[0] != 7) {

                entra[1] = 7;
            } else if (entra[1] == 0 && cont8 <= 5 && entra[0] != 8) {

                entra[1] = 8;
            } else if (entra[1] == 0 && cont9 <= 5 && entra[0] != 9) {

                entra[1] = 9;
            } else if (entra[1] == 0 && cont10 <= 5 && entra[0] != 10) {

                entra[1] = 10;
            } else if (entra[1] == 0 && cont11 <= 5 && entra[0] != 11) {

                entra[1] = 11;
            } else if (entra[1] == 0 && cont12 <= 5 && entra[0] != 12) {
                entra[1] = 12;
            } else if (entra[1] == 0 && cont13 <= 5 && entra[0] != 13) {
                entra[1] = 13;
            } else if (entra[1] == 0 && cont14 <= 5 && entra[0] != 14) {

                entra[1] = 14;
            } else if (entra[1] == 0 && cont15 <= 5 && entra[0] != 15) {

                entra[1] = 15;
            } else if (entra[1] == 0 && cont16 <= 5 && entra[0] != 16) {

                entra[1] = 16;
            } else if (entra[1] == 0 && cont17 <= 5 && entra[0] != 17) {

                entra[1] = 17;
            } else if (entra[1] == 0 && cont18 <= 5 && entra[0] != 18) {

                entra[1] = 18;
            } else if (entra[1] == 0 && cont19 <= 5 && entra[0] != 19) {

                entra[1] = 19;
            } else if (entra[1] == 0 && cont20 <= 5 && entra[0] != 20) {

                entra[1] = 20;
            } else if (entra[1] == 0 && cont21 <= 5 && entra[0] != 21) {

                entra[1] = 21;
            } else if (entra[1] == 0 && cont22 <= 5 && entra[0] != 22) {

                entra[1] = 22;
            } else if (entra[1] == 0 && cont23 <= 5 && entra[0] != 23) {

                entra[1] = 23;
            } else if (entra[1] == 0 && cont24 <= 5 && entra[0] != 24) {

                entra[1] = 24;
            } else if (entra[1] == 0 && cont25 <= 5 && entra[0] != 25) {

                entra[1] = 25;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no entra 2" + e);
        }
        // posição 3
        try {
            if (entra[2] == 0 && cont1 <= 5 && entra[0] != 1 && entra[1] != 1) {

                entra[2] = 1;
            } else if (entra[2] == 0 && cont2 <= 5 && entra[0] != 2 && entra[1] != 2) {

                entra[2] = 2;
            } else if (entra[2] == 0 && cont3 <= 5 && entra[0] != 3 && entra[1] != 3) {

                entra[2] = 3;
            } else if (entra[2] == 0 && cont4 <= 5 && entra[0] != 4 && entra[1] != 4) {

                entra[2] = 4;
            } else if (entra[2] == 0 && cont5 <= 5 && entra[0] != 5 && entra[1] != 5) {

                entra[2] = 5;
            } else if (entra[2] == 0 && cont6 <= 5 && entra[0] != 6 && entra[1] != 6) {

                entra[2] = 6;
            } else if (entra[2] == 0 && cont7 <= 5 && entra[0] != 7 && entra[1] != 7) {

                entra[2] = 7;
            } else if (entra[2] == 0 && cont8 <= 5 && entra[0] != 8 && entra[1] != 8) {

                entra[2] = 8;
            } else if (entra[2] == 0 && cont9 <= 5 && entra[0] != 9 && entra[1] != 9) {

                entra[2] = 9;
            } else if (entra[2] == 0 && cont10 <= 5 && entra[0] != 10 && entra[1] != 10) {

                entra[2] = 10;
            } else if (entra[2] == 0 && cont11 <= 5 && entra[0] != 11 && entra[1] != 11) {

                entra[2] = 11;
            } else if (entra[2] == 0 && cont12 <= 5 && entra[0] != 12 && entra[1] != 12) {

                entra[2] = 12;
            } else if (entra[2] == 0 && cont13 <= 5 && entra[0] != 13 && entra[1] != 13) {

                entra[2] = 13;
            } else if (entra[2] == 0 && cont14 <= 5 && entra[0] != 14 && entra[1] != 14) {

                entra[2] = 14;
            } else if (entra[2] == 0 && cont15 <= 5 && entra[0] != 15 && entra[1] != 15) {

                entra[2] = 15;
            } else if (entra[2] == 0 && cont16 <= 5 && entra[0] != 16 && entra[1] != 16) {

                entra[2] = 16;
            } else if (entra[2] == 0 && cont17 <= 5 && entra[0] != 17 && entra[1] != 17) {

                entra[2] = 17;
            } else if (entra[2] == 0 && cont18 <= 5 && entra[0] != 18 && entra[1] != 18) {

                entra[2] = 18;
            } else if (entra[2] == 0 && cont19 <= 5 && entra[0] != 19 && entra[1] != 19) {

                entra[2] = 19;
            } else if (entra[2] == 0 && cont20 <= 5 && entra[0] != 20 && entra[1] != 20) {

                entra[2] = 20;
            } else if (entra[2] == 0 && cont21 <= 5 && entra[0] != 21 && entra[1] != 21) {

                entra[2] = 21;
            } else if (entra[2] == 0 && cont22 <= 5 && entra[0] != 22 && entra[1] != 22) {

                entra[2] = 22;
            } else if (entra[2] == 0 && cont23 <= 5 && entra[0] != 23 && entra[1] != 23) {

                entra[2] = 23;
            } else if (entra[2] == 0 && cont24 <= 5 && entra[0] != 24 && entra[1] != 24) {

                entra[2] = 24;
            } else if (entra[2] == 0 && cont25 <= 5 && entra[0] != 25 && entra[1] != 25) {

                entra[2] = 25;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no entra 3" + e);
        }
        try {
            //posicao 4
            if (entra[3] == 0 && cont1 <= 5 && entra[0] != 1 && entra[1] != 1 && entra[2] != 1) {

                entra[3] = 1;
            } else if (entra[3] == 0 && cont2 <= 5 && entra[0] != 2 && entra[1] != 2 && entra[2] != 2) {

                entra[3] = 2;
            } else if (entra[3] == 0 && cont3 <= 5 && entra[0] != 3 && entra[1] != 3 && entra[2] != 3) {

                entra[3] = 3;
            } else if (entra[3] == 0 && cont4 <= 5 && entra[0] != 4 && entra[1] != 4 && entra[2] != 4) {

                entra[3] = 4;
            } else if (entra[3] == 0 && cont5 <= 5 && entra[0] != 5 && entra[1] != 5 && entra[2] != 5) {

                entra[3] = 5;
            } else if (entra[3] == 0 && cont6 <= 5 && entra[0] != 6 && entra[1] != 6 && entra[2] != 6) {

                entra[3] = 6;
            } else if (entra[3] == 0 && cont7 <= 5 && entra[0] != 7 && entra[1] != 7 && entra[2] != 7) {

                entra[3] = 7;
            } else if (entra[3] == 0 && cont8 <= 5 && entra[0] != 8 && entra[1] != 8 && entra[2] != 8) {

                entra[3] = 8;
            } else if (entra[3] == 0 && cont9 <= 5 && entra[0] != 9 && entra[1] != 9 && entra[2] != 9) {

                entra[3] = 9;
            } else if (entra[3] == 0 && cont10 <= 5 && entra[0] != 10 && entra[1] != 10 && entra[2] != 10) {

                entra[3] = 10;
            } else if (entra[3] == 0 && cont11 <= 5 && entra[0] != 11 && entra[1] != 11 && entra[2] != 11) {

                entra[3] = 11;
            } else if (entra[3] == 0 && cont12 <= 5 && entra[0] != 12 && entra[1] != 12 && entra[2] != 12) {

                entra[3] = 12;
            } else if (entra[3] == 0 && cont13 <= 5 && entra[0] != 13 && entra[1] != 13 && entra[2] != 13) {

                entra[3] = 13;
            } else if (entra[3] == 0 && cont14 <= 5 && entra[0] != 14 && entra[1] != 14 && entra[2] != 14) {

                entra[3] = 14;
            } else if (entra[3] == 0 && cont15 <= 5 && entra[0] != 15 && entra[1] != 15 && entra[2] != 15) {

                entra[3] = 15;
            } else if (entra[3] == 0 && cont16 <= 5 && entra[0] != 16 && entra[1] != 16 && entra[2] != 16) {

                entra[3] = 16;
            } else if (entra[3] == 0 && cont17 <= 5 && entra[0] != 17 && entra[1] != 17 && entra[2] != 17) {

                entra[3] = 17;
            } else if (entra[3] == 0 && cont18 <= 5 && entra[0] != 18 && entra[1] != 18 && entra[2] != 18) {

                entra[3] = 18;
            } else if (entra[3] == 0 && cont19 <= 5 && entra[0] != 19 && entra[1] != 19 && entra[2] != 19) {

                entra[3] = 19;
            } else if (entra[3] == 0 && cont20 <= 5 && entra[0] != 20 && entra[1] != 20 && entra[2] != 20) {

                entra[3] = 20;
            } else if (entra[3] == 0 && cont21 <= 5 && entra[0] != 21 && entra[1] != 21 && entra[2] != 21) {

                entra[3] = 21;
            } else if (entra[3] == 0 && cont22 <= 5 && entra[0] != 22 && entra[1] != 22 && entra[2] != 22) {

                entra[3] = 22;
            } else if (entra[3] == 0 && cont23 <= 5 && entra[0] != 23 && entra[1] != 23 && entra[2] != 23) {

                entra[3] = 23;
            } else if (entra[3] == 0 && cont24 <= 5 && entra[0] != 24 && entra[1] != 24 && entra[2] != 24) {

                entra[3] = 24;
            } else if (entra[3] == 0 && cont25 <= 5 && entra[0] != 25 && entra[1] != 25 && entra[2] != 25) {

                entra[3] = 25;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no entra 4" + e);
        }
        // posição 5
        try {
            if (entra[4] == 0 && cont1 <= 5 && entra[0] != 1 && entra[1] != 1 && entra[2] != 1 && entra[3] != 1) {

                entra[4] = 1;
            } else if (entra[4] == 0 && cont2 <= 5 && entra[0] != 2 && entra[1] != 2 && entra[2] != 2 && entra[3] != 2) {

                entra[4] = 2;
            } else if (entra[4] == 0 && cont3 <= 5 && entra[0] != 3 && entra[1] != 3 && entra[2] != 3 && entra[3] != 3) {

                entra[4] = 3;
            } else if (entra[4] == 0 && cont4 <= 5 && entra[0] != 4 && entra[1] != 4 && entra[2] != 4 && entra[3] != 4) {

                entra[4] = 4;
            } else if (entra[4] == 0 && cont5 <= 5 && entra[0] != 5 && entra[1] != 5 && entra[2] != 5 && entra[3] != 5) {

                entra[4] = 5;
            } else if (entra[4] == 0 && cont6 <= 5 && entra[0] != 6 && entra[1] != 6 && entra[2] != 6 && entra[3] != 6) {

                entra[4] = 6;
            } else if (entra[4] == 0 && cont7 <= 5 && entra[0] != 7 && entra[1] != 7 && entra[2] != 7 && entra[3] != 7) {

                entra[4] = 7;
            } else if (entra[3] == 0 && cont8 <= 5 && entra[0] != 8 && entra[1] != 8 && entra[2] != 8 && entra[3] != 8) {

                entra[4] = 8;
            } else if (entra[4] == 0 && cont9 <= 5 && entra[0] != 9 && entra[1] != 9 && entra[2] != 9 && entra[3] != 9) {

                entra[4] = 9;
            } else if (entra[4] == 0 && cont10 <= 5 && entra[0] != 10 && entra[1] != 10 && entra[2] != 10 && entra[3] != 10) {

                entra[4] = 10;
            } else if (entra[4] == 0 && cont11 <= 5 && entra[0] != 11 && entra[1] != 11 && entra[2] != 11 && entra[3] != 11) {

                entra[4] = 11;
            } else if (entra[4] == 0 && cont12 <= 5 && entra[0] != 12 && entra[1] != 12 && entra[2] != 12 && entra[3] != 12) {

                entra[4] = 12;
            } else if (entra[4] == 0 && cont13 <= 5 && entra[0] != 13 && entra[1] != 13 && entra[2] != 13 && entra[3] != 13) {

                entra[4] = 13;
            } else if (entra[4] == 0 && cont14 <= 5 && entra[0] != 14 && entra[1] != 14 && entra[2] != 14 && entra[3] != 14) {

                entra[4] = 14;
            } else if (entra[4] == 0 && cont15 <= 5 && entra[0] != 15 && entra[1] != 15 && entra[2] != 15 && entra[3] != 15) {

                entra[4] = 15;
            } else if (entra[3] == 0 && cont16 <= 5 && entra[0] != 16 && entra[1] != 16 && entra[2] != 16 && entra[3] != 16) {

                entra[4] = 16;
            } else if (entra[4] == 0 && cont17 <= 5 && entra[0] != 17 && entra[1] != 17 && entra[2] != 17 && entra[3] != 17) {

                entra[4] = 17;
            } else if (entra[4] == 0 && cont18 <= 5 && entra[0] != 18 && entra[1] != 18 && entra[2] != 18 && entra[3] != 18) {

                entra[4] = 18;
            } else if (entra[4] == 0 && cont19 <= 5 && entra[0] != 19 && entra[1] != 19 && entra[2] != 19 && entra[3] != 19) {

                entra[4] = 19;
            } else if (entra[3] == 0 && cont20 <= 5 && entra[0] != 20 && entra[1] != 20 && entra[2] != 20 && entra[3] != 20) {

                entra[4] = 20;
            } else if (entra[4] == 0 && cont21 <= 5 && entra[0] != 21 && entra[1] != 21 && entra[2] != 21 && entra[3] != 21) {

                entra[4] = 21;
            } else if (entra[3] == 0 && cont22 <= 5 && entra[0] != 22 && entra[1] != 22 && entra[2] != 22 && entra[3] != 22) {

                entra[4] = 22;
            } else if (entra[4] == 0 && cont23 <= 5 && entra[0] != 23 && entra[1] != 23 && entra[2] != 23 && entra[3] != 23) {

                entra[4] = 23;
            } else if (entra[4] == 0 && cont24 <= 5 && entra[0] != 24 && entra[1] != 24 && entra[2] != 24 && entra[3] != 25) {

                entra[4] = 24;
            } else if (entra[4] == 0 && cont25 <= 5 && entra[0] != 25 && entra[1] != 25 && entra[2] != 25 && entra[3] != 25) {

                entra[4] = 25;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor na contagem 5" + e);
        }
        looping:
        for (int sj : entra) {
            if (sj == 0) {
                Random rand = new Random();
                int randomNum = rand.nextInt((25) + 1);
                if (randomNum == sj) {
                    continue looping;
                } else {
                    for (int i = 0; i < entra.length; i++) {
                        if (entra[i] == 0) {

                            entra[i] = randomNum;
                        }

                    }
                }

            }

        }

        try {
            for (int i = 0; i < sair.length; i++) {
                sair[i] = 0;
            }
        } catch (Exception e) {
        }

        // observa se o valor da primeira posição ainda está 0, senao, atribui o valor de acordo com a contagem
        try {
            if (sair[0] == 0 && cont1 >= 8) {
                sair[0] = 1;
            } else if (sair[0] == 0 && cont2 >= 8) {
                sair[0] = 2;
            } else if (sair[0] == 0 && cont3 >= 8) {
                sair[0] = 3;
            } else if (sair[0] == 0 && cont4 >= 8) {
                sair[0] = 4;
            } else if (sair[0] == 0 && cont5 >= 8) {
                sair[0] = 5;
            } else if (sair[0] == 0 && cont6 >= 8) {
                sair[0] = 6;
            } else if (sair[0] == 0 && cont7 >= 8) {
                sair[0] = 7;
            } else if (sair[0] == 0 && cont8 >= 8) {
                sair[0] = 8;
            } else if (sair[0] == 0 && cont9 >= 8) {
                sair[0] = 9;
            } else if (sair[0] == 0 && cont10 >= 8) {
                sair[0] = 10;
            } else if (sair[0] == 0 && cont11 >= 8) {
                sair[0] = 11;
            } else if (sair[0] == 0 && cont12 >= 8) {
                sair[0] = 12;
            } else if (sair[0] == 0 && cont13 >= 8) {
                sair[0] = 13;
            } else if (sair[0] == 0 && cont14 >= 8) {
                sair[0] = 14;
            } else if (sair[0] == 0 && cont15 >= 8) {
                sair[0] = 15;
            } else if (sair[0] == 0 && cont16 >= 8) {
                sair[0] = 16;
            } else if (sair[0] == 0 && cont17 >= 8) {
                sair[0] = 17;
            } else if (sair[0] == 0 && cont18 >= 8) {
                sair[0] = 18;
            } else if (sair[0] == 0 && cont19 >= 8) {
                sair[0] = 19;
            } else if (sair[0] == 0 && cont20 >= 8) {
                sair[0] = 20;
            } else if (sair[0] == 0 && cont21 >= 8) {
                sair[0] = 21;
            } else if (sair[0] == 0 && cont22 >= 8) {
                sair[0] = 22;
            } else if (sair[0] == 0 && cont23 >= 8) {
                sair[0] = 23;
            } else if (sair[0] == 0 && cont24 >= 8) {
                sair[0] = 24;
            } else if (sair[0] == 0 && cont25 >= 8) {
                sair[0] = 25;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no sair 1" + e);
        }
        // posição 2
        try {
            if (sair[1] == 0 && cont1 >= 8 && sair[0] != 1) {

                sair[1] = 1;

            } else if (sair[1] == 0 && cont2 >= 8 && sair[0] != 2) {

                sair[1] = 2;
            } else if (sair[1] == 0 && cont2 >= 8 && sair[0] != 3) {

                sair[1] = 3;
            } else if (sair[1] == 0 && cont4 >= 8 && sair[0] != 4) {

                sair[1] = 4;
            } else if (sair[1] == 0 && cont5 >= 8 && sair[0] != 5) {

                sair[1] = 5;
            } else if (sair[1] == 0 && cont6 >= 8 && sair[0] != 6) {

                sair[1] = 6;
            } else if (sair[1] == 0 && cont7 >= 8 && sair[0] != 7) {

                sair[1] = 7;
            } else if (sair[1] == 0 && cont8 >= 8 && sair[0] != 8) {

                sair[1] = 8;
            } else if (sair[1] == 0 && cont9 >= 8 && sair[0] != 9) {

                sair[1] = 9;
            } else if (sair[1] == 0 && cont10 >= 8 && sair[0] != 10) {

                sair[1] = 10;
            } else if (sair[1] == 0 && cont11 >= 8 && sair[0] != 11) {

                sair[1] = 11;
            } else if (sair[1] == 0 && cont12 >= 8 && sair[0] != 12) {

                sair[1] = 12;
            } else if (sair[1] == 0 && cont13 >= 8 && sair[0] != 13) {

                sair[1] = 13;
            } else if (sair[1] == 0 && cont14 >= 8 && sair[0] != 14) {

                sair[1] = 14;
            } else if (sair[1] == 0 && cont15 >= 8 && sair[0] != 15) {

                sair[1] = 15;
            } else if (sair[1] == 0 && cont16 >= 8 && sair[0] != 16) {

                sair[1] = 16;
            } else if (sair[1] == 0 && cont17 >= 8 && sair[0] != 17) {

                sair[1] = 17;
            } else if (sair[1] == 0 && cont18 >= 8 && sair[0] != 18) {

                sair[1] = 18;
            } else if (sair[1] == 0 && cont19 >= 8 && sair[0] != 19) {

                sair[1] = 19;
            } else if (sair[1] == 0 && cont20 >= 8 && sair[0] != 20) {

                sair[1] = 20;
            } else if (sair[1] == 0 && cont21 >= 8 && sair[0] != 21) {

                sair[1] = 21;
            } else if (sair[1] == 0 && cont22 >= 8 && sair[0] != 22) {

                sair[1] = 2;
            } else if (sair[1] == 0 && cont23 >= 8 && sair[0] != 23) {

                sair[1] = 23;
            } else if (sair[1] == 0 && cont24 >= 8 && sair[0] != 24) {

                sair[1] = 24;
            } else if (sair[1] == 0 && cont25 >= 8 && sair[0] != 25) {

                sair[1] = 25;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no sair 2" + e);
        }
        // posição 3
        try {
            if (sair[2] == 0 && cont1 >= 8 && sair[0] != 1 && sair[1] != 1) {

                sair[2] = 1;

            } else if (sair[2] == 0 && cont2 >= 8 && sair[0] != 2 && sair[1] != 2) {

                sair[2] = 2;
            } else if (sair[2] == 0 && cont3 >= 8 && sair[0] != 3 && sair[1] != 3) {

                sair[2] = 3;
            } else if (sair[2] == 0 && cont4 >= 8 && sair[0] != 4 && sair[1] != 4) {

                sair[2] = 24;
            } else if (sair[2] == 0 && cont5 >= 8 && sair[0] != 5 && sair[1] != 5) {

                sair[2] = 5;
            } else if (sair[2] == 0 && cont6 >= 8 && sair[0] != 6 && sair[1] != 6) {

                sair[2] = 6;
            } else if (sair[2] == 0 && cont7 >= 8 && sair[0] != 7 && sair[1] != 7) {

                sair[2] = 7;
            } else if (sair[2] == 0 && cont8 >= 8 && sair[0] != 8 && sair[1] != 8) {

                sair[2] = 8;
            } else if (sair[2] == 0 && cont9 >= 8 && sair[0] != 9 && sair[1] != 9) {

                sair[2] = 9;
            } else if (sair[2] == 0 && cont10 >= 8 && sair[0] != 10 && sair[1] != 10) {

                sair[2] = 10;
            } else if (sair[2] == 0 && cont11 >= 8 && sair[0] != 11 && sair[1] != 11) {

                sair[2] = 11;
            } else if (sair[2] == 0 && cont12 >= 8 && sair[0] != 12 && sair[1] != 12) {

                sair[2] = 12;
            } else if (sair[2] == 0 && cont13 >= 8 && sair[0] != 13 && sair[1] != 13) {

                sair[2] = 13;
            } else if (sair[2] == 0 && cont14 >= 8 && sair[0] != 14 && sair[1] != 14) {

                sair[2] = 14;
            } else if (sair[2] == 0 && cont15 >= 8 && sair[0] != 15 && sair[1] != 15) {

                sair[2] = 15;
            } else if (sair[2] == 0 && cont16 >= 8 && sair[0] != 16 && sair[1] != 16) {

                sair[2] = 16;
            } else if (sair[2] == 0 && cont17 >= 8 && sair[0] != 17 && sair[1] != 17) {

                sair[2] = 17;
            } else if (sair[2] == 0 && cont18 >= 8 && sair[0] != 18 && sair[1] != 18) {

                sair[2] = 18;
            } else if (sair[2] == 0 && cont19 >= 8 && sair[0] != 19 && sair[1] != 19) {

                sair[2] = 19;
            } else if (sair[2] == 0 && cont20 >= 8 && sair[0] != 20 && sair[1] != 20) {

                sair[2] = 20;
            } else if (sair[2] == 0 && cont21 >= 8 && sair[0] != 21 && sair[1] != 21) {

                sair[2] = 21;
            } else if (sair[2] == 0 && cont22 >= 8 && sair[0] != 22 && sair[1] != 22) {

                sair[2] = 22;
            } else if (sair[2] == 0 && cont23 >= 8 && sair[0] != 23 && sair[1] != 23) {

                sair[2] = 23;
            } else if (sair[2] == 0 && cont24 >= 8 && sair[0] != 24 && sair[1] != 24) {

                sair[2] = 24;
            } else if (sair[2] == 0 && cont25 >= 8 && sair[0] != 25 && sair[1] != 25) {

                sair[2] = 25;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no sair 3" + e);
        }
        //posicao 4
        try {
            if (sair[3] == 0 && cont1 >= 8 && sair[0] != 1 && sair[1] != 1 && sair[2] != 1) {

                sair[3] = 1;
            } else if (sair[3] == 0 && cont2 >= 8 && sair[0] != 2 && sair[1] != 2 && sair[2] != 2) {

                sair[3] = 2;
            } else if (sair[3] == 0 && cont3 >= 8 && sair[0] != 3 && sair[1] != 3 && sair[2] != 3) {

                sair[3] = 3;
            } else if (sair[3] == 0 && cont4 >= 8 && sair[0] != 4 && sair[1] != 4 && sair[2] != 4) {

                sair[3] = 4;
            } else if (sair[3] == 0 && cont5 >= 8 && sair[0] != 5 && sair[1] != 5 && sair[2] != 5) {

                sair[3] = 5;
            } else if (sair[3] == 0 && cont6 >= 8 && sair[0] != 6 && sair[1] != 6 && sair[2] != 6) {

                sair[3] = 6;
            } else if (sair[3] == 0 && cont7 >= 8 && sair[0] != 7 && sair[1] != 7 && sair[2] != 7) {

                sair[3] = 7;
            } else if (sair[3] == 0 && cont8 >= 8 && sair[0] != 8 && sair[1] != 8 && sair[2] != 8) {

                sair[3] = 8;
            } else if (sair[3] == 0 && cont9 >= 8 && sair[0] != 9 && sair[1] != 9 && sair[2] != 9) {

                sair[3] = 9;
            } else if (sair[3] == 0 && cont10 >= 8 && sair[0] != 10 && sair[1] != 10 && sair[2] != 10) {

                sair[3] = 10;
            } else if (sair[3] == 0 && cont11 >= 8 && sair[0] != 11 && sair[1] != 11 && sair[2] != 11) {

                sair[3] = 11;
            } else if (sair[3] == 0 && cont12 >= 8 && sair[0] != 12 && sair[1] != 12 && sair[2] != 12) {

                sair[3] = 12;
            } else if (sair[3] == 0 && cont13 >= 8 && sair[0] != 13 && sair[1] != 13 && sair[2] != 13) {

                sair[3] = 13;
            } else if (sair[3] == 0 && cont14 >= 8 && sair[0] != 14 && sair[1] != 14 && sair[2] != 14) {

                sair[3] = 14;
            } else if (sair[3] == 0 && cont15 >= 8 && sair[0] != 15 && sair[1] != 15 && sair[2] != 15) {

                sair[3] = 15;
            } else if (sair[3] == 0 && cont16 >= 8 && sair[0] != 16 && sair[1] != 16 && sair[2] != 16) {

                sair[3] = 16;
            } else if (sair[3] == 0 && cont17 >= 8 && sair[0] != 17 && sair[1] != 17 && sair[2] != 17) {

                sair[3] = 17;
            } else if (sair[3] == 0 && cont18 >= 8 && sair[0] != 18 && sair[1] != 18 && sair[2] != 18) {

                sair[3] = 18;
            } else if (sair[3] == 0 && cont19 >= 8 && sair[0] != 19 && sair[1] != 19 && sair[2] != 19) {

                sair[3] = 19;
            } else if (sair[3] == 0 && cont20 >= 8 && sair[0] != 20 && sair[1] != 20 && sair[2] != 20) {

                sair[3] = 20;
            } else if (sair[3] == 0 && cont21 >= 8 && sair[0] != 21 && sair[1] != 21 && sair[2] != 21) {

                sair[3] = 21;
            } else if (sair[3] == 0 && cont22 >= 8 && sair[0] != 22 && sair[1] != 22 && sair[2] != 22) {

                sair[3] = 22;
            } else if (sair[3] == 0 && cont23 >= 8 && sair[0] != 23 && sair[1] != 23 && sair[2] != 23) {

                sair[3] = 23;
            } else if (sair[3] == 0 && cont24 >= 8 && sair[0] != 24 && sair[1] != 24 && sair[2] != 24) {

                sair[3] = 24;
            } else if (sair[3] == 0 && cont25 >= 8 && sair[0] != 25 && sair[1] != 25 && sair[2] != 25) {

                sair[3] = 25;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no sair 4" + e);
        }
        // posição 5
        try {
            if (sair[4] == 0 && cont1 >= 8 && sair[0] != 1 && sair[1] != 1 && sair[2] != 1 && sair[3] != 1) {

                sair[4] = 1;
            } else if (sair[4] == 0 && cont2 >= 8 && sair[0] != 2 && sair[1] != 2 && sair[2] != 2 && sair[3] != 2) {

                sair[4] = 2;
            } else if (sair[4] == 0 && cont3 >= 8 && sair[0] != 3 && sair[1] != 3 && sair[2] != 3 && sair[3] != 3) {

                sair[4] = 3;
            } else if (sair[4] == 0 && cont4 >= 8 && sair[0] != 4 && sair[1] != 4 && sair[2] != 4 && sair[3] != 4) {

                sair[4] = 4;
            } else if (sair[4] == 0 && cont5 >= 8 && sair[0] != 5 && sair[1] != 5 && sair[2] != 5 && sair[3] != 5) {

                sair[4] = 5;
            } else if (sair[4] == 0 && cont6 >= 8 && sair[0] != 6 && sair[1] != 6 && sair[2] != 6 && sair[3] != 6) {

                sair[4] = 6;
            } else if (sair[4] == 0 && cont7 >= 8 && sair[0] != 7 && sair[1] != 7 && sair[2] != 7 && sair[3] != 7) {

                sair[4] = 7;
            } else if (sair[4] == 0 && cont8 >= 8 && sair[0] != 8 && sair[1] != 8 && sair[2] != 8 && sair[3] != 8) {

                sair[4] = 8;
            } else if (sair[4] == 0 && cont9 >= 8 && sair[0] != 9 && sair[1] != 9 && sair[2] != 9 && sair[3] != 9) {

                sair[4] = 9;
            } else if (sair[4] == 0 && cont10 >= 8 && sair[0] != 10 && sair[1] != 10 && sair[2] != 10 && sair[3] != 10) {

                sair[4] = 10;
            } else if (sair[4] == 0 && cont11 >= 8 && sair[0] != 11 && sair[1] != 11 && sair[2] != 11 && sair[3] != 11) {

                sair[4] = 11;
            } else if (sair[4] == 0 && cont12 >= 8 && sair[0] != 12 && sair[1] != 12 && sair[2] != 12 && sair[3] != 12) {

                sair[4] = 12;
            } else if (sair[4] == 0 && cont13 >= 8 && sair[0] != 13 && sair[1] != 13 && sair[2] != 13 && sair[3] != 13) {

                sair[4] = 13;
            } else if (sair[4] == 0 && cont14 >= 8 && sair[0] != 14 && sair[1] != 14 && sair[2] != 14 && sair[3] != 14) {

                sair[4] = 14;
            } else if (sair[4] == 0 && cont15 >= 8 && sair[0] != 15 && sair[1] != 15 && sair[2] != 15 && sair[3] != 15) {

                sair[4] = 15;
            } else if (sair[4] == 0 && cont16 >= 8 && sair[0] != 16 && sair[1] != 16 && sair[2] != 16 && sair[3] != 16) {

                sair[4] = 16;
            } else if (sair[4] == 0 && cont17 >= 8 && sair[0] != 17 && sair[1] != 17 && sair[2] != 17 && sair[3] != 17) {

                sair[4] = 17;
            } else if (sair[4] == 0 && cont18 >= 8 && sair[0] != 18 && sair[1] != 18 && sair[2] != 18 && sair[3] != 18) {

                sair[4] = 18;
            } else if (sair[4] == 0 && cont19 >= 8 && sair[0] != 19 && sair[1] != 19 && sair[2] != 19 && sair[3] != 19) {

                sair[4] = 19;
            } else if (sair[4] == 0 && cont20 >= 8 && sair[0] != 20 && sair[1] != 20 && sair[2] != 20 && sair[3] != 20) {

                sair[4] = 20;
            } else if (sair[4] == 0 && cont21 >= 8 && sair[0] != 21 && sair[1] != 21 && sair[2] != 21 && sair[3] != 21) {

                sair[4] = 21;
            } else if (sair[4] == 0 && cont22 >= 8 && sair[0] != 22 && sair[1] != 22 && sair[2] != 22 && sair[3] != 22) {

                sair[4] = 22;
            } else if (sair[4] == 0 && cont23 >= 8 && sair[0] != 23 && sair[1] != 23 && sair[2] != 23 && sair[3] != 23) {

                sair[4] = 23;
            } else if (sair[4] == 0 && cont24 >= 8 && sair[0] != 24 && sair[1] != 24 && sair[2] != 24 && sair[3] != 24) {

                sair[4] = 24;
            } else if (sair[4] == 0 && cont25 >= 8 && sair[0] != 25 && sair[1] != 25 && sair[2] != 25 && sair[3] != 25) {

                sair[4] = 25;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor da contagem no sair 5" + e);
        }
        looping2:
        for (int sjj : sair) {
            if (sjj == 0) {
                Random rand = new Random();
                int randomNum = rand.nextInt((25) + 1);
                if (randomNum == sjj) {
                    continue looping2;
                } else {
                    for (int i = 0; i < sair.length; i++) {
                        if (sair[i] == 0) {

                            sair[i] = randomNum;
                        }

                    }
                }

            }

        }


        int vascou[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        try {
            int a = 0;

            loop:
            for (int vascos : vascou) {
                for (int e : entra) {
                    if (vascos == e) {

                        continue loop;

                    }

                }

                for (int s : sair) {
                    if (vascos == s) {
                        continue loop;

                    }

                }
                aleatorios[a] = vascos;
                a++;
                if (a == aleatorios.length) {

                    break;

                }

            }

            int lop = 0;
            Set<Integer> numeros = new HashSet<>(5);
            radLoop:
            for (int g : vascou) {

                int min_val = 1;
                int max_val = 25;
                Random rand = new Random();
                int randomNum = rand.nextInt((max_val) + min_val);
                if (randomNum == 0) {
                    continue radLoop;
                }

                for (int e : entra) {
                    if (randomNum == e) {
                        continue radLoop;
                    }
                }
                for (int s : sair) {
                    if (randomNum == s) {

                        continue radLoop;
                    }

                }
                for (int al : aleatorios) {
                    if (randomNum == al) {

                        continue radLoop;
                    }
                }

                numeros.add(randomNum);
                lop++;

                for (int r : numeros) {

                    if (r == 0) {

                        continue radLoop;

                    }

                }
                for (int y : numeros) {
                    if (y != 0) {
                        if (lop == randon.length) {
                            break;
                        }
                    }
                }
            }
            Integer[] resultado = numeros.toArray(new Integer[numeros.size()]);
            int cc = 0;
            for (int rr : resultado) {
                randon[cc] = rr;
                cc++;
                if (cc == randon.length) {
                    break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor nos aleatorios" + e);
        }
        try {
            lucky[0] = entra[0];
            lucky[1] = entra[1];
            lucky[2] = entra[2];
            lucky[3] = entra[3];
            lucky[4] = entra[4];
            lucky[5] = aleatorios[0];
            lucky[6] = aleatorios[1];
            lucky[7] = aleatorios[2];
            lucky[8] = aleatorios[3];
            lucky[9] = aleatorios[4];
            lucky[10] = randon[0];
            lucky[11] = randon[1];
            lucky[12] = randon[2];
            lucky[13] = randon[3];
            lucky[14] = randon[4];

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em atribuir valor no lucky" + e);
        }
        campoJogo.setText("77");
        camponum1.setText(String.valueOf(lucky[0]));
        camponum2.setText(String.valueOf(lucky[1]));
        camponum3.setText(String.valueOf(lucky[2]));
        camponum4.setText(String.valueOf(lucky[3]));
        camponum5.setText(String.valueOf(lucky[4]));
        camponum6.setText(String.valueOf(lucky[5]));
        camponum7.setText(String.valueOf(lucky[6]));
        camponum8.setText(String.valueOf(lucky[7]));
        camponum9.setText(String.valueOf(lucky[8]));
        camponum10.setText(String.valueOf(lucky[9]));
        camponum11.setText(String.valueOf(lucky[10]));
        camponum12.setText(String.valueOf(lucky[11]));
        camponum13.setText(String.valueOf(lucky[12]));
        camponum14.setText(String.valueOf(lucky[13]));
        camponum15.setText(String.valueOf(lucky[14]));

        System.out.println(Arrays.toString(sair));

    }
    // metodo de inserção

    public void inserir() {
        // cria objeto pra acessar os gets e setters da classe bean
        JogoBean obj = new JogoBean();
        // seta cada uma das variaveis com os campos
        obj.setCodJogo(Integer.parseInt(campoJogo.getText()));
        obj.setNum1(Integer.parseInt(camponum1.getText()));
        obj.setNum2(Integer.parseInt(camponum2.getText()));
        obj.setNum3(Integer.parseInt(camponum3.getText()));
        obj.setNum4(Integer.parseInt(camponum4.getText()));
        obj.setNum5(Integer.parseInt(camponum5.getText()));
        obj.setNum6(Integer.parseInt(camponum6.getText()));
        obj.setNum7(Integer.parseInt(camponum7.getText()));
        obj.setNum8(Integer.parseInt(camponum8.getText()));
        obj.setNum9(Integer.parseInt(camponum9.getText()));
        obj.setNum10(Integer.parseInt(camponum10.getText()));
        obj.setNum11(Integer.parseInt(camponum11.getText()));
        obj.setNum12(Integer.parseInt(camponum12.getText()));
        obj.setNum13(Integer.parseInt(camponum13.getText()));
        obj.setNum14(Integer.parseInt(camponum14.getText()));
        obj.setNum15(Integer.parseInt(camponum15.getText()));

        // cria um objeto pra acessar os metodos do dao
        JogoDao dao = new JogoDao();
        // acesa o metodo dao e usa o objeto do bean já com os valores setados
        dao.InserirJogo(obj);

    }
// método de alterar

    public void substituir() {
        // cria objeto pra acessar os gets e setters da classe bean
        JogoBean obj = new JogoBean();
        // seta cada uma das variaveis com os campos
        obj.setCodJogo(Integer.parseInt(campoJogo.getText()));
        obj.setNum1(Integer.parseInt(camponum1.getText()));
        obj.setNum2(Integer.parseInt(camponum2.getText()));
        obj.setNum3(Integer.parseInt(camponum3.getText()));
        obj.setNum4(Integer.parseInt(camponum4.getText()));
        obj.setNum5(Integer.parseInt(camponum5.getText()));
        obj.setNum6(Integer.parseInt(camponum6.getText()));
        obj.setNum7(Integer.parseInt(camponum7.getText()));
        obj.setNum8(Integer.parseInt(camponum8.getText()));
        obj.setNum9(Integer.parseInt(camponum9.getText()));
        obj.setNum10(Integer.parseInt(camponum10.getText()));
        obj.setNum11(Integer.parseInt(camponum11.getText()));
        obj.setNum12(Integer.parseInt(camponum12.getText()));
        obj.setNum13(Integer.parseInt(camponum13.getText()));
        obj.setNum14(Integer.parseInt(camponum14.getText()));
        obj.setNum15(Integer.parseInt(camponum15.getText()));

        // cria um objeto pra acessar os metodos do dao
        JogoDao dao = new JogoDao();
        // acesa o metodo dao e usa o objeto do bean já com os valores setados
        dao.AlterarJogo(obj);

    }

// metodo de listagem
    public void listar() {
        try {
            // adiciona o valor que será buscado
            int jogo = Integer.parseInt(campoJogo.getText());
            // executar o select

            JogoDao dao = new JogoDao();
            List<JogoBean> listarJogo = dao.listarJogo(jogo);

            // utiliza o jogo litado e joga nos campos
            for (JogoBean jg : listarJogo) {

                campoJogo.setText(String.valueOf(jg.getCodJogo()));
                camponum1.setText(String.valueOf(jg.getNum1()));
                camponum2.setText(String.valueOf(jg.getNum2()));
                camponum3.setText(String.valueOf(jg.getNum3()));
                camponum4.setText(String.valueOf(jg.getNum4()));
                camponum5.setText(String.valueOf(jg.getNum5()));
                camponum6.setText(String.valueOf(jg.getNum6()));
                camponum7.setText(String.valueOf(jg.getNum7()));
                camponum8.setText(String.valueOf(jg.getNum8()));
                camponum9.setText(String.valueOf(jg.getNum9()));
                camponum10.setText(String.valueOf(jg.getNum10()));
                camponum11.setText(String.valueOf(jg.getNum11()));
                camponum12.setText(String.valueOf(jg.getNum12()));
                camponum13.setText(String.valueOf(jg.getNum13()));
                camponum14.setText(String.valueOf(jg.getNum14()));
                camponum15.setText(String.valueOf(jg.getNum15()));

            }

        } catch (Exception e) {
        }

    }
// metodo de atualizar os jogos

    public void att() {
        // indicará o valor e depois lista ele e depois substitui
        try {
            campoJogo.setText("2");
            listar();
            campoJogo.setText("1");
            substituir();

            campoJogo.setText("3");
            listar();
            campoJogo.setText("2");
            substituir();

            campoJogo.setText("4");
            listar();
            campoJogo.setText("3");
            substituir();

            campoJogo.setText("5");
            listar();
            campoJogo.setText("4");
            substituir();

            campoJogo.setText("6");
            listar();
            campoJogo.setText("5");
            substituir();

            campoJogo.setText("7");
            listar();
            campoJogo.setText("6");
            substituir();

            campoJogo.setText("8");
            listar();
            campoJogo.setText("7");
            substituir();

            campoJogo.setText("9");
            listar();
            campoJogo.setText("8");
            substituir();

            campoJogo.setText("10");
            listar();
            campoJogo.setText("9");
            substituir();

            campoJogo.setText("11");
            listar();
            campoJogo.setText("10");
            substituir();

            campoJogo.setText("11");
            camponum1.setText("");
            camponum2.setText("");
            camponum3.setText("");
            camponum4.setText("");
            camponum5.setText("");
            camponum6.setText("");
            camponum7.setText("");
            camponum8.setText("");
            camponum9.setText("");
            camponum10.setText("");
            camponum11.setText("");
            camponum12.setText("");
            camponum13.setText("");
            camponum14.setText("");
            camponum15.setText("");

            JOptionPane.showMessageDialog(null, "Pode inserir o jogo novo");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na atualização" + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoJogo = new javax.swing.JTextField();
        bt_Puxar = new javax.swing.JButton();
        camponum1 = new javax.swing.JTextField();
        camponum2 = new javax.swing.JTextField();
        camponum3 = new javax.swing.JTextField();
        camponum4 = new javax.swing.JTextField();
        camponum5 = new javax.swing.JTextField();
        camponum10 = new javax.swing.JTextField();
        camponum9 = new javax.swing.JTextField();
        camponum8 = new javax.swing.JTextField();
        camponum7 = new javax.swing.JTextField();
        camponum6 = new javax.swing.JTextField();
        camponum11 = new javax.swing.JTextField();
        camponum12 = new javax.swing.JTextField();
        camponum13 = new javax.swing.JTextField();
        camponum14 = new javax.swing.JTextField();
        camponum15 = new javax.swing.JTextField();
        bt_inserir = new javax.swing.JButton();
        bt_change = new javax.swing.JButton();
        bt_gerar = new javax.swing.JButton();
        bt_atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Luck");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Jogo");

        bt_Puxar.setText("puxar");
        bt_Puxar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PuxarActionPerformed(evt);
            }
        });

        camponum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponum1ActionPerformed(evt);
            }
        });

        camponum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponum7ActionPerformed(evt);
            }
        });

        bt_inserir.setText("inserir");
        bt_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inserirActionPerformed(evt);
            }
        });

        bt_change.setText("Alterar");
        bt_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changeActionPerformed(evt);
            }
        });

        bt_gerar.setText("gerar jogo");
        bt_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gerarActionPerformed(evt);
            }
        });

        bt_atualizar.setText("Atualizar jogos");
        bt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(bt_Puxar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(camponum11, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(camponum1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camponum6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(camponum12, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(camponum2)
                            .addComponent(camponum7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_gerar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(camponum13, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(camponum3)
                                    .addComponent(camponum8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(camponum14, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(camponum4)
                                    .addComponent(camponum9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(camponum5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(camponum10)
                                    .addComponent(camponum15))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(bt_change)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(bt_inserir)
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_atualizar)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Puxar))
                .addGap(10, 10, 10)
                .addComponent(bt_atualizar)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponum10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponum11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponum15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_inserir)
                    .addComponent(bt_change))
                .addGap(18, 18, 18)
                .addComponent(bt_gerar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camponum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponum1ActionPerformed

    private void camponum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponum7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponum7ActionPerformed

    private void bt_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inserirActionPerformed
        try {
            inserir();
            JOptionPane.showMessageDialog(null, "Cadastro feito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cadastro falhou" + e);
        }
    }//GEN-LAST:event_bt_inserirActionPerformed

    private void bt_PuxarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PuxarActionPerformed

        try {
            listar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listagem deu erro " + e);
        }

    }//GEN-LAST:event_bt_PuxarActionPerformed

    private void bt_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changeActionPerformed
        try {
            substituir();
            JOptionPane.showMessageDialog(null, " Alterou ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "alterar deu erro " + e);
        }
    }//GEN-LAST:event_bt_changeActionPerformed

    private void bt_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gerarActionPerformed

        gerar();


    }//GEN-LAST:event_bt_gerarActionPerformed

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        att();
    }//GEN-LAST:event_bt_atualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Puxar;
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JButton bt_change;
    private javax.swing.JButton bt_gerar;
    private javax.swing.JButton bt_inserir;
    private javax.swing.JTextField campoJogo;
    private javax.swing.JTextField camponum1;
    private javax.swing.JTextField camponum10;
    private javax.swing.JTextField camponum11;
    private javax.swing.JTextField camponum12;
    private javax.swing.JTextField camponum13;
    private javax.swing.JTextField camponum14;
    private javax.swing.JTextField camponum15;
    private javax.swing.JTextField camponum2;
    private javax.swing.JTextField camponum3;
    private javax.swing.JTextField camponum4;
    private javax.swing.JTextField camponum5;
    private javax.swing.JTextField camponum6;
    private javax.swing.JTextField camponum7;
    private javax.swing.JTextField camponum8;
    private javax.swing.JTextField camponum9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
