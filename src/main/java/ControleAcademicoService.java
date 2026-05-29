public class ControleAcademicoService {
    public String verificarSituacao(double media, int frequencia) {
        if (media > 7 && frequencia > 75) {
            return "Aprovado";
        }
        if (media >= 4 && media < 7 && frequencia >= 75) {
            return "Prova Final";
        }
        return "Reprovado";
    }

    // Chamado 2 CORRIGIDO: Adicionado parênteses para garantir a precedência da soma
    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public boolean frequenciaValida(int frequencia) {
        if (frequencia > 0 && frequencia < 100) {
            return true;
        }
        return false;
    }

    public double calcularNotaFinal(double media, double provaFinal) {
        return media + provaFinal / 2;
    }
}