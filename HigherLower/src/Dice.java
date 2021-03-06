
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class represent Frame with dice simulator. You can set number and
 * dimension of dices and then just throw it. On frame you will see every single
 * result at particular dice and total of them.
 *
 * @author kastel
 */
public class Dice extends javax.swing.JFrame
{

	/**
	 * List with labels showing result.
	 */
	private List<JLabel> lbl_list;

	/**
	 * Creates new form Dice
	 */
	public Dice()
	{
		lbl_list = new ArrayList<>();
		initComponents();
		this.setLocationRelativeTo(null); //frame appear at center of monitor

		//Adding filter to textfield to be only for digits.
		IntegerDocumentFilter.addTo(coins_num_txtbox);
		IntegerDocumentFilter.addTo(dime_txtb);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        coins_num_txtbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_throwCoin = new javax.swing.JButton();
        dime_txtb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_total_dice = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        runHigherLower = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        runHeadTail = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        runDice = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        runWhatnum = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Throw dice");
        setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));
        setResizable(false);

        jLabel1.setText("Set quantity of dice:");

        btn_throwCoin.setBackground(new java.awt.Color(102, 153, 255));
        btn_throwCoin.setText("Throw Dice");
        btn_throwCoin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_throwCoinActionPerformed(evt);
            }
        });

        jLabel2.setText("Total result of dice:");

        jLabel3.setText("Set dice dimension:");

        lbl_total_dice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbl_total_dice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_total_dice.setText("0");

        jMenu1.setText("LowerHigher");

        runHigherLower.setText("Run");
        runHigherLower.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                runHigherLowerActionPerformed(evt);
            }
        });
        jMenu1.add(runHigherLower);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Head or Tails");

        runHeadTail.setText("Run");
        runHeadTail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                runHeadTailActionPerformed(evt);
            }
        });
        jMenu2.add(runHeadTail);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Dice");
        jMenu3.setEnabled(false);

        runDice.setText("Run");
        runDice.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                runDiceActionPerformed(evt);
            }
        });
        jMenu3.add(runDice);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("What number?");

        runWhatnum.setText("Run");
        runWhatnum.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                runWhatnumActionPerformed(evt);
            }
        });
        jMenu4.add(runWhatnum);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dime_txtb)
                    .addComponent(coins_num_txtbox, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_throwCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbl_total_dice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_total_dice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_throwCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coins_num_txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dime_txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	/**
	 * Simulates throwing dices.
	 *
	 * @param evt
	 */
    private void btn_throwCoinActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_throwCoinActionPerformed
    {//GEN-HEADEREND:event_btn_throwCoinActionPerformed
		deleteDicefromFrame(); //clear list

		int x = 10;				// begining x position on frame
		int counter = 0;		//this variable is responsible for rows counting on form
		int dice_dim = 3;		//k-dimension of dice
		int total = 0;			//total result of dices
		int num = 0;

		Random rnd = new Random();

		//dont throw with empty textfields
		if (!coins_num_txtbox.getText().isEmpty() && !dime_txtb.getText().isEmpty())
		{
			//you cant have to much dieces with inproper dimensions.
			if (Integer.parseInt(coins_num_txtbox.getText()) < 151 && Integer.parseInt(dime_txtb.getText()) > 2 && Integer.parseInt(dime_txtb.getText()) < 101)
			{
				dice_dim = Integer.parseInt(dime_txtb.getText());

				//foreach dice
				for (int i = 0; i < Integer.parseInt(coins_num_txtbox.getText()); i++)
				{
					//begin new column if one is finished
					if (i % 10 == 0 && i != 0)
					{
						x = x + 30;
						counter = 0;
					}

					JLabel jab = new JLabel();

					//new dice with score and sum of it
					num = rnd.nextInt(dice_dim) + 1;
					total = num + total;
					jab.setText(String.valueOf(num));

					jab.setBounds(x, 65 + counter * 20, 100, 30);
					lbl_list.add(jab);
					this.add(jab);

					counter++;
				}
				//at last you refresh frame with new labels and show score
				this.revalidate();
				this.repaint();
				lbl_total_dice.setText(String.valueOf(total));
			}
			//Error messages
			else
			{
				JOptionPane.showMessageDialog(null, "You can't throw more than 150 coins!\nDimension of dice need to be greater than 3 and lesser than 100.", "Incorrect values!", JOptionPane.ERROR_MESSAGE);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Enter right dice dimension and enter how many dices you want to throw.", "Fill blank fields!", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_btn_throwCoinActionPerformed

    private void runHigherLowerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_runHigherLowerActionPerformed
    {//GEN-HEADEREND:event_runHigherLowerActionPerformed
        this.setVisible(false);
        StartWindow.highlow.setVisible(true);
    }//GEN-LAST:event_runHigherLowerActionPerformed

    private void runHeadTailActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_runHeadTailActionPerformed
    {//GEN-HEADEREND:event_runHeadTailActionPerformed
        this.setVisible(false);
        StartWindow.headtail.setVisible(true);
    }//GEN-LAST:event_runHeadTailActionPerformed

    private void runDiceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_runDiceActionPerformed
    {//GEN-HEADEREND:event_runDiceActionPerformed
        this.setVisible(false);
        StartWindow.dice.setVisible(true);
    }//GEN-LAST:event_runDiceActionPerformed

    private void runWhatnumActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_runWhatnumActionPerformed
    {//GEN-HEADEREND:event_runWhatnumActionPerformed
        this.setVisible(false);
        StartWindow.whatnum.setVisible(true);
    }//GEN-LAST:event_runWhatnumActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(Dice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new Dice().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_throwCoin;
    private javax.swing.JTextField coins_num_txtbox;
    private javax.swing.JTextField dime_txtb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_total_dice;
    private javax.swing.JMenuItem runDice;
    private javax.swing.JMenuItem runHeadTail;
    private javax.swing.JMenuItem runHigherLower;
    private javax.swing.JMenuItem runWhatnum;
    // End of variables declaration//GEN-END:variables

	/**
	 * Delete labels from Frame and clear List
	 */
	private void deleteDicefromFrame()
	{
		for (JLabel lbl : lbl_list)
		{
			lbl.setVisible(false);
		}
		lbl_list.clear();
	}
}
