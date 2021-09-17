package com.company;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;

    public Cliente(String nome, String cpf, String endereco, String email,String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     public String getNome(){
        return nome;
     }
     public void setNome(String nome){
        this.nome = nome;
     }
     public String getCpf(String cpf){
        return cpf;
     }
     public void setCpf(){
        this.cpf = cpf;
     }
     public String getEndereco(String endereco){
        return endereco;
     }
     public void setEndereco(){
        this.endereco = endereco;
     }
     public String getEmail(String email){
        return email;
     }
     public void setEmail(){
        this.email = email;
     }
     public String getTelefone(String telefone){
        return  telefone;
     }
     public void setTelefone(){
        this.telefone = telefone;
     }

    @Override
    public String toString() {
        return  nome + " " + cpf +" " + endereco + " " + email + " " + telefone + " " + id;
    }


}
