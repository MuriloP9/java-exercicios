package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class foreachList {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        // for (comum)
        for(int i=0; i< vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("--------------");
        // for each
        for (String obj: vect){
            System.out.println(obj);

        }
        System.out.println("--------------");

        // Listas - Parte 1
        // List x = new List();// Não posso instanciar dessa forma, pois é do tipo “interface”
        // Listas - Parte 2
        List<String> list = new ArrayList<>();// Não aceita tipos primitivos

        list.add("Maria");//Inserção de elementos
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");//Inserção entre posições

        System.out.println(list.size());//Ver tamanho da lista


        for (String x : list){
            System.out.println(x);
        }

        System.out.println("--------------");
        //list.remove(1);//Remoção da lista
        list.removeIf(x -> x.charAt(0) == 'M');//Remover algum elemento + condição (Filtrar)
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //Encontrar posição do elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //Encontrar posição do elemento (que não existe)
        System.out.println("----------");


        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());// Encontrar nomes apenas começados com 'A'
        for (String x : result){
            System.out.println(x);
        }


        System.out.println("----------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);// Encontrar o primeiro nome da lista que começe com 'A'
        System.out.println(name);
    }
}
