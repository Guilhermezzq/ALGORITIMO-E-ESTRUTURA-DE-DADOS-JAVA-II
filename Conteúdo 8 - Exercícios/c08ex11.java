import javax.swing.JOptionPane;

public class c08ex11 {

    public static void main(String[] args) {

        int quantidadeMulheresLoirasOlhosAzuis = 0;
        String nomePessoaMaiorSalario = "";
        double maiorSalario = Double.MIN_VALUE;
        double menorSalarioHomens = Double.MAX_VALUE;

        for (int i = 0; i < 50; i++) {
            String nome = JOptionPane.showInputDialog("Informe o nome da pessoa:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa:"));
            String sexo = JOptionPane.showInputDialog("Informe o sexo da pessoa (M/F):");
            String estadoCivil = JOptionPane.showInputDialog("Informe o estado civil da pessoa (C/S/O):");
            String corOlhos = JOptionPane.showInputDialog("Informe a cor dos olhos da pessoa (A/C/P/O):");
            String corCabelos = JOptionPane.showInputDialog("Informe a cor dos cabelos da pessoa (L/P/C/R):");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário da pessoa:"));
            int escolaridade = Integer.parseInt(JOptionPane.showInputDialog("Informe a escolaridade da pessoa (1/2/3/4):"));

            // Verifica se a pessoa é mulher, loira, de olhos azuis, idade entre 18 e 25 anos, solteira, salário maior que R$10.000,00 e tem curso superior completo
            if (sexo.equalsIgnoreCase("F") && corCabelos.equalsIgnoreCase("L") && corOlhos.equalsIgnoreCase("A")
                    && idade >= 18 && idade <= 25 && estadoCivil.equalsIgnoreCase("S") && salario > 10000
                    && escolaridade == 4) {
                quantidadeMulheresLoirasOlhosAzuis++;
            }

            // Verifica se o salário da pessoa é maior que o maior salário atual
            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomePessoaMaiorSalario = nome;
            }

            // Verifica se o salário da pessoa é menor que o menor salário dos homens atual
            if (sexo.equalsIgnoreCase("M") && salario < menorSalarioHomens) {
                menorSalarioHomens = salario;
            }
        }

        // Imprime as informações solicitadas
        JOptionPane.showMessageDialog(null, "Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo: " + quantidadeMulheresLoirasOlhosAzuis);
        JOptionPane.showMessageDialog(null, "Nome da pessoa com maior salário: " + nomePessoaMaiorSalario);
        JOptionPane.showMessageDialog(null, "Diferença entre o maior e menor salário dos homens: " + (maiorSalario - menorSalarioHomens));
    }
}
