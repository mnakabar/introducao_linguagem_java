package com.company;

import java.util.ArrayList;
import java.util.List;

public class Agenda{
    private  List<Pessoa> listaPessoa;

    public Agenda( ) {
      this.listaPessoa = new ArrayList<>();
    }
    public void armazenarPessoas(Pessoa pessoa){
        listaPessoa.add(pessoa);

    }

    public void removePessoa(String nome){
        boolean removido = false;

        for(int i = 0; i < listaPessoa.size(); i++){
            var pessoa = listaPessoa.get(i);
            if(pessoa.getNome() == nome){
                listaPessoa.remove(pessoa);
                i = listaPessoa.size();
                removido = true;
            }
        }

        if(removido){
            System.out.println("Pessoa removida!");
        }
        else{
            System.out.println("Nome informado não existe");
        }
    }

    public int buscarPessoa(String nome){
       int posicao = -1;
       Pessoa pessoa = new  Pessoa();
        for(int i = 0; i < listaPessoa.size(); i++){
            pessoa = listaPessoa.get(i);
            if(pessoa.getNome().equals(nome)){

                posicao = i;
                return posicao;
            }
        }
       return 0;
    }
    //voidexibirTodaAgenda();

    public void exibirTodaAgenda (){

        for(int i = 0; i < listaPessoa.size(); i++){
            var pessoa = listaPessoa.get(i);
            System.out.println(pessoa.toString());
        }

    }

    public  void exibirPessoa(int index){
        if (index > (listaPessoa.size() -1) || index < 0){
            System.out.println("Pessoa não localizada");
            return;
        }
        var pessoa = listaPessoa.get(index);
        System.out.println(pessoa.toString());
    }

    public  void  listarPessoasEmOrdemAlfabéticaDeNome (){
        listaPessoa.sort((Pessoa p1, Pessoa p2) -> p1.getNome().compareTo(p2.getNome()));
        listaPessoa.forEach(pessoa -> System.out.println(pessoa.toString()));

    }

    public  void  listarPessoasEmOrdemAlfabéticaDeEndereco (){
        listaPessoa.sort((Pessoa p1, Pessoa p2) -> p1.getEndereco().compareTo(p2.getEndereco()));
        listaPessoa.forEach(pessoa -> System.out.println(pessoa.toString()));
    }

    public  void  listarPessoasEmOrdemAlfabéticaDeIdade () {
        listaPessoa.sort((Pessoa p1, Pessoa p2) -> p2.getIdade().compareTo(p1.getIdade()));
        listaPessoa.forEach(pessoa -> System.out.println(pessoa.toString()));

    }
}
