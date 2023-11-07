import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; // Ao invés de localhost, coloque o IP da máquina servidor se quiser fazer o papel apenas de cliente
        ClienteRPC rpc = new ClienteRPC(urlServ);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de Operações:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Area de um Quadrado");
            System.out.println("6. Area Triangulo Retangulo");
            System.out.println("7. Area Circunferencia");
            System.out.println("8. Area Esfera");
            System.out.println("9. Volume Esfera");
            System.out.println("10. Area Cilindro");
            System.out.println("11. Volume Cilindro");
            System.out.println("12. Area Superficie Cubo");
            System.out.println("13. Volume Cubo");
            System.out.println("14. Sair");
            System.out.print("Escolha uma operação: ");

            int escolha = scanner.nextInt(); //Variável que armazena em memória a escolha da opção do menu

            if (escolha == 14) {
                System.out.println("Saindo do programa. Adeus!");
                break;
            }

            int x, y; // Variavéis que armazenam os numeros para os cálculos. 
            double resultado = 0; // Variavél que armazena o resultado dos cálculos este que contém o resultado dos cálculos no servidor RPC.

            switch (escolha) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    x = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    y = scanner.nextInt();
                    resultado = rpc.somar(x, y);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    x = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    y = scanner.nextInt();
                    resultado = rpc.subtrair(x, y);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    x = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    y = scanner.nextInt();
                    resultado = rpc.multiplicar(x, y);
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    x = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    y = scanner.nextInt();
                    resultado = rpc.dividir(x, y);
                    break;

                // Começo das operações Geométricas "Case 5 area do quadrado até case 13 volume de um cubo"
                case 5:
                    System.out.println("Informe o comprimento do lado a ser calculado do quadrado: ");
                    x = scanner.nextInt();
                    resultado = rpc.areaquadrado(x);
                    break;

                // 
                case 6:
                    System.out.println("Informe o primeiro lado do cateto: ");
                    x = scanner.nextInt();
                    System.out.println("Informe o segundo lado do cateto: ");
                    y = scanner.nextInt();
                    resultado = rpc.areatrianguloret(x, y);
                    break;
                
                case 7:
                    System.out.println("Informe o valor do raio da circunferencia: ");
                    x = scanner.nextInt();
                    resultado = rpc.areacircunferencia(x);
                    break;

                case 8:
                    System.out.println("Informe o valor do raio da esfera: ");
                    x = scanner.nextInt();
                    resultado = rpc.areaesfera(x);
                    break;

                case 9:
                    System.out.println("Informe o raio da esfera: ");
                    x = scanner.nextInt();
                    resultado = rpc.volumeesfera(x);
                    break;

                case 10:
                    System.out.println("Informe o raio do cilindro");
                    x = scanner.nextInt();
                    System.out.println("Informe a altura do cilindro");
                    y = scanner.nextInt();
                    resultado = rpc.areacilindro(x, y);
                    break;
                
                case 11:
                    System.out.println("Informe o raio do cilindro: ");
                    x = scanner.nextInt();
                    System.out.println("Informe a altura do cilindro: ");
                    y = scanner.nextInt();
                    resultado = rpc.volumecilindro(x, y);
                    break;

                case 12:
                    System.out.println("Informe um lado do cubo: ");
                    x = scanner.nextInt();
                    resultado = rpc.areacubo(x);
                    break;

                case 13:
                    System.out.println("Informe um lado do cubo: ");
                    x = scanner.nextInt();
                    resultado = rpc.volumecubo(x);
                    break;
                 
                default:
                    System.out.println("Opção inválida. Escolha novamente."); // caso nenhuma das opções selecionadas seja válida
            }

            System.out.println("Resultado: " + resultado); // Saida do terminal mais a váriavel de 
                                                                //cada resultado dependendo do calculo
        }                                                         // fica logo abaixo da operação.

        scanner.close();
    }
}
