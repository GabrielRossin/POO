

import entidades.Jogos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame implements ActionListener
{
    private JPanel pane;
    private JLabel tentativas;
    private JLabel valor;
    private JLabel nome;
    private JTextField fNome;
    private JTextField fValor;
    private JButton novoJogo;
    private JButton jogar;
    private JButton salvar;
    private JButton recuperar;
    private Jogos jogo;
    private final String CAMINHO = "C:\\Teste\\Teste.dat";

    public Janela(String titulo)
    {
        super(titulo);
        criarComponentes();
        ajustarPropriedadesJanela();
        this.iniciarValoresPadrao();
        jogo = new Jogos();

    }

    private void criarComponentes()
    {
        pane = new JPanel();
        tentativas = new JLabel("Tentativas Restantes: ");
        nome = new JLabel("Nome do Jogador:");
        fNome = new JTextField(10);
        fValor= new JTextField(5);

        valor = new JLabel("Digite o número:");
        novoJogo = new JButton("NOVO JOGO");
        jogar = new JButton("JOGAR");
        salvar = new JButton("SALVAR");
        recuperar = new JButton("RECUPERAR");

        novoJogo.addActionListener(this);
        jogar.addActionListener(this);
        salvar.addActionListener(this);
        recuperar.addActionListener(this);

        pane.add(nome);
        pane.add(fNome);
        pane.add(valor);
        pane.add(fValor);
        pane.add(novoJogo);
        pane.add(jogar);
        pane.add(salvar);
        pane.add(recuperar);
        pane.add(tentativas);
        add(pane);

    }

    private void ajustarPropriedadesJanela()
    {
        setVisible(true);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void iniciarValoresPadrao()
    {
        this.limparCampos();
        fNome.setEnabled(true);
        novoJogo.setEnabled(true);
        jogar.setEnabled(false);
        salvar.setEnabled(false);
        valor.setEnabled(false);
    }

    private void limparCampos()
    {
        fValor.setText("");
        fNome.setText("");
        tentativas.setText("Tentativas Restantes: " + Jogos.MAX_TENTATIVAS );
        jogo = new Jogos();
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == novoJogo)
        {
            if(this.fNome.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite o nome para começar!");
            }
            else
            {
                jogo.setNomeJogador(fNome.getText().trim());
                novoJogo.setEnabled(false);
                jogar.setEnabled(true);
                jogo.lancar();
                fValor.setEnabled(true);
                fNome.setEnabled(false);
            }

        }
        else
        {
            if(e.getSource() == jogar)
            {
                try
                {
                    int numero = Integer.parseInt(fValor.getText().trim());
                    salvar.setEnabled(true);
                    if(jogo.getTentativas() >= Jogos.MAX_TENTATIVAS){
                        JOptionPane.showMessageDialog(null, "Você atingiu o número máximo de tentativas!");
                        this.iniciarValoresPadrao();
                    }
                    else
                    {
                        if(jogo.adivinhar(numero))
                        {
                            JOptionPane.showMessageDialog(null, "Você acertoou!");
                            this.iniciarValoresPadrao();
                        }
                        else
                        {
                            tentativas.setText("Tentantivas Restantes: " + (Jogos.MAX_TENTATIVAS - jogo.getTentativas()));
                            JOptionPane.showMessageDialog(null, "Você errou! Restam: " + (Jogos.MAX_TENTATIVAS - jogo.getTentativas()) + " tentativas");
                        }
                    }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            else
            {
                if(e.getSource() == salvar)
                {
                    try
                    {
                        jogo.salvarJogo(this.CAMINHO);
                        JOptionPane.showMessageDialog(null, "O jogo foi salvo !");
                        this.iniciarValoresPadrao();
                    }
                    catch (IOException ex)
                    {
                        JOptionPane.showMessageDialog(null,ex.getMessage());
                    }
                }
                else
                {
                    if(e.getSource() == recuperar)
                    {
                        try
                        {
                            jogo = Jogos.recuperarJogo(CAMINHO);
                            fValor.setEnabled(true);
                            fNome.setText(jogo.getNomeJogador());
                            jogar.setEnabled(true);
                            nome.setEnabled(false);
                        }
                        catch (IOException | ClassNotFoundException ex)
                        {
                            JOptionPane.showMessageDialog(null,ex.getMessage());
                        }
                        tentativas.setText("Tentantivas Restantes: " + (Jogos.MAX_TENTATIVAS - jogo.getTentativas()));
                    }
                }
            }

        }
    }

}
