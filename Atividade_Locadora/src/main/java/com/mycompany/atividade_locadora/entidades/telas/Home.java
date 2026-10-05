package com.mycompany.atividade_locadora.entidades.telas;

import com.mycompany.atividade_locadora.entidades.Carro;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {

    ArrayList<Carro> carros = new ArrayList<>();
    
    public static ArrayList<String> carrosAlugados = new ArrayList<>();
    

    public Home() {
        initComponents(); // Tem de ser sempre a primeira linha!
        
        // Centraliza a tela Home no meio do monitor
        setLocationRelativeTo(null);
        
        // Configura as máscaras da Placa e do Ano dentro do construtor
        try {
            javax.swing.text.MaskFormatter mascaraPlaca = new javax.swing.text.MaskFormatter("UUU-####");
            mascaraPlaca.install(TXTPlaca);
            
            javax.swing.text.MaskFormatter mascaraAno = new javax.swing.text.MaskFormatter("####");
            mascaraAno.install(TXTAno);
            
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
    
    // O restante do seu código continua aqui...

@SuppressWarnings("unchecked")
                                 
    public static void run() {

        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TXTModelo = new javax.swing.JTextPane();
        CADASTRAR = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        CADASTRO = new javax.swing.JLabel();
        CADASTRO1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Portas2 = new javax.swing.JRadioButton();
        Portas4 = new javax.swing.JRadioButton();
        ListarCarros = new javax.swing.JLabel();
        Alugar = new javax.swing.JButton();
        Devolver = new javax.swing.JButton();
        TXTPlaca = new javax.swing.JFormattedTextField();
        TXTAno = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel7.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(this::jRadioButton3ActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel6.setText("ANO:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel8.setText("PLACA:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel9.setText("MODELO:");

        TXTModelo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setViewportView(TXTModelo);

        CADASTRAR.setBackground(new java.awt.Color(204, 204, 255));
        CADASTRAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CADASTRAR.setText("CADASTRAR");
        CADASTRAR.addActionListener(this::CADASTRARActionPerformed);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CADASTRO.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CADASTRO.setText("CADASTRO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CADASTRO)
                .addGap(192, 192, 192))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        CADASTRO1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CADASTRO1.setText("DADOS");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel10.setText("QUANTIDADE DE PORTAS:");

        Portas2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Portas2.setText("2 PORTAS");

        Portas4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Portas4.setText("4 PORTAS");

        ListarCarros.setBackground(new java.awt.Color(204, 204, 204));
        ListarCarros.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ListarCarros.setText("Nada consta.");
        ListarCarros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Alugar.setBackground(new java.awt.Color(204, 204, 255));
        Alugar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Alugar.setText("ALUGAR");
        Alugar.addActionListener(this::AlugarActionPerformed);

        Devolver.setBackground(new java.awt.Color(204, 204, 255));
        Devolver.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Devolver.setText("DEVOLVER");
        Devolver.addActionListener(this::DevolverActionPerformed);

        TXTAno.addActionListener(this::TXTAnoActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListarCarros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CADASTRO1)
                .addGap(216, 216, 216))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CADASTRAR)
                        .addGap(99, 99, 99)
                        .addComponent(Alugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(Devolver))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Portas2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Portas4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(TXTPlaca)
            .addComponent(TXTAno)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Portas2)
                    .addComponent(Portas4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CADASTRO1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListarCarros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CADASTRAR)
                    .addComponent(Alugar)
                    .addComponent(Devolver))
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRARActionPerformed
try {
        // Validação básica para evitar campos vazios
        if (TXTPlaca.getText().isEmpty() || TXTModelo.getText().isEmpty() || TXTAno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String placa = TXTPlaca.getText();
        String modelo = TXTModelo.getText();
        int ano = Integer.parseInt(TXTAno.getText().trim());
        int portas = 2;
        
        if (Portas2.isSelected()) {
            portas = 2;
        } else if (Portas4.isSelected()) {
            portas = 4;
        }
        
        // Adiciona o carro na lista
        carros.add(new Carro(placa, modelo, ano, portas));
        JOptionPane.showMessageDialog(rootPane, "Carro incluído com sucesso!");
        
        // Atualiza o texto na área "Nada consta"
        StringBuilder listar = new StringBuilder("<html><body>");
        for (Carro c : carros) {
            listar.append(c.toString().replaceAll("\n", "<br>")).append("<br><br>");
        }
        listar.append("</body></html>");
        ListarCarros.setText(listar.toString());
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "O campo ANO deve conter apenas números inteiros!", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_CADASTRARActionPerformed

    private void AlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlugarActionPerformed
    AluguelView telaAluguel = new AluguelView();
    telaAluguel.preencherCarros(carros); // Envia a lista para a outra tela
    telaAluguel.setVisible(true);
    }//GEN-LAST:event_AlugarActionPerformed

    private void DevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolverActionPerformed
    DevolverView telaDevolver = new DevolverView();
    telaDevolver.setVisible(true);
    this.setVisible(false); // Apenas oculta a tela atual em vez de dar dispose
    }//GEN-LAST:event_DevolverActionPerformed

    private void TXTAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAnoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alugar;
    private javax.swing.JButton CADASTRAR;
    private javax.swing.JLabel CADASTRO;
    private javax.swing.JLabel CADASTRO1;
    private javax.swing.JButton Devolver;
    private javax.swing.JLabel ListarCarros;
    private javax.swing.JRadioButton Portas2;
    private javax.swing.JRadioButton Portas4;
    private javax.swing.JFormattedTextField TXTAno;
    private javax.swing.JTextPane TXTModelo;
    private javax.swing.JFormattedTextField TXTPlaca;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
              
}
