
package janelas;

import entidades.Arquivos;
import entidades.Tela;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import javafx.scene.text.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame implements ActionListener
{
    protected JPanel panel;
    protected JLabel lblNome;
    protected JTextField fieldNome;
    protected JComboBox cboFontes;
    protected JCheckBox chkEstilo;
    protected JLabel lblTamanho;
    protected JTextField fieldTamanho;
    protected JButton btnCor;
    protected JButton btnNovaJanela;
    protected JButton btnGravar;
    protected JColorChooser clcColor;
    protected List<String> fontes;
    protected String fonteSelecionada;
    protected Tela config;
    protected Color color = Color.LIGHT_GRAY;
    protected final String CAMINHO = "C:\\Teste\\Configuracao.dat";


    public Janela(String titulo)
    {
        super(titulo);
        criarComponentes();
        ajustarPropriedadesJanela();
        config = new Tela("Arial",12,true,Color.BLUE);
    }

    private void criarComponentes()
    {
        panel = new JPanel();
        lblNome = new JLabel("Fonte:");
        fieldNome = new JTextField(5);
        chkEstilo = new JCheckBox("Estilo");
        lblTamanho = new JLabel("Tamanho");
        fieldTamanho = new JTextField(5);
        btnCor = new JButton("Cor de fundo");
        btnNovaJanela = new JButton("Abrir Nova Janela");
        btnGravar = new JButton("Gravar");
        cboFontes = new JComboBox();

        fontes = Font.getFontNames();

        for (int i = 0; i < fontes.size()-1; i++)
        {
            cboFontes.addItem(fontes.get(i));
        }


        btnCor.addActionListener(this);
        btnNovaJanela.addActionListener(this);
        btnGravar.addActionListener(this);
        panel.add(lblNome);
        panel.add(cboFontes);
        panel.add(chkEstilo);
        panel.add(lblTamanho);
        panel.add(fieldTamanho);
        panel.add(btnCor);
        panel.add(btnNovaJanela);
        panel.add(btnGravar);

        add(panel);
    }

    private void ajustarPropriedadesJanela()
    {
        setVisible(true);
        //pack();
        setSize(700, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnCor)
        {
            color = JColorChooser.showDialog( Janela.this, "Escolher a color", color );

            if( color == null )
            {
                color = Color.LIGHT_GRAY;
            }
            btnCor.setBackground(color);
        }else
        {
            if(e.getSource() == btnNovaJanela)
            {
                try
                {
                    config = Arquivos.ler(this.CAMINHO);
                }
                catch (IOException | ClassNotFoundException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                catch(NullPointerException ex)
                {
                    config = new Tela("Arial",12,true,Color.GRAY);
                }
                JanelaPerso jan = new JanelaPerso("Personalizada", config);
            }
            else
            {
                if(e.getSource() == btnGravar)
                {
                    try
                    {
                        fonteSelecionada = cboFontes.getSelectedItem().toString();
                        int tamanho = Integer.parseInt(fieldTamanho.getText());
                        boolean isEstilo = chkEstilo.isSelected();
                        config = new Tela(fonteSelecionada, tamanho, isEstilo, color);

                        Arquivos.gravar(config, this.CAMINHO);

                        JOptionPane.showMessageDialog(null, "Gravado !");

                        config = null;
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null, "O campo Tamanho só aceita números. Erro: " + ex.getMessage());
                    }
                    catch (IOException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        }
    }

}
