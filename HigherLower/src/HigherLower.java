
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class is responsible for Higher or Lower game. Choose if the next number
 * will be higher or lower?
 *
 * @author kastel
 */
public class HigherLower extends javax.swing.JFrame
{

	private Random rnd;
	/**
	 * Current picked number
	 */
	private int now_num;
	/**
	 * Next picked number
	 */
	private int next_num;
	/**
	 * Current score
	 */
	private int score = 0;
	/**
	 * Biggest score achived
	 */
	private int highscore = 0;
	/**
	 * range is for choosing from what range we choosing number
	 */
	private int range = 100;

	/**
	 * Creates new form MainWindow
	 */
	public HigherLower()
	{
		//at the begining we set Frame to center, initialize random generator,
		//draw numbers and setting label
		initComponents();
		this.setLocationRelativeTo(null);

		rnd = new Random();
		now_num = rnd.nextInt(range);
		next_num = rnd.nextInt(range);
		lbl_number.setText(String.valueOf(now_num));
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

        jMenuItem1 = new javax.swing.JMenuItem();
        btn_higher = new javax.swing.JButton();
        btn_lower = new javax.swing.JButton();
        lbl_score = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_highscore = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_number = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        runHigherLower = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        runHeadTail = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        runDice = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        runWhatnum = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lower or higher");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 360));
        setResizable(false);

        btn_higher.setBackground(new java.awt.Color(102, 153, 255));
        btn_higher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_higher.setText("HIGHER");
        btn_higher.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_higherActionPerformed(evt);
            }
        });

        btn_lower.setBackground(new java.awt.Color(102, 153, 255));
        btn_lower.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_lower.setText("LOWER");
        btn_lower.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_lowerActionPerformed(evt);
            }
        });

        lbl_score.setText("0");

        jLabel2.setText("Your score:");

        lbl_highscore.setText("0");

        jLabel4.setText("Highest score: ");

        lbl_number.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lbl_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_number.setText("0");

        jLabel6.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel6.setText("Lower or Higher?");

        jLabel1.setText("Next number will be...");

        jMenu1.setText("LowerHigher");
        jMenu1.setEnabled(false);

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_highscore)
                            .addComponent(lbl_score)))
                    .addComponent(btn_lower, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btn_higher)
                    .addComponent(lbl_number))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_higher, btn_lower, jLabel6, lbl_number});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addComponent(lbl_number)
                .addGap(18, 18, 18)
                .addComponent(btn_higher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lower, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_score)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_highscore)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_higher, btn_lower});

        pack();
    }// </editor-fold>//GEN-END:initComponents
	/**
	 * You bet that next number will be higher.
	 * @param evt
	 */
    private void btn_higherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_higherActionPerformed
		//if you are correct
		if (next_num >= now_num)
		{
			//show message, set next number as current and draw another
			JOptionPane.showMessageDialog(null, "Correct!", "OK", JOptionPane.PLAIN_MESSAGE);
			lbl_number.setText(String.valueOf(next_num));
			now_num = next_num;
			next_num = rnd.nextInt(range);

			//set score and highscore
			score++;
			lbl_score.setText(String.valueOf(score));
			
			//set highscore if score is bigger
			if (score >= highscore)
			{
				highscore = score;
				lbl_highscore.setText(String.valueOf(highscore));
			}

		}
		else //you are wrong and game over
		{
			JOptionPane.showMessageDialog(null, "Wrong!\nCorrect number was: " + next_num, "OK", JOptionPane.ERROR_MESSAGE);
			score = 0;
			lbl_score.setText(String.valueOf(score));
			now_num = rnd.nextInt(range);
			next_num = rnd.nextInt(range);
			lbl_number.setText(String.valueOf(now_num));
		}

    }//GEN-LAST:event_btn_higherActionPerformed

	/**
	 * You bet that next number will be lesser.
	 * @param evt 
	 */
    private void btn_lowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lowerActionPerformed
		
		//if you are right
		if (next_num <= now_num)
		{
			//show message, pick another number
			JOptionPane.showMessageDialog(null, "Correct!", "OK", JOptionPane.PLAIN_MESSAGE);
			lbl_number.setText(String.valueOf(next_num));
			now_num = next_num;
			next_num = rnd.nextInt(range);

			//set score and highscore
			score++;
			lbl_score.setText(String.valueOf(score));

			//set highscore if score is bigger
			if (score >= highscore)
			{
				highscore = score;
				lbl_highscore.setText(String.valueOf(highscore));
			}

		}
		else //you are wrong and end game
		{
			JOptionPane.showMessageDialog(null, "Wrong!\nCorrect number was: " + next_num, "BAD", JOptionPane.ERROR_MESSAGE);
			score = 0;
			lbl_score.setText(String.valueOf(score));
			now_num = rnd.nextInt(range);
			next_num = rnd.nextInt(range);
			lbl_number.setText(String.valueOf(now_num));
		}
    }//GEN-LAST:event_btn_lowerActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_higher;
    private javax.swing.JButton btn_lower;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbl_highscore;
    private javax.swing.JLabel lbl_number;
    private javax.swing.JLabel lbl_score;
    private javax.swing.JMenuItem runDice;
    private javax.swing.JMenuItem runHeadTail;
    private javax.swing.JMenuItem runHigherLower;
    private javax.swing.JMenuItem runWhatnum;
    // End of variables declaration//GEN-END:variables
}
