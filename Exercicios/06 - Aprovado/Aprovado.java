import javax.swing.JOptionPane;

public class Aprovado {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String aux;

        aux = JOptionPane.showInputDialog("Informe a pontua��o do candidato (entre 0 e 1000):");
        int pontuacao = Integer.parseInt(aux);

        if(pontuacao < 0 || pontuacao > 1000){
            JOptionPane.showMessageDialog(null, "Pontua��o inv�lida.");
        } else if (pontuacao >= 700) {
            JOptionPane.showMessageDialog(null, "Parab�ns! Candidato aprovado!");
        } else if (pontuacao >= 600 && pontuacao < 700){
            JOptionPane.showMessageDialog(null, "H� chances de ser aprovado.");
        } else {
            JOptionPane.showMessageDialog(null, "Ser� preciso fazer a prova novamente.");
        }
    }
}
