public class aula03 {

    public static void main(String[] args) {
        // Informação do funcionario

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoss = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipos booleano
        boolean estaDeFerias = false;  // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de Empresa
        System.out.println("Eu tenho "+anosDeEmpresa * 365+" dias trabalhados nessa empresa!");  //exemplo

        // Número de Viagens
        System.out.printf("Eu fiz "+numeroDeVoss / 2+" viagens com %s voos!\n", numeroDeVoss); //exemplo

        // Pontos por real
        System.out.println("Para cada venda que eu faço eu ganho " +pontosAcumulados / vendasAcumuladas); //exemplo

        // Folha de pagamento

        System.out.println(id + ": ganha ->" + salario); //exemplo

        // Férias
        System.out.println("Férias? " + estaDeFerias); //exemplo

        // Apenas para tirar a advertência do meu projeto
        System.out.println("Status: " + status);
    }
}