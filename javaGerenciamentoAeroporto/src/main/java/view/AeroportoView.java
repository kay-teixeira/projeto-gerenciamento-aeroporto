package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class AeroportoView extends javax.swing.JFrame {

    public AeroportoView() {
        initComponents();
        carregarPassageirosNoComboBox();
        carregarVoosNoComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        tabPassageiro = new javax.swing.JPanel();
        txtNome = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCPF = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        txtData_nascimento = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefone = new java.awt.TextField();
        btnAdicionar_passageiro = new javax.swing.JButton();
        btnExcluir_passageiro = new javax.swing.JButton();
        btnAtualizar_passageiro = new javax.swing.JButton();
        btnExibir_passageiro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaExibir_passageiros = new javax.swing.JTextArea();
        btnLimpar_passageiro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tabVoo = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDestino = new java.awt.TextField();
        txtOrigem = new java.awt.TextField();
        comboClasse = new javax.swing.JComboBox<>();
        comboHora_partida = new javax.swing.JComboBox<>();
        jCalendar = new com.toedter.calendar.JCalendar();
        jLabel24 = new javax.swing.JLabel();
        txtPreco = new java.awt.TextField();
        btnAtualizar_voo = new javax.swing.JButton();
        btnExcluir_voo = new javax.swing.JButton();
        btnExibir_voo = new javax.swing.JButton();
        btnAdicionar_voo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaExibir_voo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tabReserva = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnAdicionar_reserva = new javax.swing.JButton();
        btnAtualizar_reserva = new javax.swing.JButton();
        btnExcluir_reserva = new javax.swing.JButton();
        btnRelatorio_reserva = new javax.swing.JButton();
        comboPassageiros = new javax.swing.JComboBox<>();
        comboVoos = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaRelatorio_reserva = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        jLabel5.setText("CPF:");

        jLabel6.setText("Data de Nascimento:");

        jLabel7.setText("E-mail:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefone:");

        btnAdicionar_passageiro.setText("ADICIONAR");
        btnAdicionar_passageiro.setMaximumSize(new java.awt.Dimension(90, 20));
        btnAdicionar_passageiro.setMinimumSize(new java.awt.Dimension(90, 20));
        btnAdicionar_passageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar_passageiroActionPerformed(evt);
            }
        });

        btnExcluir_passageiro.setText("EXCLUIR");
        btnExcluir_passageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir_passageiroActionPerformed(evt);
            }
        });

        btnAtualizar_passageiro.setText("ATUALIZAR");
        btnAtualizar_passageiro.setMaximumSize(new java.awt.Dimension(91, 23));
        btnAtualizar_passageiro.setMinimumSize(new java.awt.Dimension(91, 23));
        btnAtualizar_passageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar_passageiroActionPerformed(evt);
            }
        });

        btnExibir_passageiro.setText("EXIBIR");
        btnExibir_passageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibir_passageiroActionPerformed(evt);
            }
        });

        txtAreaExibir_passageiros.setColumns(20);
        txtAreaExibir_passageiros.setRows(5);
        jScrollPane2.setViewportView(txtAreaExibir_passageiros);

        btnLimpar_passageiro.setText("LIMPAR");
        btnLimpar_passageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_passageiroActionPerformed(evt);
            }
        });

        jLabel1.setText("Passageiro");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\kayla\\Downloads\\logo_menor3.png")); // NOI18N

        javax.swing.GroupLayout tabPassageiroLayout = new javax.swing.GroupLayout(tabPassageiro);
        tabPassageiro.setLayout(tabPassageiroLayout);
        tabPassageiroLayout.setHorizontalGroup(
            tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPassageiroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPassageiroLayout.createSequentialGroup()
                        .addComponent(btnAdicionar_passageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar_passageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir_passageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExibir_passageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabPassageiroLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabPassageiroLayout.createSequentialGroup()
                        .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLimpar_passageiro)
                        .addGroup(tabPassageiroLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(tabPassageiroLayout.createSequentialGroup()
                .addGap(544, 544, 544)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        tabPassageiroLayout.setVerticalGroup(
            tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPassageiroLayout.createSequentialGroup()
                .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabPassageiroLayout.createSequentialGroup()
                        .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtData_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(btnLimpar_passageiro)
                        .addGap(79, 79, 79)
                        .addGroup(tabPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionar_passageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualizar_passageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir_passageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExibir_passageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Passageiro", tabPassageiro);

        jLabel14.setText("Origem:");

        jLabel15.setText("Destino:");

        jLabel16.setText("Data de Partida:");

        jLabel17.setText("Hora de Partida:");

        jLabel18.setText("Classe:");

        txtOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigemActionPerformed(evt);
            }
        });

        comboClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Econômica", "Executiva", "Primeira Classe" }));

        comboHora_partida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "15:00", "21:30", "03:30" }));
        comboHora_partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHora_partidaActionPerformed(evt);
            }
        });

        jLabel24.setText("Preço:");

        btnAtualizar_voo.setText("ATUALIZAR");
        btnAtualizar_voo.setMaximumSize(new java.awt.Dimension(91, 23));
        btnAtualizar_voo.setMinimumSize(new java.awt.Dimension(91, 23));
        btnAtualizar_voo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar_vooActionPerformed(evt);
            }
        });

        btnExcluir_voo.setText("EXCLUIR");
        btnExcluir_voo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir_vooActionPerformed(evt);
            }
        });

        btnExibir_voo.setText("EXIBIR");
        btnExibir_voo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibir_vooActionPerformed(evt);
            }
        });

        btnAdicionar_voo.setText("ADICIONAR");
        btnAdicionar_voo.setMaximumSize(new java.awt.Dimension(90, 20));
        btnAdicionar_voo.setMinimumSize(new java.awt.Dimension(90, 20));
        btnAdicionar_voo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar_vooActionPerformed(evt);
            }
        });

        txtAreaExibir_voo.setColumns(20);
        txtAreaExibir_voo.setRows(5);
        jScrollPane3.setViewportView(txtAreaExibir_voo);

        jLabel2.setText("Voo");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\kayla\\Downloads\\logo_menor3.png")); // NOI18N

        javax.swing.GroupLayout tabVooLayout = new javax.swing.GroupLayout(tabVoo);
        tabVoo.setLayout(tabVooLayout);
        tabVooLayout.setHorizontalGroup(
            tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVooLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabVooLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboHora_partida, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabVooLayout.createSequentialGroup()
                        .addComponent(btnAdicionar_voo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar_voo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir_voo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExibir_voo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabVooLayout.createSequentialGroup()
                        .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabVooLayout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comboClasse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabVooLayout.createSequentialGroup()
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(tabVooLayout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );
        tabVooLayout.setVerticalGroup(
            tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVooLayout.createSequentialGroup()
                .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabVooLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboHora_partida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(tabVooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAtualizar_voo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExcluir_voo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExibir_voo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAdicionar_voo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(tabVooLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Voo", tabVoo);

        jLabel19.setText("Passageiro:");

        jLabel20.setText("Voo:");

        btnAdicionar_reserva.setText("ADICIONAR");
        btnAdicionar_reserva.setMaximumSize(new java.awt.Dimension(90, 20));
        btnAdicionar_reserva.setMinimumSize(new java.awt.Dimension(90, 20));
        btnAdicionar_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar_reservaActionPerformed(evt);
            }
        });

        btnAtualizar_reserva.setText("ATUALIZAR");
        btnAtualizar_reserva.setMaximumSize(new java.awt.Dimension(91, 23));
        btnAtualizar_reserva.setMinimumSize(new java.awt.Dimension(91, 23));
        btnAtualizar_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar_reservaActionPerformed(evt);
            }
        });

        btnExcluir_reserva.setText("EXCLUIR");
        btnExcluir_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir_reservaActionPerformed(evt);
            }
        });

        btnRelatorio_reserva.setText("RELATÓRIO");
        btnRelatorio_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorio_reservaActionPerformed(evt);
            }
        });

        comboPassageiros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboVoos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtAreaRelatorio_reserva.setColumns(20);
        txtAreaRelatorio_reserva.setRows(5);
        jScrollPane4.setViewportView(txtAreaRelatorio_reserva);

        jLabel3.setText("Reserva");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\kayla\\Downloads\\logo_menor3.png")); // NOI18N

        javax.swing.GroupLayout tabReservaLayout = new javax.swing.GroupLayout(tabReserva);
        tabReserva.setLayout(tabReservaLayout);
        tabReservaLayout.setHorizontalGroup(
            tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabReservaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabReservaLayout.createSequentialGroup()
                        .addComponent(btnAdicionar_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRelatorio_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabReservaLayout.createSequentialGroup()
                        .addGroup(tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPassageiros, 0, 287, Short.MAX_VALUE)
                            .addComponent(comboVoos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(449, 449, 449)
                .addComponent(jLabel9))
        );
        tabReservaLayout.setVerticalGroup(
            tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabReservaLayout.createSequentialGroup()
                .addGroup(tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabReservaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabReservaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboVoos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionar_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualizar_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRelatorio_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(78, 78, 78))
            .addGroup(tabReservaLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Reserva", tabReserva);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigemActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnAtualizar_vooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar_vooActionPerformed
        try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               atualizar_voo(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        } 
    }//GEN-LAST:event_btnAtualizar_vooActionPerformed
   
    public void atualizar_voo(Statement stm){
        String origem = txtOrigem.getText();
        String destino = txtDestino.getText();
        excluir_voo(stm);
        adicionar_voo(stm); 
    }
    private void btnExcluir_vooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir_vooActionPerformed
        try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               excluir_voo(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        } 
    }//GEN-LAST:event_btnExcluir_vooActionPerformed
    public void excluir_voo(Statement stm){
        String origem = txtOrigem.getText();
        String destino = txtDestino.getText();
        String sql = "DELETE FROM voo WHERE \"origem\" = '" + origem + "' and destino = '" + destino + "'";
 
        try {
            ResultSet resultado = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Comando SQL falhou");
        }
   
        exibir_voo(stm);
    }
    private void btnExibir_vooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibir_vooActionPerformed
        try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               exibir_voo(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        }   
    }//GEN-LAST:event_btnExibir_vooActionPerformed
    public void exibir_voo(Statement stm){
        StringBuilder str = new StringBuilder();
        String sql = "SELECT id, origem, destino, data_partida, hora_partida, classe, preco FROM voo";
        
        try {
            ResultSet resultado = stm.executeQuery(sql);

            while(resultado.next()) {
                // Formatar a data 
                java.sql.Date data = resultado.getDate("data_partida");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String dataFormatada = dateFormat.format(data);

                // Formatar a hora 
                java.sql.Time hora = resultado.getTime("hora_partida");
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
                String horaFormatada = timeFormat.format(hora);
                
                str.append("Código  de Voo: ").append(resultado.getString("id")).append("\n")
                   .append("Origem: ").append(resultado.getString("origem")).append("\n")
                   .append("Destino: ").append(resultado.getString("destino")).append("\n")
                   .append("Data de Partida: ").append(dataFormatada).append("\n")
                   .append("Hora de Partida: ").append(horaFormatada).append("\n")
                   .append("Classe: ").append(resultado.getString("classe")).append("\n")
                   .append("Preço: R$ ").append(String.format("%.2f", resultado.getDouble("preco")))
                   .append("\n\n");
            }
            txtAreaExibir_voo.setText(str.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar voos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + ex.getMessage());
        }
    }
    private void btnExibir_passageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibir_passageiroActionPerformed
        try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               exibir_passageiros(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        }   
    }//GEN-LAST:event_btnExibir_passageiroActionPerformed

    public void exibir_passageiros(Statement stm){
        String str = "";
        String sql = "select nome, cpf, data_nascimento, email, telefone from passageiro";
        try {   
            ResultSet resultado = stm.executeQuery(sql);
            while(resultado.next()){
                str = str + "Nome: " + resultado.getString("nome") + "\n" +
                        "CPF: " + resultado.getString("cpf") + "\n" +
                        "Data de Nascimento: " + resultado.getString("data_nascimento") + "\n" +
                        "Email: " + resultado.getString("email") + "\n" +
                        "Telefone: " + resultado.getString("telefone") + "\n\n";
            }
            txtAreaExibir_passageiros.setText(str);
        } catch (SQLException ex) {
            System.out.println("Comando SQL falhou");
        }
    }
    
    private void btnExcluir_passageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir_passageiroActionPerformed
         try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               excluir_passageiros(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        } 
    }//GEN-LAST:event_btnExcluir_passageiroActionPerformed
    public void excluir_passageiros(Statement stm){
        String cpf = txtCPF.getText();
        String sql = "DELETE FROM passageiro WHERE \"cpf\" = '" + cpf + "'";
 
        try {
            ResultSet resultado = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Comando SQL falhou");
        }
   
        exibir_passageiros(stm);
    }
    private void btnAtualizar_passageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar_passageiroActionPerformed
        try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               atualizar_passageiro(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        } 
    }//GEN-LAST:event_btnAtualizar_passageiroActionPerformed
    
    public void atualizar_passageiro(Statement stm){
        String cpf = txtCPF.getText();
        excluir_passageiros(stm);
        adicionar_passageiro(stm);    
    }
    
    private void btnAdicionar_passageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar_passageiroActionPerformed
        try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               adicionar_passageiro(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        } 
    }//GEN-LAST:event_btnAdicionar_passageiroActionPerformed
    
    public void adicionar_passageiro(Statement stm){
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String data_nascimento = txtData_nascimento.getText();
        String email = txtEmail.getText();
        String telefone = txtTelefone.getText();

        String sql = "INSERT INTO passageiro(nome, cpf, data_nascimento, email, telefone) VALUES('" + nome + "' , '" + cpf + "', '" + data_nascimento + "', '" + email + "', '" + telefone + "')";
        try {
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Comando SQL falhou");
        }
        JOptionPane.showMessageDialog(this, "Passageiro cadastrado com sucesso!");
        carregarPassageirosNoComboBox();
        exibir_passageiros(stm);
    }
    
    private void btnAdicionar_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar_reservaActionPerformed
        try {
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
            "postgres", "kay30lane090");
        if(conexao != null) {
            System.out.println("Banco de dados conectado com sucesso!");
            Statement stm = conexao.createStatement();
            adicionar_reserva(stm);
            stm.close();
            conexao.close();
        }
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver do banco de dados não localizado");
    } catch (SQLException ex) {
        System.out.println("Conexão com o Driver falhou");
    }
    }//GEN-LAST:event_btnAdicionar_reservaActionPerformed
    
    public void adicionar_reserva(Statement stm){
    try {
        // 1. Validar seleções nos ComboBoxes
        if (comboPassageiros.getSelectedIndex() <= 0 || 
            comboPassageiros.getSelectedItem().equals("Selecione um passageiro")) {
            JOptionPane.showMessageDialog(null, 
                "Selecione um passageiro válido", 
                "Aviso", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (comboVoos.getSelectedIndex() <= 0 || 
            comboVoos.getSelectedItem().equals("Selecione um voo")) {
            JOptionPane.showMessageDialog(null, 
                "Selecione um voo válido", 
                "Aviso", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // 2. Obter IDs selecionados
        String nomePassageiro = (String) comboPassageiros.getSelectedItem();
        String vooSelecionado = (String) comboVoos.getSelectedItem();
        
        // Extrai ID do voo (formato "ID: Destino - Origem")
        int idVoo = Integer.parseInt(vooSelecionado.split(":")[0].trim());
        
        // 3. Buscar ID do passageiro
        String sqlPassageiro = "SELECT id FROM passageiro WHERE nome = '" + nomePassageiro + "'";
        ResultSet rs = stm.executeQuery(sqlPassageiro);
        
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, 
                "Passageiro não encontrado no sistema", 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int idPassageiro = rs.getInt("id");
        
        // 4. Inserir a reserva no banco de dados
        String sqlInsert = "INSERT INTO reserva(id_passageiro, id_voo) VALUES (" + 
                          idPassageiro + ", " + idVoo + ")";
        
        int linhasAfetadas = stm.executeUpdate(sqlInsert);
        
        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, 
                "Reserva cadastrada com sucesso!", 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Limpar seleções após cadastro
            comboPassageiros.setSelectedIndex(0);
            comboVoos.setSelectedIndex(0);
        }
        
    } catch (SQLException ex) {
        if (ex.getMessage().contains("violates foreign key constraint")) {
            JOptionPane.showMessageDialog(null, 
                "Erro: Dados inconsistentes. Verifique se o passageiro e voo existem.", 
                "Erro de Integridade", 
                JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Erro ao cadastrar reserva: " + ex.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
        ex.printStackTrace();
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, 
            "Formato de voo inválido", 
            "Erro", 
            JOptionPane.ERROR_MESSAGE);
    }
    relatorio_reserva(stm);
}
    
    private void carregarPassageirosNoComboBox() {
        try {
            // Limpa o ComboBox
            comboPassageiros.removeAllItems();

            // Adiciona item padrão
            comboPassageiros.addItem("Selecione um passageiro");

            // Conecta ao banco (
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                "postgres", "kay30lane090");

            // Busca os passageiros ordenados por nome
            String sql = "SELECT nome FROM passageiro ORDER BY nome";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Adiciona cada passageiro no ComboBox
            while(rs.next()) {
                comboPassageiros.addItem(rs.getString("nome"));
            }

            // Fecha os recursos
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao carregar passageiros: " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public final void carregarVoosNoComboBox() {
    try {
        // Limpa o ComboBox
        comboVoos.removeAllItems();
        
        // Adiciona item padrão
        comboVoos.addItem("Selecione um voo");
        
        // Conecta ao banco de dados
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
            "postgres", "kay30lane090");
        
        // Consulta SQL para obter os voos
        String sql = "SELECT id, origem, destino FROM voo ORDER BY id";
        Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        // Adiciona cada voo formatado no ComboBox
        while(rs.next()) {
            String itemVoo = String.format("%d: %s - %s", 
                rs.getInt("id"),
                rs.getString("destino"),
                rs.getString("origem"));
                
            comboVoos.addItem(itemVoo);
        }
        
        // Fecha os recursos
        rs.close();
        stmt.close();
        conexao.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
            "Erro ao carregar voos: " + ex.getMessage(),
            "Erro",
            JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void btnAtualizar_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar_reservaActionPerformed
    try {
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
            "postgres", "kay30lane090");
        if(conexao != null) {
            System.out.println("Banco de dados conectado com sucesso!");
            Statement stm = conexao.createStatement();
            atualizar_reserva(stm);
            stm.close();
            conexao.close();
        }
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver do banco de dados não localizado");
    } catch (SQLException ex) {
        System.out.println("Conexão com o Driver falhou");
    }
    }//GEN-LAST:event_btnAtualizar_reservaActionPerformed
    
    public void atualizar_reserva(Statement stm){
    try {
        // 1. Verificar se uma reserva está selecionada
        if (comboPassageiros.getSelectedIndex() <= 0 || comboVoos.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, 
                "Selecione um passageiro e um voo válidos", 
                "Aviso", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. Obter o ID da reserva a ser atualizada
        String idReservaStr = JOptionPane.showInputDialog(null, 
            "Informe o ID da reserva que deseja atualizar:", 
            "Atualizar Reserva", 
            JOptionPane.QUESTION_MESSAGE);
        
        if (idReservaStr == null || idReservaStr.trim().isEmpty()) {
            return; // Usuário cancelou
        }

        int idReserva;
        try {
            idReserva = Integer.parseInt(idReservaStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, 
                "ID da reserva inválido", 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 3. Obter novos dados (passageiro e voo selecionados nos ComboBoxes)
        int novoIdPassageiro = getIdPassageiroSelecionado(stm.getConnection());
        int novoIdVoo = getIdVooSelecionado();

        if (novoIdPassageiro == -1 || novoIdVoo == -1) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao obter dados para atualização", 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 4. Confirmar a atualização
        int confirmacao = JOptionPane.showConfirmDialog(null,
            "Deseja realmente atualizar a reserva ID " + idReserva + "?",
            "Confirmar Atualização",
            JOptionPane.YES_NO_OPTION);

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }

        // 5. Executar a atualização no banco de dados
        String sql = "UPDATE reserva SET id_passageiro = " + novoIdPassageiro + 
                     ", id_voo = " + novoIdVoo + 
                     " WHERE id = " + idReserva;
        
        int linhasAfetadas = stm.executeUpdate(sql);

        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, 
                "Reserva atualizada com sucesso!", 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Atualizar a exibição se necessário
            relatorio_reserva(stm);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Nenhuma reserva foi atualizada. Verifique o ID informado.", 
                "Aviso", 
                JOptionPane.WARNING_MESSAGE);
        }

    } catch (SQLException ex) {
        if (ex.getMessage().contains("violates foreign key constraint")) {
            JOptionPane.showMessageDialog(null, 
                "Erro: Passageiro ou voo não encontrado no sistema", 
                "Erro de Integridade", 
                JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Erro ao atualizar reserva: " + ex.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
        ex.printStackTrace();
    }
    relatorio_reserva(stm);
}

// Métodos auxiliares 
private int getIdPassageiroSelecionado(Connection conexao) throws SQLException {
    String nomePassageiro = (String) comboPassageiros.getSelectedItem();
    if (nomePassageiro == null || nomePassageiro.equals("Selecione um passageiro")) {
        return -1;
    }
    
    PreparedStatement ps = conexao.prepareStatement("SELECT id FROM passageiro WHERE nome = ?");
    ps.setString(1, nomePassageiro);
    
    ResultSet rs = ps.executeQuery();
    if (rs.next()) {
        return rs.getInt("id");
    }
    return -1;
}

private int getIdVooSelecionado() {
    String itemSelecionado = (String) comboVoos.getSelectedItem();
    if (itemSelecionado == null || itemSelecionado.equals("Selecione um voo")) {
        return -1;
    }
    
    try {
        return Integer.parseInt(itemSelecionado.split(":")[0].trim());
    } catch (NumberFormatException ex) {
        ex.printStackTrace();
        return -1;
    }
}
    
    private void btnExcluir_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir_reservaActionPerformed
        try {
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
            "postgres", "kay30lane090");
        if(conexao != null) {
            System.out.println("Banco de dados conectado com sucesso!");
            Statement stm = conexao.createStatement();
            excluir_reserva(stm);
            stm.close();
            conexao.close();
        }
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver do banco de dados não localizado");
    } catch (SQLException ex) {
        System.out.println("Conexão com o Driver falhou");
    }
    }//GEN-LAST:event_btnExcluir_reservaActionPerformed

    public void excluir_reserva(Statement stm){
        try {
        // 1. Solicitar o ID da reserva a ser excluída
        String idReservaStr = JOptionPane.showInputDialog(null,
            "Informe o ID da reserva que deseja excluir:",
            "Excluir Reserva",
            JOptionPane.QUESTION_MESSAGE);
        
        if (idReservaStr == null || idReservaStr.trim().isEmpty()) {
            return; // Usuário cancelou a operação
        }

        int idReserva;
        try {
            idReserva = Integer.parseInt(idReservaStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                "ID da reserva inválido. Informe apenas números.",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 2. Verificar se a reserva existe
        String sqlVerifica = "SELECT r.id, p.nome, v.origem, v.destino " +
                           "FROM reserva r " +
                           "JOIN passageiro p ON r.id_passageiro = p.id " +
                           "JOIN voo v ON r.id_voo = v.id " +
                           "WHERE r.id = " + idReserva;
        
        ResultSet rs = stm.executeQuery(sqlVerifica);
        
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null,
                "Reserva não encontrada com o ID informado.",
                "Aviso",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 3. Mostrar informações da reserva e confirmar exclusão
        String reservaInfo = "ID: " + rs.getInt("id") + "\n" +
                           "Passageiro: " + rs.getString("nome") + "\n" +
                           "Voo: " + rs.getString("origem") + " - " + rs.getString("destino");
        
        int confirmacao = JOptionPane.showConfirmDialog(null,
            "Deseja realmente excluir esta reserva?\n\n" + reservaInfo,
            "Confirmar Exclusão",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }

        // 4. Executar a exclusão
        String sqlExclui = "DELETE FROM reserva WHERE id = " + idReserva;
        int linhasAfetadas = stm.executeUpdate(sqlExclui);

        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null,
                "Reserva excluída com sucesso!",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
            
            // Atualizar o relatório se necessário
            relatorio_reserva(stm);
        } else {
            JOptionPane.showMessageDialog(null,
                "Nenhuma reserva foi excluída.",
                "Aviso",
                JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,
            "Erro ao excluir reserva: " + ex.getMessage(),
            "Erro",
            JOptionPane.ERROR_MESSAGE);
        System.out.println("Erro SQL: " + ex.getMessage());
    }
        
    }
           
    private void btnRelatorio_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorio_reservaActionPerformed
        try {
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
            "postgres", "kay30lane090"); 
        if(conexao != null) {
            System.out.println("Banco de dados conectado com sucesso!");
            Statement stm = conexao.createStatement();
            relatorio_reserva(stm);
            stm.close();
            conexao.close();
        }
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver do banco de dados não localizado");
    } catch (SQLException ex) {
        System.out.println("Conexão com o Driver falhou");
    }
    }//GEN-LAST:event_btnRelatorio_reservaActionPerformed
    
    public void relatorio_reserva(Statement stm) {
    try {
        // Limpa o conteúdo atual do JTextArea
        txtAreaRelatorio_reserva.setText("");
        
        // Consulta SQL para obter todas as reservas com informações relacionadas
        String sql = "SELECT r.id as reserva_id, " +
                     "v.id as voo_id, v.origem, v.destino, v.data_partida, v.hora_partida, " +
                     "p.nome as passageiro, p.cpf " +
                     "FROM reserva r " +
                     "JOIN voo v ON r.id_voo = v.id " +
                     "JOIN passageiro p ON r.id_passageiro = p.id " +
                     "ORDER BY r.id";
        
        ResultSet resultado = stm.executeQuery(sql);
        
        // Formatação de data e hora
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        
        // Variável para contar as reservas
        int totalReservas = 0;
        
        while (resultado.next()) {
            // Formata a data e hora
            String dataFormatada = dateFormat.format(resultado.getDate("data_partida"));
            String horaFormatada = timeFormat.format(resultado.getTime("hora_partida"));
            
            // Constrói cada entrada do relatório no formato solicitado
            String reservaInfo = "Reserva " + resultado.getInt("reserva_id") + "\n" +
                               "Código de Voo: " + resultado.getInt("voo_id") + "-" +
                               resultado.getString("origem") + "-" +
                               resultado.getString("destino") + "\n" +
                               "Data de Partida: " + dataFormatada + "\n" +
                               "Hora de Partida: " + horaFormatada + "\n" +
                               "Passageiro: " + resultado.getString("passageiro") + "\n" +
                               "CPF: " + resultado.getString("cpf") + "\n\n";
            
            // Adiciona ao JTextArea
            txtAreaRelatorio_reserva.append(reservaInfo);
            totalReservas++;
        }
        
        // Adiciona o total de reservas no final
        txtAreaRelatorio_reserva.append("\nTotal de reservas: " + totalReservas);
        
        // Se não houver reservas, exibe mensagem
        if (totalReservas == 0) {
            txtAreaRelatorio_reserva.setText("Nenhuma reserva cadastrada.");
        }
        
    } catch (SQLException ex) {
        txtAreaRelatorio_reserva.setText("Erro ao gerar relatório: " + ex.getMessage());
        System.out.println("Comando SQL falhou: " + ex.getMessage());
    }
}
    
    private void btnAdicionar_vooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar_vooActionPerformed
        try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               adicionar_voo(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        } 
    }//GEN-LAST:event_btnAdicionar_vooActionPerformed

    public void adicionar_voo(Statement stm){
        try {
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
            "postgres", "kay30lane090");
        if (conexao != null) {
            String sql = "INSERT INTO voo(origem, destino, data_partida, hora_partida, classe, preco) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conexao.prepareStatement(sql);

            // Pegando e validando os valores dos componentes
            String origem = txtOrigem.getText();
            if (origem.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe a origem do voo");
                return;
            }

            String destino = txtDestino.getText();
            if (destino.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o destino do voo");
                return;
            }

            // Conversão da data do JCalendar
            if (jCalendar.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Selecione uma data de partida");
                return;
            }
            java.util.Date dataUtil = jCalendar.getDate();
            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

            // Hora de partida
            if (comboHora_partida.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Selecione um horário de partida");
                return;
            }
            String horaPartida = comboHora_partida.getSelectedItem().toString();
            // Garante o formato HH:mm:ss
            if (horaPartida.length() == 5) {
                horaPartida += ":00";
            }

            // Classe
            if (comboClasse.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Selecione uma classe");
                return;
            }
            String classe = comboClasse.getSelectedItem().toString();

            // Preço
            double preco;
            try {
                preco = Double.parseDouble(txtPreco.getText());
                if (preco <= 0) {
                    JOptionPane.showMessageDialog(null, "O preço deve ser maior que zero");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Informe um preço válido");
                return;
            }

            // Setando os valores no PreparedStatement
            pst.setString(1, origem);
            pst.setString(2, destino);
            pst.setDate(3, dataSql);  
            pst.setTime(4, java.sql.Time.valueOf(horaPartida));
            pst.setString(5, classe);
            pst.setDouble(6, preco);
            

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Voo adicionado com sucesso!");
            
            pst.close();
            conexao.close();
        }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar voo: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + ex.getMessage());
        }
    exibir_voo(stm);
    carregarVoosNoComboBox();
    }
    
    private void comboHora_partidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHora_partidaActionPerformed
        String hora_partida = comboHora_partida.getSelectedItem().toString();
    }//GEN-LAST:event_comboHora_partidaActionPerformed

    private void btnLimpar_passageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_passageiroActionPerformed
        try {
            Class.forName("org.postgresql.Driver"); //carrega o Driver JDBC
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gerenciamento_aeroporto",
                    "postgres", "kay30lane090");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               limpar_passageiros(stm);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            System.out.println("Conexão com o Driver falhou");
        } 
    }//GEN-LAST:event_btnLimpar_passageiroActionPerformed
    
    public void limpar_passageiros(Statement stm){
        txtNome.setText("");
        txtCPF.setText("");
        txtData_nascimento.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AeroportoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton btnAdicionar_passageiro;
    private javax.swing.JButton btnAdicionar_reserva;
    private javax.swing.JButton btnAdicionar_voo;
    private javax.swing.JButton btnAtualizar_passageiro;
    private javax.swing.JButton btnAtualizar_reserva;
    private javax.swing.JButton btnAtualizar_voo;
    private javax.swing.JButton btnExcluir_passageiro;
    private javax.swing.JButton btnExcluir_reserva;
    private javax.swing.JButton btnExcluir_voo;
    private javax.swing.JButton btnExibir_passageiro;
    private javax.swing.JButton btnExibir_voo;
    private javax.swing.JButton btnLimpar_passageiro;
    private javax.swing.JButton btnRelatorio_reserva;
    private javax.swing.JComboBox<String> comboClasse;
    private javax.swing.JComboBox<String> comboHora_partida;
    private javax.swing.JComboBox<String> comboPassageiros;
    private javax.swing.JComboBox<String> comboVoos;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel tabPassageiro;
    private javax.swing.JPanel tabReserva;
    private javax.swing.JPanel tabVoo;
    private javax.swing.JTextArea txtAreaExibir_passageiros;
    private javax.swing.JTextArea txtAreaExibir_voo;
    private javax.swing.JTextArea txtAreaRelatorio_reserva;
    private java.awt.TextField txtCPF;
    private java.awt.TextField txtData_nascimento;
    private java.awt.TextField txtDestino;
    private java.awt.TextField txtEmail;
    private java.awt.TextField txtNome;
    private java.awt.TextField txtOrigem;
    private java.awt.TextField txtPreco;
    private java.awt.TextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
