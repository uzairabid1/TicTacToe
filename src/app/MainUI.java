
package app;

import javax.swing.JOptionPane;


public class MainUI extends javax.swing.JFrame {

    public MainUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlBoard = new javax.swing.JPanel();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        lblPlayerTurn = new javax.swing.JLabel();
        lblPlayerOneScore = new javax.swing.JLabel();
        lblPlayerTwoScore = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        playerWin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("P1 Symbol : O & P2 Symbol : X");

        pnlBoard.setLayout(new java.awt.GridLayout(3, 3));

        btn00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn00);

        btn01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn01);

        btn02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn02);

        btn10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn10);

        btn11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn11);

        btn12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn12);

        btn20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn20);

        btn21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn21);

        btn22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        pnlBoard.add(btn22);

        lblPlayerTurn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlayerTurn.setText("Player Turn : 1");

        lblPlayerOneScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlayerOneScore.setText("P1 Score : 0");

        lblPlayerTwoScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlayerTwoScore.setText("P2 Score : 0");

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnReload.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReload.setText("RELOAD");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        playerWin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu1.setText("File");

        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerWin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayerTurn)
                    .addComponent(lblPlayerOneScore)
                    .addComponent(lblPlayerTwoScore)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addGap(34, 34, 34)
                        .addComponent(btnReload)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPlayerTurn))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlayerOneScore)
                        .addGap(44, 44, 44)
                        .addComponent(lblPlayerTwoScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnReload))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playerWin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(MainUI.this, "App Developed By : Uzair Abid");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        turn = 0;
        P1Score = 0;
        P2Score = 0;
        
        unlockBoard();
        
        lblPlayerOneScore.setText("Player 1 Score : 0");
        lblPlayerTwoScore.setText("Player 2 Score : 0");
        lblPlayerTurn.setText("Player Turn : " + ( turn + 1 ));
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        unlockBoard();
        turn = 0;
        lblPlayerTurn.setText("Player Turn : " + ( turn + 1 ));
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        if ( turn % 2 == 0 ) {
           
            btn00.setEnabled(false);
            btn00.setText("O");
            board[0][0] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
                playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("Player 1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {
           
            btn00.setEnabled(false);
            btn00.setText("X");
            board[0][0] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("Player 2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        if ( turn % 2 == 0 ) {
           
            btn01.setEnabled(false);
            btn01.setText("O");
            board[0][1] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
                playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("Player 1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {

            btn01.setEnabled(false);
            btn01.setText("X");
            board[0][1] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("Player 2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        if ( turn % 2 == 0 ) {
            
            btn02.setEnabled(false);
            btn02.setText("O");
            board[0][2] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
                playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("Player 1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {
            
            btn02.setEnabled(false);
            btn02.setText("X");
            board[0][2] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("Player 2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if ( turn % 2 == 0 ) {
        
            btn10.setEnabled(false);
            btn10.setText("O");
            board[1][0] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
                playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("Player 1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {
           
            btn10.setEnabled(false);
            btn10.setText("X");
            board[1][0] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("Player 2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
       if ( turn % 2 == 0 ) {
           
            btn11.setEnabled(false);
            btn11.setText("O");
            board[1][1] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
                playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("Player 1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {
            
            btn11.setEnabled(false);
            btn11.setText("X");
            board[1][1] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("Player 2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if ( turn % 2 == 0 ) {
            
            btn12.setEnabled(false);
            btn12.setText("O");
            board[1][2] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
                playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("Player 1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {
           
            btn12.setEnabled(false);
            btn12.setText("X");
            board[1][2] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("Player 2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
       if ( turn % 2 == 0 ) {
           
            btn20.setEnabled(false);
            btn20.setText("O");
            board[2][0] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
                playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("Player 1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {
            // P1 Code
            btn20.setEnabled(false);
            btn20.setText("X");
            board[2][0] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("Player 2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        if ( turn % 2 == 0 ) {
            // P1 Code
            btn21.setEnabled(false);
            btn21.setText("O");
            board[2][1] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
               playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("Player 1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {
           
            btn21.setEnabled(false);
            btn21.setText("X");
            board[2][1] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("Player 2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
       if ( turn % 2 == 0 ) {
           
            btn22.setEnabled(false);
            btn22.setText("O");
            board[2][2] = 'O';
            if ( checkWinner('O') ){
                lockBoard();
                P1Score++;
                playerWin.setText("Player 1 won!");
                lblPlayerOneScore.setText("P1 Score : " + P1Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        } else {
           
            btn22.setEnabled(false);
            btn22.setText("X");
            board[2][2] = 'X';
            if ( checkWinner('X') ){
                lockBoard();
                P2Score++;
                 playerWin.setText("Player 2 won!");
                lblPlayerTwoScore.setText("P2 Score : " + P2Score);
            }
            turn++;
            lblPlayerTurn.setText("Player Turn : " + ( ( turn % 2 ) + 1 ));
        }
    }//GEN-LAST:event_btn22ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }
    
    void lockBoard(){
        for ( int i = 0 ; i < 9; i++ ){
            pnlBoard.getComponent(i).setEnabled(false);
        }
    }
    
    void unlockBoard(){
        for ( int i = 0; i < 9; i++ ){
            pnlBoard.getComponent(i).setEnabled(true);
        }
        
        btn00.setText("");
        btn01.setText("");
        btn02.setText("");
        
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        
        btn20.setText("");
        btn21.setText("");
        btn22.setText("");
        
        turn = 0;
        
        for ( int i = 0; i < 3; i++ ){
            for ( int j = 0; j < 3; j++ ){
                board[i][j] = ' ';
            }
        }
        
    }
    
    boolean checkWinner( char Symbol ){
        for ( int i = 0; i < 3; i++ ){
            
            if ( ( board[i][0] == Symbol ) && ( board[i][1] == Symbol ) && ( board[i][2] == Symbol ) ){
                return true;
            }
            
            
            if ( ( board[0][i] == Symbol ) && ( board[1][i] == Symbol ) && ( board[2][i] == Symbol ) ){
                return true;
            }
        }
        
        
        if ( ( board[1][1] == Symbol ) && ( board[2][2] == Symbol ) && ( board[0][0] == Symbol ) ){
                return true;
        }
        
         // Top Right Diagonal Winner Check
        if ( ( board[0][2] == Symbol ) && ( board[1][1] == Symbol ) && ( board[2][0] == Symbol ) ){
                return true;
        }
        
        return false;
        
    }
    
    
    char [][]board = new char[3][3];
    int turn = 0;
    int P1Score = 0;
    int P2Score = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblPlayerOneScore;
    private javax.swing.JLabel lblPlayerTurn;
    private javax.swing.JLabel lblPlayerTwoScore;
    private javax.swing.JLabel playerWin;
    private javax.swing.JPanel pnlBoard;
    // End of variables declaration//GEN-END:variables
}
