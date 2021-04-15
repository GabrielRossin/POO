
package janelas;
import entidades.Tela;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JanelaPerso extends JFrame
{
    private JButton btnBotao;
    private JPanel pane;
    private Tela janela;

    public JanelaPerso(String titulo, Tela config)
    {
        super(titulo);
        this.janela = config;
        ajustarPropriedadesJanela();
        criarComponentes();
    }

    private void ajustarPropriedadesJanela()
    {
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void criarComponentes()
    {
        pane = new JPanel();
        btnBotao = new JButton("BOTAO PERSONALIZADO");
        Font f = new Font(janela.getFonte(), janela.isEstilo()? Font.BOLD : Font.PLAIN, janela.getTamanho());
        btnBotao.setFont(f);
        btnBotao.setBackground(janela.getcBotao());
        pane.add(btnBotao);
        add(pane);

    }
}
