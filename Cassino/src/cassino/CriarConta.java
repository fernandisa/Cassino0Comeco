package cassino;
import javax.swing.JOptionPane;
public class CriarConta {
    String nome;
    String senha;
    String login;
    Double gold;
    Double cash;
    Boolean jogando;
    String roupa;
    String acessorios;
    String sapatos;
    
    
    CriarConta (){
        this.nome = null;
        this.senha = null;
        this.login = null;
        this.gold = 0.0;
        this.cash = 0.0;
        this.jogando = false;
        this.roupa = null;
        this.acessorios = null;
        this.sapatos = null;
    }
    Boolean realizarCadastro (String nome,String senha, String login, String confirme)
    {
     if (this.senha.equals(senha))
     {
        this.nome = nome;
        this.senha = senha;
        this.login = login;
        gold = 50.0;
        cash = 0.0;
        jogando = false;
        roupa = "Calça e Camisa";
        acessorios = "Relógio do camelô ";
        sapatos = "Chinelo Rider";
        
        return true;
     }
     else 
     {
         return false;
     }
              
    }
    Boolean entrar (String senha, String login)
    {
       if (this.login.equals(login) && this.senha.equals(senha))
       {
           jogando = true;
           JOptionPane.showMessageDialog (null, "Seu login foi feito com sucesso!");
           return true;
       }
       else 
       {
           JOptionPane.showMessageDialog (null, "Não foi possível fazer o seu login!");
           return false;
       }
       
       }
    
    Boolean inserirCash (String num_cartao, Double valor )
    {
        if (jogando == true)
        {
           int cartao = num_cartao.length();
         
           if(cartao == 16)
         {
            if (valor <= 10)
            {
                cash = cash + valor;
            }
            else if (valor >= 11 && valor >= 50)
            {
                cash = cash + valor * 2;
            }
            else if (valor > 50)
            {
                cash = cash +valor *3;
            }
            else 
            {
                return false;
            }
            
             return true;
         }
           
         else 
         {
             return false;
         }
        
        }
        else 
        {
            return false;
        }
      
}
    Boolean comprarRoupa (String compra)
    {
        return false;
    }
}