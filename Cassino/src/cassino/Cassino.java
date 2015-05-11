
package cassino;
import javax.swing.JOptionPane;
public class Cassino {
    
    public static void main(String[] args) {
        
        Cadastro play = new Cadastro ();
        Jogos batatinha = new Jogos ();
        int opcao;
        String mostranome;
        do {
            if (play.logado())
            {
                mostranome = play.getNome();
            }
            else
            {
                mostranome = "";
            }
         opcao = Integer.parseInt(JOptionPane.showInputDialog("Cassino:\nBem vindo " + mostranome + "\n1. Realizar Cadastro\n2. Entrar\n3. Inserir cash\n4. Comprar roupa\n5.Comprar acessórios"
                   + "\n6.Comprar sapatos\n7. Mostrar cash\n8.Mostrar roupas em geral\n9. Sair\n10. Jogo de Dados\n11.Jogo da Roleta"));

       
           switch (opcao)
        {
            case 1 : 
            {
                String nome, login, senha, confirm; 
                
                nome = JOptionPane.showInputDialog("Digite seu nome: ");
                login = JOptionPane.showInputDialog("Digite seu login:");
                senha = JOptionPane.showInputDialog("Digite sua senha:");
                confirm = JOptionPane.showInputDialog("Digite novamente sua senha para confirmação:");
                play.realizarCadastro(nome, login, senha, confirm);
                break;
            }
            case 2 :
            {
                String login23, senha1;
                login23 = JOptionPane.showInputDialog("Digite seu login:");
                senha1 = JOptionPane.showInputDialog("Digite sua senha:");
                if (play.entrar(login23, senha1))
                {
                    JOptionPane.showMessageDialog(null,"Bem-vindo "+play.getNome()+". Você está logado!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Login ou senha invalidos! Tente novamente!");
                }
                break;
                
            }
            
            case 3 :
            {
                String cartao;
                Double dinheiro;
                cartao = JOptionPane.showInputDialog("Entre com o número de seu cartão de crédito - 16 caracteres:");
                dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                play.inserirCash(cartao, dinheiro);
                break;
            } 
            case 4 :
            {
                String op;
                JOptionPane.showMessageDialog(null,"Escolha o item que deseja comprar\n1.Terno\n2.Smoking\n3.Vestido Rosa\n4.Tubindo dourado\n");
                op = JOptionPane.showInputDialog("Entre com sua opção:");
                play.comprarRoupa(op);
                break;
           }
           
            case 5 :
            {
                String op2;
                JOptionPane.showMessageDialog(null,"Escolha o item que deseja comprar\n1.Pulseira\n2.Tiara\n3.Brinco Rosa\n4.Colar\n");
                op2 = JOptionPane.showInputDialog("Entre com sua opção:");
                play.comprarAcessorio(op2);
                break;
            }
            case 6 :
            {
                String op4;
                JOptionPane.showMessageDialog(null,"Escolha o item que deseja comprar\n1.Tênis\n2.Botas\n3.All Stars\n4.Crocs\n");
                op4 = JOptionPane.showInputDialog("Entre com sua opção:");
                play.comprarSapato(op4);
                break;
            }
            case 7 :
            {
                JOptionPane.showMessageDialog(null,"Seu cash é no total de:" + play.getCash());
                break;
            }
            case 8 :
            {
                JOptionPane.showMessageDialog(null,"Roupas:\n" + play.getRoupa() + "\nAcessórios:\n" + play.getAcessorio() + "Sapatos:\n" + play.getSapato());
                break;
            }
            case 9 :
            {
                JOptionPane.showMessageDialog(null,"Até mais. Volte sempre.");
                break;
            }
            case 10 :
            {
                int batata;
                double dinheiro1;
                batata = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 a 12:"));
                dinheiro1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com os golds que deseja apostar:"));
                batatinha.Dados(batata, dinheiro1,play);
                JOptionPane.showMessageDialog(null,"O NÚMERO SORTEADO FOI:" + batatinha.num);
                
               
                break;
            }
            case 11 :
            {
                int sl;
                JOptionPane.showMessageDialog(null,"1.\n0-36 Números Únicos – Você pode apostar em " +
                "um número e se ganhar receberá 35 para 1.\n" +
                "2.\nPode apostar em 1-12 / 13-24 / 25-36 com " +
                "pagamento de 2 para 1.\n" +
                "3.\nPode apostar em 1-18 ou 19-36 com " +
                "pagamento de 1 para 1.\n" +
                "4.\nPode apostar em par ou ímpar com" +
                "pagamento de 1 para 1.");
                
                sl = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua opção:"));
                
                switch (sl)
                {
                    case 1 :
                    {
                        int numm;
                        double moneyy;
                        numm = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que deseja apostar:"));
                        moneyy = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                        batatinha.Roleta1(numm, moneyy, play);
                        JOptionPane.showMessageDialog(null,"O NÚMERO SORTEADO FOI:" + batatinha.num);
                        
                        break;
                    }
                    case 2 : 
                    {
                        int num1, op1;
                        double money1;
                        op1 = Integer.parseInt(JOptionPane.showInputDialog("Você deseja apostar em:\n1.  1-12\n2. 13-24\n3. 25-36\n :"));
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que quer apostar:"));
                        money1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                        batatinha.Roleta2(op1, num1, money1, play);
                        JOptionPane.showMessageDialog(null,"O NÚMERO SORTEADO FOI:" + batatinha.num);
                        break;
                        
                    }
                    
                    case 3 :
                    {
                        int num2, op2;
                        double money2;
                        op2 = Integer.parseInt(JOptionPane.showInputDialog("Você deseja apostar em:\n1.  1-18\n2. 19-36\n:"));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que quer apostar:"));
                        money2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                        batatinha.Roleta3(op2, num2, money2, play);
                        JOptionPane.showMessageDialog(null,"O NÚMERO SORTEADO FOI:" + batatinha.num);
                        break;
                    }
                    
                    case 4 :
                    {
                        int num4;
                        double money4;
                        
                        num4 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que quer apostar:"));
                        money4 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                        batatinha.Roleta4(num4, money4, play);
                        JOptionPane.showMessageDialog(null,"O NÚMERO SORTEADO FOI:" + batatinha.num);
                        break;
                    }
                }
            break;
              }
            
            default :
            {
                JOptionPane.showMessageDialog(null,"Essa opção não existe.");
                break;
            }
           
           
           }
       }while(opcao != 9);
       }
}
