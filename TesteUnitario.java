class TesteUnitario{

public void executarAll() throws Exception{
  testNome();
  testIdade();
}

public void testNome(){

Atleta atleta = new Atleta();

atleta.setNome("ABCD");
if(atleta.getNome() != ("ABCD")){
  System.out.println("[erro] falha manipulando nome");


atleta.setNome("");
if(atleta.getNome().equals("")){
  System.out.println("[erro] falha manipulando nome");

  atleta.setNome("AAAAAAAAAA");
if(atleta.getNome().equals("AAAAAAAAAA")){
  System.out.println("[erro] falha manipulando nome");
}
}
}
}



public void testIdade() throws Exception{

Atleta atleta = new Atleta();
int idade;

idade = 10;
atleta.setIdade(10);
if(atleta.getIdade() != idade)
  //System.out.println("[erro] falha manipulando IDADE");
throw new Exception("[erro] falha manipulando IDADE valor" + idade);






atleta.setIdade(99999);

  if(atleta.getIdade() != 99999){
  System.out.println("[erro] falha manipulando IDADE");

atleta.setIdade(-9);

  if(atleta.getIdade() != -9){
  System.out.println("[erro] falha manipulando IDADE");


}
  }
}
}




