package cassino;

public class Cadastro {
        private String nome;
        private String login;
        private String senha;
        private double cash;
        private double gold;
        private boolean jogando;
        private String roupa;
        private String acessorio;
        private String sapato;
    
                
        
        Cadastro () 
        {
            this.nome = null;
            this.login = null;
            this.senha = null;
            this.cash = 0.0;
            this.gold = 0.0;
            this.jogando = false;
            this.roupa = null;
            this.acessorio = null;
            this.sapato = null;
        }
        
        public String getNome ()
        {
            return this.nome;
        }
        
        public String getLogin ()
        {
            return this.login;
        }
        
        public String getSenha ()
        {
            return this.senha;
        }
        
        public double getCash ()
        {
            return this.cash;
        }
        public double getGold ()
        {
            return this.gold;
        }
        
        public String getRoupa ()
        {
            return this.roupa;
        }
        
        public String getAcessorio ()
        {
            return this.acessorio;
        }
        
        public String getSapato ()
        {
            return this.sapato;
        }
        
        public void setGold (Double gold)
        {
            this.gold = gold;
        }
        
        public void setCash (Double cash)
        {
            this.cash = cash;
        }
        
        public void setNome (String nome)
        {
            this.nome = nome;
        }
        
        public void setLogin (String login)
        {
            this.login = login;
        }
        
        
        public void setSenha (String senha)
        {
            this.senha = senha;
        }
        
        
        
         boolean realizarCadastro (String nome1, String login1, String senha1, String confirm1 )
        {
            if (senha1.equals(confirm1))
            {
            nome = nome1;
            login = login1;
            senha = senha1;
            gold = 50.0;
            cash = 0.0;
            jogando = false;
            roupa = "Calça e camisa";
            acessorio = "Relógio de camelô";
            sapato = "Chinelo rider";
            
            return true; 
            }
            
            else 
            {
                return false;
            }
            
            
        }
        
        boolean entrar (String login2, String senha2) 
        {
            if (login2.equals(login) && senha2.equals(senha))
            {
                jogando = true;
                return true;
            }
            else
            {
                return false;
            }
        }

        boolean logado () 
        {
            return jogando;
        }

        boolean inserirCash (String cartao, Double reais)
        {
           if (jogando == true )
           {
               
               int length = cartao.length();
               if (length == 16 )
               {
                   if (reais <= 10)
                   {
                       cash = cash + reais;
                   }
                   else if (reais >= 11 && reais <= 50)
                   {
                       cash = cash + reais * 2;
                   }
                   else if (reais > 50)
                   {
                       cash = cash + reais * 3;
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
        
        boolean comprarRoupa (String op )
        {
            
           switch (op)
                {
                    case "1" :
                    {
                        if (cash >= 40) 
                        {
                            
                            cash = cash - 40;
                            roupa = roupa + " Terno";
                            
                            
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "2" :
                    {
                        if (cash >= 45)
                        {
                            cash = cash - 45;
                            roupa = roupa + " Smoking";
                            
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "3" :
                    {
                        if (cash >= 35)
                        {
                            cash = cash - 35;
                            roupa = roupa + " Vestido Rosa";
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "4" :
                    {
                        if (cash >= 55)
                        {
                            cash = cash - 55;
                            roupa = roupa + " Tubinho dourado";
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                
           }
           return false;
        }
        
        boolean comprarAcessorio (String op1)
        {
            switch (op1)
                {
                    case "1" :
                    {
                        if (cash >= 20) 
                        {
                            
                            cash = cash - 20;
                            acessorio = acessorio + " Pulseira";
                            
                            
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "2" :
                    {
                        if (cash >= 25)
                        {
                            cash = cash - 25;
                            acessorio = acessorio + " Tiara";
                            
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "3" :
                    {
                        if (cash >= 21)
                        {
                            cash = cash - 21;
                            acessorio = acessorio + " Brinco";
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "4" :
                    {
                        if (cash >= 32)
                        {
                            cash = cash - 32;
                            acessorio = acessorio + " Colar";
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                
           }
           return false;
        }
        
        boolean comprarSapato (String op3)
        {
            switch (op3)
                {
                    case "1" :
                    {
                        if (cash >= 60) 
                        {
                            
                            cash = cash - 60;
                            sapato = sapato + " Tênis";
                            
                            
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "2" :
                    {
                        if (cash >= 55)
                        {
                            cash = cash - 25;
                            sapato = sapato +  " Botas";
                            
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "3" :
                    {
                        if (cash >= 71)
                        {
                            cash = cash - 71;
                            sapato = sapato + " All Stars";
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                    case "4" :
                    {
                        if (cash >= 12)
                        {
                            cash = cash - 12;
                            sapato = sapato + " Crocs";
                        }
                        else 
                        {
                            return false;
                        }
                        break;
                    }
                
           }
           return false;
        }
        public void Adicionar(double dinheiro)
        {
            this.cash = this.cash + dinheiro;
        }
        public void Retirar (double dinheiro1)
        {
            this.cash = this.cash - dinheiro1;
        }
        
}