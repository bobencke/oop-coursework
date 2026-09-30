    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    package caixaeletronico;

    import java.util.Scanner;

    /**
     *
     * @author berna
     */
    public class CaixaEletronico {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

            Usuario usuarios[] = new Usuario[3];
            usuarios[0] = new Usuario("100", "nagini123", 0.0f);
            usuarios[1] = new Usuario("200", "manu123", 2000.0f);
            usuarios[2] = new Usuario("300", "be123", 10.0f);

            Scanner scanner1 = new Scanner(System.in);

            System.out.print("Digite o seu id: ");
            String id = scanner1.nextLine();

            Scanner scanner2 = new Scanner(System.in);

            System.out.print("Digite sua senha: ");
            String senha = scanner2.nextLine();

            int cont = 0;
            String indice = "";

            for (int i = 0; i < usuarios.length; i++){
                if (id.equals(usuarios[i].getId()) && senha.equals(usuarios[i].getSenha())){
                    indice = usuarios[i].getId();
                    cont ++;
                    System.out.println("\nEntrando na conta de ID " + usuarios[i].getId() + "...");
                    break;
                }
            }

            if (cont < 1){
                System.out.println("\nNão foi identificada a conta.");
            }else{
                Operacoes operacoes = new Operacoes(indice, usuarios);

                System.out.println("x---------------------------------x");
                System.out.println("|            1 - Saldo            |");
                System.out.println("|           2 - Extrato           |");
                System.out.println("|            3 - Saque            |");
                System.out.println("|           4 - Depósito          |");
                System.out.println("|          5 - Pagamentos         |");
                System.out.println("|         6 - Transferência       |");
                System.out.println("x---------------------------------x");

                Scanner scanner3 = new Scanner(System.in);

                System.out.print("Opção: ");
                int option = scanner3.nextInt();

                switch (option) {
                    case 1:
                        operacoes.saldo();
                        break;
                    case 2:
                        break;
                    case 3:
    //                    Scanner scanner4 = new Scanner(System.in);
    //                    System.out.println("Quanto você deseja sacar?");
    //                    float valor = scanner4.nextFloat();
    //                    usuarios[indice].setSaldo(usuarios[indice].getSaldo() - valor);
    //                    System.out.println("Valor sacado com suceso!");
    //                    System.out.println("Novo valor de saldo: " + usuarios[indice].getSaldo());
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Opção indisponível.");
                        break;
                }

            }

        }

    }
