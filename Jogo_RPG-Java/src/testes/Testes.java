/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//cada desafio respondido corretamente: +2500 REAIS. Cada desafio respondido incorretamente -5000 REAIS.
//A cada 2 desafios respondido será descontado 2.000 REAIS equivalente aos seus 2 diretores.
package testes;

import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
//cada desafio respondido corretamente: +2500 REAIS. Cada desafio respondido incorretamente -5000 REAIS.
//A cada 2 desafios respondidos será descontado 3.000 REAIS equivalente aos seus 2 diretores.      

public class Testes {
static boolean escolha = true;
    static Scanner entrada = new Scanner(System.in); //Criando o Scanner para poder utilizar na classe inteira.
    static int dinheiro = 10000;
    static int salario = 3000;

    static int desafioCorreto = 2500;
    static int desafioErrado = 5000;

    public static char pergunta1() { // Função criada sem parâmetro, com um retorno. função da pergunta 1

        int contador1 = 0;
        System.out.println(" \n************ PRIMEIRO DESAFIO ************\n");
        System.out.println(("Quantia de dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        System.out.println("1- Considerando o nível de atuação na organização, os gestores de primeira linha situam-se no plano base da pirâmide organizacional. \nGeralmente são identificados como:");
        System.out.println("A - Supervisores - gerenciam apenas tarefas operacionais. ");
        System.out.println("B - Supervisores - gerenciam apenas trabalhadores operacionais."); // resposta correta
        System.out.println("C - Gerentes - gerenciam apenas outros gerentes de qualquer nível.");
        System.out.println("D - Gerentes - gerenciam outros gerentes de níveis mais baixos. ");
        char alternativa = entrada.next().charAt(0);
        do {

            switch (alternativa) {
                case 'a':
                case 'A':
                case 'c':
                case 'C':
                case 'd':
                case 'D':
                    System.out.println("Resposta incorreta!");
                    dinheiro = dinheiro - (desafioErrado);
                    break;
                case 'b':
                case 'B':
                    System.out.println("Resposta correta!");
                    dinheiro = dinheiro + (desafioCorreto);
                    break;
                default:
                    System.out.println("Você não digitou uma resposta válida. Responda novamente");

            }
            contador1++;

        } while (contador1 != 1);
        System.out.println(("Saldo dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        return (alternativa);

    }

    public static char pergunta2() { // Função criada sem parâmetro, com um retorno. função da pergunta 1

        int contador2 = 0;
        char alternativa;
        System.out.println(" \n************ SEGUNDO DESAFIO ************\n");
        System.out.println(("Quantia de dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        dinheiro = dinheiro - (salario);

        do {
            System.out.println("2 - Para um bom desempenho como gestor, o administrador  deve desenvolver habilidades necessárias para o trato organizacional e negocial.\n De  forma geral, as características básicas de um  bom administrador são, entre  outras");
            System.out.println("(aponte a alternativa incorreta):\n");
            System.out.println("a - Liderança.");
            System.out.println("b - Auto subjetividade.");
            System.out.println("c - Pensamento analítico.");
            System.out.println("d - Comportamento flexível.");
            System.out.println("e - Comunicação oral.");
            alternativa = entrada.next().charAt(0);

            switch (alternativa) {
                case 'a':
                case 'A':
                case 'c':
                case 'C':
                case 'd':
                case 'D':
                    System.out.println("Resposta incorreta!");
                    dinheiro = dinheiro - (desafioErrado);
                    break;
                case 'b':
                case 'B':
                    System.out.println("Resposta correta!");
                    dinheiro = dinheiro + (desafioCorreto);
                    break;
                default:
                    System.out.println("Você não digitou uma resposta válida. Responda novamente");

            }

            contador2++;

        } while (contador2 != 1);

        System.out.println(("Saldo dinheiro: Foi descontado o salario dos seus co-diretores: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        return (alternativa);
    }

    public static char pergunta3() { // Função criada sem parâmetro, com um retorno. função da pergunta 3
 
        int contador3 = 0;
        System.out.println(" \n************ TERCEIRO DESAFIO ************\n");
        System.out.println(("Quantia de dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        System.out.println("3- Referente às atitudes de Bruno, tomadas em questão do funcionário novo você pode:");
        System.out.println("a - Você acha que a aitude de Bruno é imperdoável. Sem explicar, você o demite.");
        System.out.println("b - Tomar as rédeas, conversar com o Bruno e dar uma nova oportunidade ao funcionário. \n"
                + "e também instruir Bruno de como se trata um funcionário."); // resposta correta
        char alternativa = entrada.next().charAt(0);

        do {

            switch (alternativa) {
                case 'a':
                case 'A':
                    
                    System.out.println("Com base na sua escolha, isso não é recomendável para uma empresa, \n pois atrapalha a harmonia gerencial"
                            + "quando você se tira um orgão autoritário. É sempre bom, manter o equilibrio e a situação em um ambiente de trabalho."
                            + "\n\n Você perdeu e sua empresa faliu.");
                    System.exit(0);
                    escolha = false;
                    break;
                case 'b':
                case 'B':
                   
escolha = true;
                    break;
                default:
                    System.out.println("Você não digitou uma resposta válida. Responda novamente");

            }
            contador3++;

        } while (contador3 != 1);
        System.out.println(("Saldo dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        return (alternativa);

    }

    public static char pergunta4() { // Função criada sem parâmetro, com um retorno. função da pergunta 4

        int contador4 = 0;
        char alternativa;
        System.out.println(" \n************ QUARTO DESAFIO ************\n");
        System.out.println(("Quantia de dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        dinheiro = dinheiro - (salario);
        do {
            System.out.println("4 - Referente a sua escolha, você percebe um talento novo com seu funcionário. \n Você pode atribuir"
                    + "as seguintes oportunidades para ele:");            
            System.out.println("a - Você pode elogiar sua paciência e ele receberá uma renovação de contrato\n"
                    + "para continuar trabalhor por 2 anos de estagiário.");
            System.out.println("b - Você oferece uma oportunidade para seu funcionário e ele é efetivado, trabalhando como assistente\n"
                    + "para Bruno e Ricardo.");
                        alternativa = entrada.next().charAt(0);

            switch (alternativa) {
                case 'a':
                case 'A':
                    escolha = false;
                    System.out.println("Sua empresa se manteve no ramo, sem lucros ou despesas no mercado. Você não conseguiu crescer.\n"
                            + "lembre-se é uma startup, não desperdice as suas oportunidades.");
                       System.out.println(("Quantia de dinheiro:(foi descontado o salário dos seus co-diretores): ") + NumberFormat.getCurrencyInstance().format(dinheiro));
                    System.exit(0);
                    break;
                case 'b':
                case 'B':
                    
         escolha=true;
                    
         break;
                default:
                    System.out.println("Você não digitou uma resposta válida. Responda novamente");

            }

            contador4++;

        } while (contador4 != 1);

        System.out.println(("Saldo dinheiro: Foi descontado o salario dos seus co-diretores: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        return (alternativa);
    }
    
    public static char pergunta5() { // Função criada sem parâmetro, com um retorno. função da pergunta 5
 
        int contador3 = 0;
        System.out.println(" \n************ QUINTO DESAFIO ************\n");
        System.out.println(("Quantia de dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        System.out.println("5 - Sua empresa deu certo.\n você alcançou seus objetios. Agora, suas vendas e serviços dão lucro. Sua empresa tem "
                + "\n bastantes funcionários. Mantendo um administração científica. Visando mais o ser humano e tratando bem as pessoas."
                +"\n\n Porém, você terá que tomar uma decisão final! ");
        System.out.println("a - Você decide manter-se no mercado atual, contratando mais e comprando imóveis com e montando filiais.");
        System.out.println("b - Você decide expandir seu comércio. Você revende seus produtos para o exterior. Vai demorar para crescer. Não tendo uma certeza.\n");
        
        char alternativa = entrada.next().charAt(0);

        do {

            switch (alternativa) {
                case 'a':
                case 'A':
                    System.out.println("Sua empresa se tornou nacional! Seu lucro expandiu. De 10 MIL REAIS, os 3 co-diretores se tornaram\n"
                            + "milionários e montaram seu próprio negócio!\n\n");
                                System.out.println("Fim de jogo."
                                        + "\nVocê obteve um dos melhores finais...");
                    System.exit(0);
                    
                    break;
                case 'b':
                case 'B':
                    System.out.println("Você passou por apertos, mas valeu a pena chegar até aqui... Sua empresa se tornou multinacional\n"
                            + "seus co-diretos se manteram na empresa. Você obtive sucesso na sua jornada!\n\nFim de jogo!"
                            + "Você obteve um dos melhores finais...");
System.exit(0);
                    
                    break;
                default:
                    System.out.println("Você não digitou uma resposta válida. Responda novamente");

            }
            contador3++;

        } while (contador3 != 1);
        System.out.println(("Saldo dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro));
        return (alternativa);

    }
    
    
    
    public static void main(String[] args) {

        System.out.println("**Bem-Vindo ! ESCOLHA UMA OPÇÃO \n 1 - Jogar \n 2 - Créditos \n 3 - Informações \n 4 - Sair");

        String nome, startup;

        char opcao = entrada.next().charAt(0);

        do {
            switch (opcao) {

                case '1':
//HISTÓRIA CASE 1 
                    // Modificar menu?
                    JOptionPane.showMessageDialog(null, "Bem vindo ao Mark 1, aperte 'OK' para continuar. ");
                    JOptionPane.showMessageDialog(null, "Após terminar seus estudos um(a) jovem decide mudar sua vida(adivinhe só, você é este jovem). Ele esta determinado(a) a se superar montando uma Start up.\nO personagem possui garra e empenho mas será que só isto basta no mercado de trabalho?");
                    JOptionPane.showMessageDialog(null, "Quais serão os desafios: O personagem se deparará com situações cotidianas como: funcionarios mal intencionados a falta de preparo para determinados cargos e a melhoria de comunicação. \n Começará com uma quantia de dinheiro, podendo falir e o jogo terminar.");
                    nome = JOptionPane.showInputDialog("Digite seu nome: ");
                    if ((nome != null) && (nome.length() > 0)) {

                        JOptionPane.showMessageDialog(null, nome + ", você acabou de se formar em Gestão de empresas, suas decisões teram total influência na sua carreira profissional.");
                        JOptionPane.showMessageDialog(null, "Suas decisões não teram volta a partir de agora!!");
                        JOptionPane.showMessageDialog(null, "****IMPORTANTE****");
                        JOptionPane.showMessageDialog(null, "O final do jogo sera determinado pelas sequencias que a pessoa seguir para determinar se esta frustrada , contente\n ou se chegará ao tão sonhado sucesso!");
                        JOptionPane.showMessageDialog(null, nome + ", você acaba de Iniciar uma Startup no ramo de Telecomunicações!");
                        JOptionPane.showMessageDialog(null, "Seus pais lhe deram uma oportunidade para investir na Startup. Então você começara com 10 MIL Reais. \nCuidado para não quebrar fácil. Caso aconteça, game-over.");
                        startup = JOptionPane.showInputDialog("Digite o nome da empresa: ");
                        JOptionPane.showMessageDialog(null, "Vá para o console, pois o jogo continua lá!\n"
                                + "                                   Boa sorte!");
                        if ((startup != null) && (startup.length() > 0)) { //Verifica a váriavel startup, para não passar como NULA. Sem resposta ou sem inserção de dados.

                            System.out.println( "Contrato social\nNome da empresa: " + startup + "\nDono da empresa: " + nome + "\n");
                            System.out.println(("Quantia de dinheiro: ") + NumberFormat.getCurrencyInstance().format(dinheiro)); //Pega a variavel dinheiro e formata para moeda REAL.

                            System.out.println(nome + ", sua empresa precisa de funcionários! \n Você terá que contratar essa equipe contratar:\n Uma boa equipe onde ja contém experiencia na área."
                                    + "(Ligam muito para salário e cargo na empresa)\nLembre-se você abriu a empresa agora.\n"
                                    + "Digite 1 para continuar! s");

                            String a1 = entrada.next();
                            switch (a1) {

                                case "1":
                                    System.out.println("\nVocê esta com 2 diretores Bruno e Ricardo.");
                                    System.out.println("O Bruno é mal-humorado. Seu comportamento ranzinza afasta as pessoas, prejudicando os relacionamentos, "
                                            + "que são tão necessários\n para a eficiência dos processos. Entretando, Bruno é exigente com o que é "
                                            + "necessário e cumpri prazos."
                                            + "rigorosamente. Bruno não ligará para algumas das suas decisões.");
                                    System.out.println("\nO Ricardo é um pessoa bastante autoritaria. Entretando é seu melhor funcionário. "
                                            + "Qualquer função estabelecida ele cumprirá se estiver de acordo. Ricardo é mais sensível, suas decisões"
                                            + "vão implicar bastante no seu trabalho.");

                                    System.out.println("\nA partir dessas definições você irá gerenciar tudo o que eles vão fazer.");
                                    System.out.println("Na primeira reunião com os funcionários, você vai decidir os cargos, lembre das caracteristicas deles.\n"
                                            + " 1 - Bruno será o Gerente de processos e o Ricardo será o Business controlle.\n"
                                            + " 2 - Ricardo será o Gerente de processos e o Bruno será o Business controlle.");
                                    String s1 = entrada.next();

                                    switch (s1) {

                                        case "1":
                                            System.out.println("Ricardo ficou frustrado, esperando ter um cargo melhor, mas, aceitou seu cargo inicialmente");
                                            System.out.println("Após um tempo, sua empresa esta crescendo aos poucos conseguindo se manter.\n"
                                                    + " você conquistou a oportunidade que grandes varejistas olhassem para a sua empresa e elas estavam pensando em contratar seus serviços técnicos.");
                                            System.out.println("Todos já sabiam que Ricardo teve grande influência para que grandes varejistas observassem\n para"
                                                    + " sua empresa");
                                            System.out.println(" Ricardo já estava querendo conversar com você então decidiu ir no seu escritório");
                                            System.out.println("Ricardo - " + nome + ", eu estava querendo falar com você há um tempo e achei melhor agora, me sinto mais\n"
                                                    + " preparado do que o Bruno para exercer a função que ele esta. Sei que estou bem, mas creio que posso "
                                                    + "fazer muito mais\n gostaria de fazer essa proposta para você, aceita?\n\n"
                                                    + " 1 - Não, ele esta muito bem no cargo dele e você também no seu, talvez mais para frente\n"
                                                    + " 2 - Sim, concordo com você, porém tome cuidado, é um cargo muito importante!");
                                            String s2 = entrada.next();

                                            switch (s2) {
                                                case "1":
                                                    System.out.println("Ricardo ficou muito frustrado, pois achava que iria concordar com ele, após esse encontro"
                                                            + " ele foi para casa\n"
                                                            + "pois estava muito cansado e de cabeça quente, por ultimo disse que amanhã vocês conversariam melhor");
                                                    System.out.println("Logo que você acordou, você pegou o celular e viu que um numero estranho te mandou um video do Ricardo\n"
                                                            + "bebado falando tudo da empresa, mal de você e do Bruno.\n\n");
                                                    System.out.println("Você chamou ele para conversar. Ricardo pediu desculpas. E você tomou a seguinte decisão: \n\n"
                                                            + " 1 - Você é muito importante para nós, mas seu erro foi imperdoável, está demitido!\n"
                                                            + " 2 - Entendo este seu erro, você estava frustado pela minha escolha dos cargos. Somos uma equipe\n"
                                                            + " então devemos apoiar uns aos outros. porém espero que isso não repita.");
                                                    String s3 = entrada.next();

                                                    switch (s3) {
                                                        case "1":
                                                            System.out.println("Ricardo não queria entender o que tinha acontecido, e disse que você deveria ter aceito "
                                                                    + "as desculpas que ele pediu. \n Ele parecia totalmente arrependido");
                                                            System.out.println("Após um tempo, a empresa vinha decaindo, pois não tinha o cara das negociações e os "
                                                                    + "outros varejistas estavam cancelando"
                                                                    + "\no contrato com vocês. Você não tem orçamento para arcar com este buraco.");
                                                            System.out.println("Infelizmente sua empresa faliu!\n\nPrincipalmente no começo de um start up, todos devem "
                                                                    + "continuar e cooperar com os outros\n"
                                                                    + "apesar do Ricardo ter feito algo errado, a cargo dele é muito importante para ser demitido "
                                                                    + "por um deslize.");
                                                            System.out.println("Fim de jogo!");
                                                            System.exit(0);
                                                            break;
                                                        case "2":
                                                            System.out.println("Ricardo - Peço perdão, pois eu estava fora de mim, vou fazer de tudo para parar de viralizar isso.");
                                                            System.out.println("Você - Novamente, não espero que isso se repita! Tenha um bom dia");
                                                            break;
                                                    }
                                                    if (s1.equals("2")) {
                                                        System.out.println("Você chamou Bruno para dar a noticia.");
                                                        System.out.println("Você - Bruno, eu estava verificando e o Ricardo esta colaborando muito com a empresa\n"
                                                                + "isso esta fazendo a empresa crescer muito, isso pesou muito para minha decisão e estou invertendo"
                                                                + " os cargos de vocês dois, ok?\n"
                                                                + "Bruno - Sei sim, esta fazendo um ótimo trabalho, já estava cogitando isso, mas acho ele meio imaturo "
                                                                + "para o peso desse cargo, mas\n"
                                                                + "já que essa decisão foi sua não tem problema, qualquer coisa me liga! Tenha um bom dia");
                                                        System.out.println("Já está evidente que Bruno não gostou da sua escolha. Mas ele lidará com isso.");
                                                        System.out.println("Bruno é treinado por Ricardo para realizar as negociações. E os negócios vão indo bem!");
                                                        System.out.println("Bom, parabéns! Sua empresa sobreviveu até o momento.");

                                                    }

                                            }

                                        case "2":
                                            System.out.println("Os dois aceitaram os cargos sem nenhum problema, vamos ao trabalho!");
                                            System.out.println("Após passado um tempo, Bruno não conseguia realizar negociações com qualquer empresa.\n"
                                                    + "e com isso não estava se dando tão bem com seu cargo, então foi até você assumir que não estava tão bem");
                                            System.out.println("Bruno - " + nome + ", Não estou conseguindo realizar as negociações e entregar as propostas, teria como me ajudar?\n"
                                                    + nome + " - Vê com o Ricardo, ele é bom com as negociações e também sabe persuadir, ele esta um pouco enrolado com o cargo exercido,\n"
                                                    + "talvez os dois se ajudem");
                                            System.out.println("Não foi uma boa escolha, mas eles dão um jeito. Ricardo e Bruno treinam juntos. \nEnquanto você lida com as idéias para futuras implementações.");
                                            System.out.println("\n\nAté o seguinte momento sua empresa se manteve. Porém, chegará o momento das suas funções. Esteja preparado.");
                                    }

                                    break;
                                default:

                                    System.out.println("Comando inválido!");
                            }

                        } //definição das chaves de verificação variavel nula
                        else {
                            System.exit(0); // Se nome for nulo(Chegar ou der enter, o programa encerra)
                        }

                    } //definição das chaves de verificação variavel nula
                    else {
                        System.exit(0);
                    }
                    pergunta1();
                    System.out.println(nome + ", cada desafio respondido corretamente: +2500 REAIS. Cada desafio respondido incorretamente -5000 REAIS.");

                    System.out.println("A cada 2 desafios respondido será descontado 3000 REAIS equivalente aos seus 2 diretores.");

                    System.out.println("\n Através de um dos seus diretores, uma empresa de pequeno porte, deseja investir nas suas idéias e terá direito à 3% do dinheiro total."
                            + "\n Se aceitar ganhará 5000 REAIS. ");
                    System.out.println("1 - Aceitar? 2 - Recusar? ");
                    String s4 = entrada.next();

                    switch (s4) {
                        case "1":
                            int desconto = dinheiro * (3 / 100);
                            System.out.println("Parabéns, você conseguiu um novo negócio!");
                            System.out.println("\n\n\n Hora de trabalhar! \n **** Você enfretará novos desafios: ");
                            dinheiro = dinheiro + 5000;
                            pergunta2();
                            dinheiro = dinheiro - desconto;
                            System.out.println("Saldo atual referente ao desconto: ");
                            System.out.println(NumberFormat.getCurrencyInstance().format(dinheiro));
                            break;

                    }
                    if (s4.equals("2")) {
                        System.out.println("Seus diretores estranharam sua decisão.");
                        System.out.println("\n Bruno - Por que você não assinou o contrato sem ao menos conversar com nós?");
                        System.out.println("\n Ricardo - Você sabe que esta não é apenas uma decisão sua. "
                                + "Nós 3 formamos a empresa no momento.");
                        System.out.println(nome + ", você acaba agindo pelo momento e responde os 2 da mesma forma."
                                + nome + "- Eu sou o dono da empresa. Quem toma as decisões sou eu. "
                                + "\nBruno e Ricardo sairam da sua sala com a cabeça abaixa, não tão contentes com a situação.");
                        System.out.println("S - Conversar e se desculpar com a equipe. N - Se manter no posto de autoritário, e seguir normalmente.");
                        String s5 = entrada.next();

                        if (s5.equals("N") || s5.equals("n")) {
                            System.out.println("Você seguiu autoritário. Você é o dono, não precisa ter remorso ou se preocupou com suas decisões."
                                    + "Porém, seus co-diretores não confiaram em você e você não confiará neles.");
                            System.out.println("Seus únicos funcionarios sairam na primeira oportunidade!\n");

                            System.out.println("Seus funcionários perderam a confiança em você. E você não tem mais recursos."
                                    + "\nBruno e Ricardo sairam da empresa após a 2 semana. Pois seria muito arriscado trabalhar para você."
                                    + "\n\n\n Fim de jogo. Lucro: " + NumberFormat.getCurrencyInstance().format(dinheiro));
                            System.exit(0);
                        }
                        if (s5.equals("S") || s5.equals("s")) {
                            System.out.println("Você se desculpa com seus co-diretores. E informa que não foi uma boa idéia. E isto, mudará daqui pra frente. "
                                    + "\n Parabéns. Você se mostrou um bom líder. Reconheceu seus erros e soube resolve-los.");
                            pergunta2();

                        }

                    }

                    System.out.println("Apartir de agora, os desafios entraram mais nas questões de negociações e contratos com seus co-diretores."
                            + "\n Não erre, além de ser descontado, influenciará a história e seu desfecho.");

                    System.out.println("Sua empresa contratou 2 novos funcionários. Mas você não terá muito contato com eles."
                            + "\nSeus co-diretores vão treina-los. "
                            + "Ao passar da semana, você percebe uma queda no seus serviços de Comunicações. Área na qual novos funcionários estão trabalhando."
                            + "Você anda e verifica o que possa estar acontecendo.\n"
                            + "Um dos funcionários teve uma meta estabelecida incoerente, além de ter sido mau treinado.\n"
                            + "Você conversa com o rapaz e ele te informa  que quem o estava acompanhando era Bruno.\n"
                            + "Você resolve tomar uma atitude e conversar com o Bruno, já conhecendo ele. Provavelmente Bruno agiu incorretamente\n com o funcionário"
                            + " \n\n ");
 if (dinheiro <= 0) {
                        System.out.println("Você perdeu o jogo!" + NumberFormat.getCurrencyInstance().format(dinheiro));
                    }
                    pergunta3();
if(escolha = true){
}
 if (dinheiro <= 0) {
                        System.out.println("Você perdeu o jogo!" + NumberFormat.getCurrencyInstance().format(dinheiro));
                    }                   
if(escolha=true){
                       pergunta4();
                   }
if(escolha=true){
    pergunta5();
}


                   
                   

                    break;
                case '2':
                    System.out.println("Desenvolvedores: \nPaulo José\nEmail: paulojosevieira2011@gmail.com\nRicardo Augusto\nEmail: ricardojpcn@gmail.com\n"
                            + "Luiz Fernado\nEmail: lfma020101@gmail.com");
                    break;
                case '4':
                    System.exit(0);
                    break;
                case '3':
                    System.out.println("Este jogo tem inteiramente e exclusivamente tratar sobre Empreendedorismo e Gestão Empresarial.\n"
                            + "Deixamos de lado qualquer outra coisa obsoleta, como o ramo da empresa. Como já foi definida no começo.\n"
                            + "O intuíto do jogo é apenas trazer desafios ao empreender. Começar um negócio do zero.\n\n"
                            + "     Divirta-se!");
                    break;
                default:
                    if (opcao != '4') {
                        System.out.println("Opção inválida!");

                    }
            }

        } while (opcao == '4');
    }

}
