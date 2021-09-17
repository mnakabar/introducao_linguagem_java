package com.company;

public class ValidaCliente {


    //Metodo validar nome
    public boolean clienteValido(String nome, String cpf,String email, String telefone) {

       if (!nomeValido(nome)){
           System.out.println("nome invalido");
           return false;
       }
        else if (!cpfValido(cpf)) {
            System.out.println("cpf invaido");
           return false;
        } else if (!emailValido(email)) {
            System.out.println("e-mail invalido");
           return false;
        }
        else if (!telefoneValido(telefone)){
            System.out.println("telefome invalido");
           return false;
        }
        return true;
    }

    private boolean nomeValido(String nome) {
        if (nome.length()>= 3 && nome.length()<= 50){
            return true;
        }
        return false;
    }
    private boolean cpfValido(String cpf) {

        if (cpf.length() == 11) {
            return true;
        }
        return false;
    }
    private boolean emailValido(String email) {
        if (email.contains("@")){
            return true;

        }
        return false;
    }
    private boolean telefoneValido(String telefone) {
        if (telefone.length() == 11){
            return true;
        }
        return false;
    }

}
