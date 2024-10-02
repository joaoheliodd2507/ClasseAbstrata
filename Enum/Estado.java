public class Estado {

private String nome;
private String sigla;

public Estado (String nome , String sigla) {
    this.nome = nome;
    this.sigla = sigla;
   }
public Estado (String nome) {
    this.nome = nome;
    this.sigla=nome;
   }
public String getnome (){
    return nome;
   }
public String setnome(String nome) {
    return this.nome = nome;
   }
public String getsigla (){
    return sigla;
   }
public void setsigla(String sigla) {
    this.sigla = sigla;
   }
   
}
    

