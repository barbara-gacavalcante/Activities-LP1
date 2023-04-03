import javax.swing.JOptionPane;

public class Aprovado {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String aux;

        aux = JOptionPane.showInputDialog("Informe a pontuação do candidato (entre 0 e 1000):");
        int pontuacao = Integer.parseInt(aux);

        if(pontuacao < 0 || pontuacao > 1000){
            JOptionPane.showMessageDialog(null, "Pontuação inválida.");
        } else if (pontuacao >= 700) {
            JOptionPane.showMessageDialog(null, "Parabéns! Candidato aprovado!");
        } else if (pontuacao >= 600 && pontuacao < 700){
            JOptionPane.showMessageDialog(null, "Há chances de ser aprovado.");
        } else {
            JOptionPane.showMessageDialog(null, "Será preciso fazer a prova novamente.");
        }
    }
}
