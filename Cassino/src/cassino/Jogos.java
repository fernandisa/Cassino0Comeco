package cassino;

public class Jogos {
    
    int num;

    double golds;
    Jogos ()
            {
                this.num = 0;
             
                this.golds = 50.0;
            }
    
    public void ZerarNum ()
    {
        this.num = 0;
    }
    
 
    
    
    public int Dados (int num, double golds,Cadastro play)
    {
        int soma;
        int aleat;
        int aleat1;
        double mult;
        ZerarNum();
        if (play.getCash() >= golds)
        {
            play.Retirar(golds);
        do
        {
        aleat = (int) (Math.random() * 6 );
        }
        while(aleat == 0);
        
        do
        {
        aleat1 = (int) (Math.random() * 6 );
        } 
        while(aleat1 == 0);
        
        soma = aleat + aleat1;
        this.num = soma;
        
        if (soma == num)
            {
                mult = golds * 12;
                play.Adicionar(mult);
                return soma;
            }
                
        else if ( soma == (num - 1) || soma == (num + 1))
            {
                mult = golds * 5;
                play.Adicionar(mult);
                return soma;
                    }
                
                else
                    {
                        return soma;
                    }
        }
        
       return this.num;
    }
     public int Roleta1 (int num, double gold, Cadastro play)
    {
        
        int roleta;
        double mult1;
        ZerarNum();
         if (play.getCash() >= gold)
         {
             
             play.Retirar(gold);
             do{
             roleta = (int) (Math.random() * 36 );
             }while (roleta == 0);
             
             this.num = roleta;
             
             if (num == roleta)
             {
                 mult1 = gold;
                 play.Adicionar(mult1);
                 return roleta;
             
             }
        else
         {
             return this.num;
         }
         }
         
         return this.num;
    }
    
    public int Roleta2 (int op, int num1, double gold, Cadastro play)
    {
        int roleta2, roleta3, roleta4;
        double mult2, mult3, mult4;
        ZerarNum();
        if (play.getCash()>= gold)
       {
           play.Retirar(gold);
           if (op == 1)
           {
               do {
                    roleta2 = (int) (Math.random() * 12 );
           }while (roleta2 < 0);
               
                this.num = roleta2;
                
                    if (num1 == roleta2 )
                    {
                        mult2 = golds * 2; 
                        play.Adicionar(mult2);
                        return roleta2;
                    }
               
                return this.num;
          } 
                if (op == 2)
                {
                    do {
                    roleta3 = (int) (Math.random() * 24 );
                       }while (roleta3 < 12);
                    this.num = roleta3;
                    
                    if (num1 == roleta3)
                    {
                        mult3 = golds * 2; 
                        play.Adicionar(mult3);
                        return roleta3;
                    }
                    return this.num;
                
                }
                
                if (op == 3)
                {
                    do {
                        
                        roleta4 = (int) (Math.random() * 36 );
                       }while (roleta4 < 24);
                    this.num = roleta4;
                    if (num1 == roleta4)
                    {
                        mult4 = golds * 2; 
                        play.Adicionar(mult4);
                        return roleta4;
                    }
                    return this.num;
                }
    
     }
        else 
        {
            return this.num;
        }
        return this.num;
       }
    
    
    
 public int Roleta3 (int op3, int num3, double money3, Cadastro play)
            {
               int roleta6, roleta8;
               double mult6;
               ZerarNum();
             if (play.getCash() >= money3 )
             {
                 play.Retirar(money3);
              if (op3 == 1)
                    {
                        do {
                            roleta6 = (int) (Math.random() * 18 );
                       }while (roleta6 < 0);
                    if (num3 == roleta6)
                    {
                        mult6 = golds * 1; 
                        play.Adicionar(mult6);
                        this.num = roleta6;
                    }
                
                
                
                }
              if (op3 == 2)
               {
            
                do {
                        roleta8 = (int) (Math.random() * 36 );
                }while (roleta8 < 18);
                    
                    if (num3 == roleta8)
                    {
                        mult6 = golds * 1; 
                        play.Adicionar(mult6);
                        this.num = roleta8;
                        
                    }
               }
                    
                    
             
                }
            return this.num;
    
            }
    public int Roleta4 (int numip, double money4, Cadastro play)
    {
        int roleta7;
        double mult7;
        ZerarNum();
            if (play.getCash() >= money4)
            {
                play.Retirar(money4);
                do {
                        roleta7 = (int) (Math.random() * 100 );
                   }while (roleta7 < 0);
                
                if (roleta7 % 2 == numip)
                {
                    mult7 = golds * 1; 
                    play.Adicionar(mult7);
                    this.num = roleta7;
                    
                }
            }
           return this.num;
            }
        
 }
