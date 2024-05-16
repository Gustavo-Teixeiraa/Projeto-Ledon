public class Painel extends javax.swing.JFrame {
    public Painel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeConcessionaria = new javax.swing.JLabel();
        BotaoCarro = new javax.swing.JButton();
        BotaoMoto = new javax.swing.JButton();
        BotaoCaminhao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ano = new javax.swing.JTextField();
        BotaoFinalizarCarro = new javax.swing.JButton();
        BotaoFinalizarMoto = new javax.swing.JButton();
        BotaoFinalizarCaminhao = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BotaoRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeConcessionaria.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nomeConcessionaria.setText("CONCESSIONARIA SENA");

        BotaoCarro.setText("Carros");
        BotaoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCarroActionPerformed(evt);
            }
        });

        BotaoMoto.setText("Motos");
        BotaoMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMotoActionPerformed(evt);
            }
        });

        BotaoCaminhao.setText("Caminhões");
        BotaoCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCaminhaoActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ADICIONAR AUTOMOVEIS");

        jLabel4.setText("Marca:");

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        jLabel5.setText("Modelo:");

        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor:");

        Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });

        jLabel7.setText("Ano:");

        Ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoActionPerformed(evt);
            }
        });

        BotaoFinalizarCarro.setText("Carros");
        BotaoFinalizarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarCarroActionPerformed(evt);
            }
        });

        BotaoFinalizarMoto.setText("Motos");
        BotaoFinalizarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarMotoActionPerformed(evt);
            }
        });

        BotaoFinalizarCaminhao.setText("Caminhões");
        BotaoFinalizarCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarCaminhaoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Finalizar Cadastro do Automovel:");

        BotaoRemover.setText("Remover");
        BotaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoCarro)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(BotaoMoto)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(BotaoCaminhao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(BotaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomeConcessionaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoFinalizarCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoFinalizarMoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoFinalizarCaminhao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ano, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Valor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Marca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modelo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeConcessionaria)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoFinalizarCarro)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoFinalizarMoto)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoFinalizarCaminhao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoCarro)
                            .addComponent(BotaoMoto)
                            .addComponent(BotaoCaminhao)
                            .addComponent(BotaoRemover))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCarroActionPerformed

    private void BotaoMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMotoActionPerformed

    private void BotaoCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCaminhaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCaminhaoActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed

    private void ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeloActionPerformed

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorActionPerformed

    private void AnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnoActionPerformed

    private void BotaoFinalizarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoFinalizarCarroActionPerformed

    private void BotaoFinalizarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoFinalizarMotoActionPerformed

    private void BotaoFinalizarCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarCaminhaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoFinalizarCaminhaoActionPerformed

    private void BotaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ano;
    private javax.swing.JButton BotaoCaminhao;
    private javax.swing.JButton BotaoCarro;
    private javax.swing.JButton BotaoFinalizarCaminhao;
    private javax.swing.JButton BotaoFinalizarCarro;
    private javax.swing.JButton BotaoFinalizarMoto;
    private javax.swing.JButton BotaoMoto;
    private javax.swing.JButton BotaoRemover;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField Valor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nomeConcessionaria;
    // End of variables declaration//GEN-END:variables
}
