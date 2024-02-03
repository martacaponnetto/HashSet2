/*Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi*/

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = hashSetRiempito();
        LeggiStampaHashSet(hashSet);

    }
    public static HashSet<String> hashSetRiempito(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("element1");
        hashSet.add("element2");
        hashSet.add("elemnent3");
        return hashSet;

    }
    public static void LeggiStampaHashSet(HashSet<String>hashSet){
        System.out.println("stampa grandexxa :" + hashSet.size());
        System.out.println("stampa element");
        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

