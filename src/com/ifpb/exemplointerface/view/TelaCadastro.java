package com.ifpb.exemplointerface.view;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class TelaCadastro extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField1;
    private JComboBox comboBox1;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femininoRadioButton;

    public TelaCadastro() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() throws ParseException {

        MaskFormatter formatterCpf = new MaskFormatter("###.###.###-##");
        formattedTextField1 = new JFormattedTextField();
        formatterCpf.install(formattedTextField1);

        MaskFormatter formatterData = new MaskFormatter("##/##/####");
        formattedTextField2 = new JFormattedTextField();
        formatterData.install(formattedTextField2);

        ButtonGroup group = new ButtonGroup();
        masculinoRadioButton = new JRadioButton();
        femininoRadioButton = new JRadioButton();
        femininoRadioButton.setSelected(true);
        group.add(masculinoRadioButton);
        group.add(femininoRadioButton);

        String cargos[] = {"Atendimento", "Caixa", "Cozinha","Gerência"};
        comboBox1 = new JComboBox(cargos);

    }
}
