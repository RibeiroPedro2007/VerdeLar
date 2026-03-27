/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.login.view;
import br.login.dao.LoginDAO;
import br.login.dao.Sessao;
import br.login.view.NívelView;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author Home
 */
public class LoginView extends javax.swing.JFrame {

    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginView.class.getName());

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
    
    /*-------------
    Dimensionando
    --------------*/
    this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    
    jPanel2.setPreferredSize(new java.awt.Dimension(1100, 650)); 
    
    java.awt.Toolkit tk = java.awt.Toolkit.getDefaultToolkit();
    double larguraReal = tk.getScreenSize().getWidth();
    double alturaReal = tk.getScreenSize().getHeight();
    
    double larguraDesign = 1366.0;
    double alturaDesign = 768.0;
    
    double ratioX = larguraReal / larguraDesign;
    double ratioY = alturaReal / alturaDesign;
    double ratio = Math.min(ratioX, ratioY);
    
    aplicarEscala(this.getContentPane(), ratio);
    
    this.getContentPane().setLayout(new java.awt.GridBagLayout());
    this.getContentPane().setBackground(new java.awt.Color(30, 60, 42));
    this.getContentPane().add(jPanel2); 
 
    //Arruma os botões para simples
    javax.swing.JButton[] btns = {btnOlho, btnEsqueciSenha, btnCadastro, btnEntrar};
    for (javax.swing.JButton btn : btns) {
        btn.setUI(new javax.swing.plaf.basic.BasicButtonUI());
    }
    
    //Aplicando a nova versão    
    jPanelCenter.setLayout(new java.awt.GridBagLayout());
    java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
    
    gbc.gridx = 0; 
    gbc.gridy = 0; 
    gbc.weightx = 1.0; 
    gbc.insets = new java.awt.Insets(5, 50, 5, 50); // Margens (Cima, Esq, Baixo, Dir)
    gbc.fill = java.awt.GridBagConstraints.HORIZONTAL; // Esticar componentes horizontalmente
    gbc.anchor = java.awt.GridBagConstraints.CENTER; // Ancorar no centro

    //Adicionando os itens da tela
    
    //"Login"
    gbc.insets = new java.awt.Insets(0, 0, 0, 80);
    jPanelCenter.add(jPanel1, gbc); 
    gbc.gridy++; // Vai para a próxima linha
    
    //Espaço após o título
    gbc.insets = new java.awt.Insets(40, 80, 5, 80);
    jPanelCenter.add(jLabel1, gbc); //"E-mail"
    gbc.insets = new java.awt.Insets(5, 80, 5, 80); // Volta margem normal
    gbc.gridy++;
    
    jPanelCenter.add(txtEmail, gbc); // Campo Texto
    gbc.gridy++;
    
    jPanelCenter.add(jSeparator1, gbc); // Linha
    gbc.gridy++;
    
    //Espaço entre campos
    gbc.insets = new java.awt.Insets(20, 80, 5, 80);
    jPanelCenter.add(jLabel2, gbc); // "Senha"
    gbc.insets = new java.awt.Insets(5, 80, 5, 80);
    gbc.gridy++;
    
    
    //Painel temporário pra deixar o olho e o campo juntos
    javax.swing.JPanel painelSenha = new javax.swing.JPanel(new java.awt.BorderLayout());
    painelSenha.setBackground(java.awt.Color.WHITE); // Fundo branco igual ao painel
    painelSenha.add(txtSenha, java.awt.BorderLayout.CENTER);
    painelSenha.add(btnOlho, java.awt.BorderLayout.EAST); // Olho na direita
    
    jPanelCenter.add(painelSenha, gbc);
    gbc.gridy++;
    
    jPanelCenter.add(jSeparator3, gbc); // Linha da senha
    gbc.gridy++;
    
    //botões
    gbc.fill = java.awt.GridBagConstraints.NONE; // Não esticar os botões
    gbc.insets = new java.awt.Insets(50, 50, 10, 50); // Margem maior em cima
    
    //Forçar tamanho do botão Entrar para não ficar achatado
    btnEntrar.setPreferredSize(new java.awt.Dimension(150, 45));
    jPanelCenter.add(btnEntrar, gbc);
    gbc.gridy++;
    
    gbc.insets = new java.awt.Insets(10, 50, 5, 50);
    jPanelCenter.add(btnEsqueciSenha, gbc);
    gbc.gridy++;
    
     gbc.insets = new java.awt.Insets(0, 0, 120, 0);
    jPanelCenter.add(btnCadastro, gbc); // Label "Senha"
    
    jPanelCenter.add(btnCadastro, gbc);
    
    //Atualiza as redefinições
    jPanelCenter.revalidate();
    jPanelCenter.repaint();
        
    
    //Panel Logo
    jPanelSide.setLayout(new java.awt.GridBagLayout());
    java.awt.GridBagConstraints gbcSide = new java.awt.GridBagConstraints();
    gbcSide.gridx = 0;
    gbcSide.gridy = 0;
    
    //"VerdeLar"
    gbcSide.insets = new java.awt.Insets(0, -200, 30, 0); 
    jPanelSide.add(jLabel4, gbcSide);
    
    //Logo
    gbcSide.gridy++; // Vai para a linha de baixo
    gbcSide.insets = new java.awt.Insets(0, -200, 0, 0); // Remove a margem
    jPanelSide.add(jLabel3, gbcSide);
    
    // Atualiza as redefinições
    jPanelSide.revalidate();
    jPanelSide.repaint();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelSide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelCenter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnOlho = new javax.swing.JButton();
        btnEsqueciSenha = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(30, 60, 42));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanelSide.setBackground(new java.awt.Color(30, 60, 42));
        jPanelSide.setPreferredSize(new java.awt.Dimension(600, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 70)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VerdeLar");

        javax.swing.GroupLayout jPanelSideLayout = new javax.swing.GroupLayout(jPanelSide);
        jPanelSide.setLayout(jPanelSideLayout);
        jPanelSideLayout.setHorizontalGroup(
            jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanelSideLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanelSideLayout.setVerticalGroup(
            jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSideLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelSide, java.awt.BorderLayout.WEST);

        jPanelCenter.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCenter.setForeground(new java.awt.Color(255, 255, 255));
        jPanelCenter.setPreferredSize(new java.awt.Dimension(500, 0));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("E-mail");
        jLabel1.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha");
        jLabel2.setAlignmentY(0.0F);

        txtSenha.setBackground(java.awt.Color.white);
        txtSenha.setAlignmentX(0.0F);
        txtSenha.setAlignmentY(0.0F);
        txtSenha.setBorder(null);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtEmail.setBackground(java.awt.Color.white);
        txtEmail.setAlignmentX(0.0F);
        txtEmail.setAlignmentY(0.0F);
        txtEmail.setBorder(null);

        btnEntrar.setBackground(new java.awt.Color(0, 0, 0));
        btnEntrar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setAlignmentY(0.0F);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(java.awt.Color.white);
        btnCadastro.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 18)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(51, 51, 51));
        btnCadastro.setText("Cadastrar-se");
        btnCadastro.setAlignmentY(0.0F);
        btnCadastro.setBorder(null);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(0.0F);
        jSeparator1.setAlignmentY(0.0F);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(0.0F);
        jSeparator2.setAlignmentY(0.0F);
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnOlho.setBackground(new java.awt.Color(255, 255, 255));
        btnOlho.setForeground(new java.awt.Color(255, 255, 255));
        btnOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye closed.png"))); // NOI18N
        btnOlho.setAlignmentY(0.0F);
        btnOlho.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOlho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlhoActionPerformed(evt);
            }
        });

        btnEsqueciSenha.setBackground(java.awt.Color.white);
        btnEsqueciSenha.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 14)); // NOI18N
        btnEsqueciSenha.setForeground(new java.awt.Color(51, 51, 51));
        btnEsqueciSenha.setText("Esqueci a senha");
        btnEsqueciSenha.setAlignmentY(0.0F);
        btnEsqueciSenha.setBorder(null);
        btnEsqueciSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEsqueciSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueciSenhaActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setAlignmentX(0.0F);
        jSeparator4.setAlignmentY(0.0F);
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCenterLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnOlho))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnEsqueciSenha))
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnCadastro))
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnOlho)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEsqueciSenha)
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCadastro)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel2.add(jPanelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String email = txtEmail.getText();
        String senha = new String(txtSenha.getPassword());

        LoginDAO dao = new LoginDAO();
        boolean valido = dao.validarLogin(email, senha);

        if (valido) {
            Sessao.emailUsuarioLogado = email; // já pega o valor do txtEmail ali em cima

            javax.swing.JOptionPane.showMessageDialog(this, "Login bem-sucedido!");

            NavegarView Conta = new NavegarView();
            Conta.setVisible(true);

            this.dispose();
        }
        else {
              javax.swing.JOptionPane.showMessageDialog(this, "Email ou senha incorretos!");
             }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
           new CadastroView().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnEsqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueciSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEsqueciSenhaActionPerformed

    private void btnOlhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlhoActionPerformed
        // TODO add your handling code here:
        
if (txtSenha.getEchoChar() == (char) 0) {

    txtSenha.setEchoChar('\u2022'); 
    btnOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye closed.png")));

} else {
    txtSenha.setEchoChar((char) 0); 
    btnOlho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png")));
}
    }//GEN-LAST:event_btnOlhoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginView().setVisible(true));
    }
    
    //varre todos os componentes e ajusta o tamanho
private void aplicarEscala(java.awt.Container container, double ratio) {
    for (java.awt.Component c : container.getComponents()) {
        
        //Aumentar a fonte
        if (c.getFont() != null) {
            java.awt.Font fonteAtual = c.getFont();
            float novoTamanho = (float) (fonteAtual.getSize() * ratio);
            c.setFont(fonteAtual.deriveFont(novoTamanho));
        }

        //aumentar o tamanho de componentes (tamanho preferido)
        if (c.isPreferredSizeSet()) {
            java.awt.Dimension d = c.getPreferredSize();
            int novaLargura = (int) (d.width * ratio);
            int novaAltura = (int) (d.height * ratio);
            c.setPreferredSize(new java.awt.Dimension(novaLargura, novaAltura));
        }
        
        if (c instanceof java.awt.Container) {
            aplicarEscala((java.awt.Container) c, ratio);
        }
    }
    
    
    
    
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsqueciSenha;
    private javax.swing.JButton btnOlho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelSide;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
