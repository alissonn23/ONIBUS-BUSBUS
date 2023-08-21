import javax.swing.JOptionPane;
public class Rota {
    public void planejarDia() {
        // Leitura da quantidade de rotas do dia
        int quantidadeRotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de rotas do dia:"));

        int totalKm = 0; // Variável para armazenar o total de km percorridos por todos os ônibus
        int combustivelNecessario = 0; // Variável para armazenar a quantidade de combustível necessária
        double valorLitroDiesel = 0; // Variável para armazenar o valor do litro do óleo diesel

        // Loop para ler a km de cada ônibus e calcular o total de km e a quantidade de combustível necessária
        for (int i = 0; i < quantidadeRotas; i++) {
            int kmOnibus = Integer.parseInt(JOptionPane.showInputDialog("Digite a km do ônibus " + (i + 1) + ":"));
            totalKm += kmOnibus;
        }

        // Leitura do valor do litro do óleo diesel
        valorLitroDiesel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do óleo diesel:"));

        // Cálculo da quantidade de combustível necessária em litros
        combustivelNecessario = (int) Math.ceil(totalKm / 2.5);

        // Cálculo do valor total que a empresa desembolsará
        double valorDesembolsado = combustivelNecessario * valorLitroDiesel;

        // Exibição dos resultados
        JOptionPane.showMessageDialog(null,
                "Total de km: " + totalKm + "\nLitros de combustível necessário: " + combustivelNecessario
                        + "\nValor desembolsado: R$" + valorDesembolsado);
    }
}
