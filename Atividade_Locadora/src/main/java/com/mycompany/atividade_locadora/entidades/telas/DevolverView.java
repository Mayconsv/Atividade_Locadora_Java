
package com.mycompany.atividade_locadora.entidades.telas;
import javax.swing.JOptionPane;

public class DevolverView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DevolverView.class.getName());
    
public DevolverView() {
    initComponents();
    
    setSize(570, 550);
    setLocationRelativeTo(null);
    
    // Limpa os itens padrão do NetBeans
    Alugados.removeAllItems(); // Substitua "jComboBoxDevolucao" pelo nome exato do seu JComboBox na tela de devolução
    
    // Preenche com os carros que realmente foram alugados
    for (String c : Home.carrosAlugados) {
    Alugados.addItem(c);
    }
    
    // Máscara da data de devolução...
    try {
        javax.swing.text.MaskFormatter mascaraData2 = new javax.swing.text.MaskFormatter("##/##/####");
        mascaraData2.install(Data_Devolucao);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListarCarros = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        CADASTRO = new javax.swing.JLabel();
        Voltar1 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Alugados = new javax.swing.JComboBox<>();
        CADASTRO1 = new javax.swing.JLabel();
        ListarCarros1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        Data_Devolucao = new javax.swing.JFormattedTextField();

        ListarCarros.setBackground(new java.awt.Color(204, 204, 204));
        ListarCarros.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ListarCarros.setText("Nada consta.");
        ListarCarros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CADASTRO.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CADASTRO.setText("DEVOLVER");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(CADASTRO)
                .addGap(212, 212, 212))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(CADASTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Voltar1.setBackground(new java.awt.Color(204, 204, 255));
        Voltar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Voltar1.setText("VOLTAR");
        Voltar1.addActionListener(this::Voltar1ActionPerformed);

        Exit.setBackground(new java.awt.Color(204, 204, 255));
        Exit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Exit.setText("SAÍR");
        Exit.addActionListener(this::ExitActionPerformed);

        Alugados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CADASTRO1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CADASTRO1.setText("HISTÓRICO DE DEVOLVIDOS");

        ListarCarros1.setBackground(new java.awt.Color(204, 204, 204));
        ListarCarros1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ListarCarros1.setText("Nada consta.");
        ListarCarros1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel8.setText("DATA DA DEVOLUÇÃO:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel9.setText("HISTÓRICO DE ALUGADOS :");

        Confirmar.setBackground(new java.awt.Color(204, 204, 255));
        Confirmar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Confirmar.setText("CONFIRMAR");
        Confirmar.addActionListener(this::ConfirmarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(Voltar1)
                                .addGap(46, 46, 46)
                                .addComponent(Exit))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Alugados, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 151, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListarCarros1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Data_Devolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Confirmar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(CADASTRO1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alugados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Data_Devolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirmar))
                .addGap(18, 18, 18)
                .addComponent(CADASTRO1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListarCarros1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voltar1)
                    .addComponent(Exit))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar1ActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_Voltar1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        try {
        String dataDevolucao = Data_Devolucao.getText(); // Nome do seu campo de data
        String carroDevolvido = Alugados.getSelectedItem().toString();
        
        if (dataDevolucao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe a data de devolução!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Monta o histórico de veículos devolvidos
        String historicoAtual = ListarCarros1.getText(); // Nome do seu JLabel de dados
        if (historicoAtual.contains("Nada consta")) {
            historicoAtual = ""; // Limpa o texto padrão inicial
        }
        
        String novoHistorico = "<html><body>" +
                               historicoAtual +
                               "<br><b>--- DEVOLUÇÃO REGISTRADA ---</b><br>" +
                               "<b>Veículo:</b> " + carroDevolvido + "<br>" +
                               "<b>Data de Entrega:</b> " + dataDevolucao + "<br>" +
                               "<i>Status: Devolvido com sucesso!</i><br>" +
                               "</body></html>";
                               
        // Atualiza a área de histórico na tela
        ListarCarros1.setText(novoHistorico);
        
        // Remove o carro da lista de devolução pendente
        Alugados.removeItemAt(Alugados.getSelectedIndex());
        
        JOptionPane.showMessageDialog(this, "Devolução registada com sucesso!");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao processar a devolução.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_ConfirmarActionPerformed
    public void preencherCarrosAlugados(String carroAlugado) {
    // Adiciona o carro que acabou de ser alugado na lista de devolução
    Alugados.addItem(carroAlugado);
    // Remove da lista de alugados ativos
    Home.carrosAlugados.remove(Alugados.getSelectedItem().toString());

// Remove do JComboBox da tela
    Alugados.removeItemAt(Alugados.getSelectedIndex());
}
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new DevolverView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Alugados;
    private javax.swing.JLabel CADASTRO;
    private javax.swing.JLabel CADASTRO1;
    private javax.swing.JButton Confirmar;
    private javax.swing.JFormattedTextField Data_Devolucao;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel ListarCarros;
    private javax.swing.JLabel ListarCarros1;
    private javax.swing.JButton Voltar1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
