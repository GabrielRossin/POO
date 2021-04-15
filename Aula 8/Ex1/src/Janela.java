

import entidades.ListNum;
import excecoes.ValorInvalidoEX;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Janela extends JFrame implements ActionListener
{
    private JPanel pane;
    private JButton gerar;
    private JButton mostrar;
    private JTextArea area;
    private JScrollPane rolar;
    private ListNum num;
    private final String CAMINHO = "C:\\Teste.txt";

    public Janela(String titulo){
        super(titulo);
        num = new ListNum();
        criarComponentes();
        ajustarPropriedadesJanela();
    }

    private void criarComponentes(){
        pane = new JPanel();
        gerar = new JButton("GERAR");
        mostrar = new JButton("MOSTRAR");
        area = new JTextArea(10,20);
        rolar = new JScrollPane(area);

        gerar.addActionListener(this);
        mostrar.addActionListener(this);
        pane.add(gerar);
        pane.add(mostrar);
        pane.add(mostrar);
        pane.add(rolar);
        add(pane);

    }

    private void ajustarPropriedadesJanela()
    {
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mostrar.setEnabled(false);
        area.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == gerar)
        {
            num.gerarNumeros();
            try
            {
                num.armazenar(this.CAMINHO);
                mostrar.setEnabled(true);
            }
            catch (IOException ex)
            {
                mostrar.setEnabled(false);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        else
        {
            if(e.getSource() == mostrar)
            {
                try
                {
                    area.setText("");
                    String texto;
                    texto = num.lerArquivo(this.CAMINHO);
                    area.setText(texto);
                }
                catch (IOException | ValorInvalidoEX ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        }

    }
}

