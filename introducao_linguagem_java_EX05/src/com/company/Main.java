package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n======Cadastrar nome==================");
        System.out.println("Informe o nome para cadastrar o cliente:");
        String nome = teclado.nextLine();

        System.out.println("\n======Cadastrar CPF=====================");
        System.out.println("Informe o CPF para cadastrar o cliente");
        String cpf = teclado.nextLine();

        System.out.println("\n======Cadastrar @mail==================");
        System.out.println("informe o @mail para cadastrar o cliente");
        String email = teclado.nextLine();


        System.out.println("\n======Cadastrar telefone==============");
        System.out.println("informe o telefone para cadastrar o cliente");
        String telefone = teclado.nextLine();

        System.out.println("\n======Cadastrar endereço==============");
        System.out.println("informe o endereço para cadastrar o cliente");
        String endereco = teclado.nextLine();



        ValidaCliente validaCliente = new ValidaCliente();
        if (validaCliente.clienteValido(nome,cpf,email,telefone)){
            Cliente clienteNovo = new Cliente(nome,cpf,endereco,email,telefone);
            clientes.add(clienteNovo);
            System.out.println("Cliente cadastrado com sucesso");
        }
        else{
            System.out.println("Informe os dados novamente!!");
        }





    }
}
