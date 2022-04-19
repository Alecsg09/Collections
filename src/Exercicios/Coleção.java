package Exercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Coleção {

    public static void main(String[] args) {

        //3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
        //trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
        //programa deverá atender as seguintes funcionalidades:
        //Armazenar dados da List
        //Remover dados da list;
        //Atualizar dados da list.
        //Apresentar todos os dados da list.



        ArrayList <String> listaDeProdutos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String produto1,produto2,produto3;

        System.out.println("Qual o primeiro produto ? ");
        produto1 = input.next();
        listaDeProdutos.add(produto1);

        System.out.println("Qual o segundo produto ? ");
        produto2 = input.next();
        listaDeProdutos.add(produto2);

        System.out.println("Qual o terceiro produto ? ");
        produto3 = input.next();
        listaDeProdutos.add(produto3);

        Collections.sort(listaDeProdutos);
        System.out.println("Essa é sua lista "+ listaDeProdutos);

        listaDeProdutos.remove(produto1);

        System.out.println(listaDeProdutos);




    }
}
