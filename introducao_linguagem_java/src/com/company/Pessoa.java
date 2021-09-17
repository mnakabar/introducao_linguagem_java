package com.company;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private Integer idade;
    private Double altura;

   public Pessoa(String nome, String endereco, String telefone,Integer idade, Double altura){
       this.nome = nome;
       this.endereco = endereco;
       this.telefone = telefone;
       this.idade = idade;
       this.altura = altura;
   }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco(){
       return endereco;
    }
    public void  setEndereco(String endereco){
       this.endereco = endereco;
    }
    public String getTelefone(){
       return  telefone;
    }
    public void setTelefone(String telefone){
       this.telefone = telefone;
    }
    public Integer getIdade(){
       return idade;
    }
    public void setIdade(Integer idade){
       this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public String toString () {
        return nome + " " + endereco + " " + telefone + " " + idade + " " + altura;
    }
}
