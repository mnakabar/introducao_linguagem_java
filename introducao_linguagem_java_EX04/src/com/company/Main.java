package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("./src/com/company/teste.txt");
        ManipulaArquivos util = new ManipulaArquivos(file);

        List<String> linhas = util.retornaRegistros();

        List<String> nomeList = new ArrayList<String>();

        if (linhas != null && linhas.size() > 0) {
            for (int i = 0; i < linhas.size(); i++) {
                String linha = linhas.get(i);

                if (linha.length() > 0) {
                    var nomesArray = linha.split("\\;");
                    nomeList.addAll(Arrays.asList(nomesArray));
                }
            }

        }

        Collections.sort(nomeList);

        for (int i = 0; i < nomeList.size(); i++) {
            System.out.println(nomeList.get(i));
        }
    }
}