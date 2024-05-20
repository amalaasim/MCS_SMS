public class RegistrationForm2 extends javax.swing.JFrame
{
    public RegistrationForm2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        PhoneNumberLabel1 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();
        LocationTextField = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        NameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name");
        getContentPane().add(NameLabel);
        NameLabel.setBounds(40, 90, 53, 30);

        EmailLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email");
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(40, 130, 51, 30);

        PhoneNumberLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PhoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberLabel.setText("Phone Number");
        getContentPane().add(PhoneNumberLabel);
        PhoneNumberLabel.setBounds(40, 170, 137, 30);

        PhoneNumberLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PhoneNumberLabel1.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberLabel1.setText("Location");
        getContentPane().add(PhoneNumberLabel1);
        PhoneNumberLabel1.setBounds(40, 210, 78, 30);

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameTextField);
        NameTextField.setBounds(110, 90, 249, 30);

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailTextField);
        EmailTextField.setBounds(110, 130, 249, 30);

        PhoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneNumberTextField);
        PhoneNumberTextField.setBounds(200, 170, 163, 30);

        LocationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(LocationTextField);
        LocationTextField.setBounds(140, 210, 222, 30);

        SaveButton.setBackground(new java.awt.Color(51, 51, 51));
        SaveButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton);
        SaveButton.setBounds(160, 250, 85, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/justlikefoodpanda/Not FoodPanda-Registration Form.png"))); // NOI18N
        jLabel1.setText("Save");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -40, 410, 380);

        pack();
    }// </editor-fold>

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void PhoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void LocationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField LocationTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JLabel PhoneNumberLabel1;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}

