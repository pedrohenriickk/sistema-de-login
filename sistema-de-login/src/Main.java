import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    JFrame login = new JFrame("Login");
    login.setSize(800,500);
    login.setLayout(null);

    JLabel emailLabel = new JLabel("Email");
    emailLabel.setBounds(375,110,150,40);
    JTextField emailInput = new JTextField("");
    emailInput.setBounds(325,140,150,40);

    JLabel senhaLabel = new JLabel("Senha");
    senhaLabel.setBounds(376,170,150,40);
    JTextField senhaInput = new JTextField("");
    senhaInput.setBounds(325,200,150,40);




    JButton confirm = new JButton("Login");
    confirm.setBounds(325,260,150,40);
    confirm.addActionListener(e ->{
        if ("admin@senai.com".equals((emailInput.getText())) && "123456".equals(senhaInput.getText()))  {
            JOptionPane.showMessageDialog(null,"Login realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null,"Email ou senha invalidos");
        }

    });



    JButton btnclear = new JButton("Limpar campos");
    btnclear.setBounds(325,290,150,40);
    btnclear.addActionListener(e ->{
        emailInput.setText("");
        senhaInput.setText("");
    });





    login.add(confirm);
    login.add(btnclear);



    login.add(emailInput);

    login.add(emailLabel);

    login.add(senhaLabel);

    login.add(senhaInput);

    login.setVisible(true);





}
