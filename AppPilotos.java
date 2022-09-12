
import java.io.IOException;
import java.util.Scanner;

import classes.aplicativos.Pessoa;
import classes.aplicativos.Aeronave;
import classes.aplicativos.Piloto;

public class AppPilotos {
    public static void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 20;
        int variavelTec= 0;
        int opcao, qtdCadastrados = 0;
        Pessoa[] pilotos = new Pessoa[MAX_ELEMENTOS];
        int MAX_ELEMENTOS2 = MAX_ELEMENTOS;
        Pessoa[] vetorAuciliar = new Pessoa[MAX_ELEMENTOS2];
        
        Scanner in = new Scanner(System.in);
         
        

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo CPF");
            System.out.println("4 - Aumentar espaço de armazenamento");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {

                if(MAX_ELEMENTOS2==MAX_ELEMENTOS){
                      // Se não tem mais espaço no vetor, caio fora
                    
                    if (qtdCadastrados == MAX_ELEMENTOS) {
                        System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                        voltarMenu(in);
                        continue;
                    }
                    else{
                        if (qtdCadastrados == MAX_ELEMENTOS2) {
                            System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                            voltarMenu(in);
                            continue;
                    }
                }
            }
                //Cadastre seu piloto aqui
               if(MAX_ELEMENTOS >= MAX_ELEMENTOS2){
                    for(int i = 0;i < pilotos.length; i++){
                        Piloto p1 = new Piloto();    

                        System.out.println("---------------------------------------\n");
                        System.out.println("Digite o nome do piloto: ");
                        p1.setNome(in.nextLine());
                        System.out.println("Digite o cpf do piloto: ");
                        p1.setCpf(in.nextLine());
                        System.out.println("Digite o breve do piloto: ");
                        p1.setBreve(in.nextLine());
                        System.out.println("Digite a matricula do piloto: ");
                        p1.setMatricula(in.nextLine());
                        System.out.println("---------------------------------------\n");    

                        pilotos[i] = p1;    

                        qtdCadastrados++;
                    
                    }
               }
                    
                else{
                    if( MAX_ELEMENTOS2 > MAX_ELEMENTOS ){
                        for(int i = MAX_ELEMENTOS ;i < pilotos.length; i++){
                            Piloto p1 = new Piloto();    
    
                            System.out.println("---------------------------------------\n");
                            System.out.println("Digite o nome do piloto: ");
                            p1.setNome(in.nextLine());
                            System.out.println("Digite o cpf do piloto: ");
                            p1.setCpf(in.nextLine());
                            System.out.println("Digite o breve do piloto: ");
                            p1.setBreve(in.nextLine());
                            System.out.println("Digite a matricula do piloto: ");
                            p1.setMatricula(in.nextLine());
                            System.out.println("---------------------------------------\n");    
    
                            pilotos[i] = p1;    
    
                            qtdCadastrados++;
                        }
                    }
                              
                    
                }      
                System.out.println("\nPiloto cadastrado com sucesso.");
                voltarMenu(in);
            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora

                if(qtdCadastrados > 0){

                    try{
                        for(int i = 0; i < pilotos.length ; i++){
                            
                            
                            System.out.println("---------------------------------------\n");
                            System.out.println("NOME DO PILOTO:" + pilotos[i].getNome());
                            System.out.println("CPF DO PILOTO:" + pilotos[i].getCpf());
                            System.out.println("BREVE DO PILOTO:" + ((Piloto) pilotos[i]).getBreve());
                            System.out.println("MATRICULA DO PILOTO:" + ((Piloto) pilotos[i]).getMatricula());
                            System.out.println("---------------------------------------");
                            
                            
                        }
                   }catch(NullPointerException exception){
                        System.out.println("Não há pilotos cadastrados para exibir.");
                        System.out.println("---------------------------------------");
                        
                }
            }    
        
                          
                                         
                else{
                    if (qtdCadastrados == 0) {
                        System.out.println("\nNão há pilotos cadastrados para exibir.");
                        voltarMenu(in);
                        continue;
                    }
            }
                // Exiba os pilotos aqui

                voltarMenu(in);  
           }else if (opcao == 3) {
                String proucura;
                
                System.out.print("digite o cpf:");
                proucura = in.nextLine();

                try{
                    for(int i = 0; i < pilotos.length ; i++){
                    
                        if(proucura.equals(pilotos[i].getCpf())){
                            
                            System.out.println("---------------------------------------");
                            System.out.println("NOME DO PILOTO:" + pilotos[i].getNome());
                            System.out.println("CPF DO PILOTO:" + pilotos[i].getCpf());
                            System.out.println("BREVE DO PILOTO:" + ((Piloto) pilotos[i]).getBreve());
                            System.out.println("MATRICULA DO PILOTO:" +  ((Piloto) pilotos[i]).getMatricula());
                            System.out.println("---------------------------------------"); 
                            //in.nextLine();
                            voltarMenu(in);                                   
                        }
                        else{                                          
                            System.out.println("Esse cpf não esta cadastrado!!!\n"); 
                            voltarMenu(in);
                            continue; 
                        }
                    }
                    }catch(NullPointerException exception){
                        System.out.println("Não há pilotos cadastrados para exibir.");
                        System.out.println("---------------------------------------");

                    }   

                
            }
            

            
             else if (opcao == 4) {
                
                System.out.println("Quanto de armazenamento você deseja?");
                variavelTec = in.nextInt();
            
                if(variavelTec > MAX_ELEMENTOS){
                    MAX_ELEMENTOS2 = variavelTec;

                    vetorAuciliar = new Pessoa[MAX_ELEMENTOS2];

                    for(int i = 0; i < pilotos.length; i++){
                        vetorAuciliar[i] = pilotos[i];
                    }
                    pilotos = new Pessoa[MAX_ELEMENTOS2];

                    for(int i=0; i < vetorAuciliar.length; i++){
                        pilotos[i] = vetorAuciliar[i];

                    }
                    System.out.println("O tamanho do armazenamento foi ampliado\n"); 
                    in.nextLine();
                    voltarMenu(in);
                }
                else{
                    System.out.println("Não é possível diminuir o tamanho de armazenamento!!\n");
                    in.nextLine();
                    voltarMenu(in);
                                       
                }
            }
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}