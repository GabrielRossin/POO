import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;

    private JPanel panelBase;

    private JLabel label;
    private JTextField textField;
    private JButton botaoTocar;

    public Janela(String titulo) {
        super(titulo);

        addComponentes();
        ajustarPropriedadesJanela();
    }

    private void addComponentes() {
        panelBase = new JPanel();
        panelBase.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Principal"));


        label = new JLabel("Instrumento");
        textField = new JTextField(10);

        JButton buttonTocar = new JButton("Tocar");
        buttonTocar.addActionListener(this);

        panelBase.add(label);
        panelBase.add(textField);
        panelBase.add(buttonTocar);

        add(panelBase);
    }

    private void ajustarPropriedadesJanela() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        String Nome_instrumento = textField.getText().trim().toLowerCase();

        if(Nome_instrumento.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Instrumento não informado!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        else {
            Instrumentos tocarInst;

            switch (Nome_instrumento) {
                case "guitarra":
                    tocarInst = new Guitarra();
                    JOptionPane.showMessageDialog(null, tocarInst.tocar(), "Tocando", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "piano":
                    tocarInst = new Piano();
                    JOptionPane.showMessageDialog(null, tocarInst.tocar(), "Tocando", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "bateria":
                    tocarInst = new Bateria();
                    JOptionPane.showMessageDialog(null, tocarInst.tocar(), "Tocando", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " O Instrumento não foi encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        }

    }

}
