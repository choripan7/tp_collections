package ar.edu.tecnica;

/**
 * @author Melisa Evelyn Quinteros
 * 
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		ejemploList();
		ejemploSet();
		ejemploMap();
		ejemploQueue();
		ejemploDeque();

		ejemploSort();
		ejemploReverse();
		ejemploShuffle();
		ejemploSwap();
		ejemploFill();
		ejemploMin();
		ejemploMax();
	}

	 public static void ejemploList() {
	        // ArrayList
	        ArrayList<Integer> numeros = new ArrayList<Integer>();
	        numeros.add(3);
	        numeros.add(1);
	        numeros.add(2);
	        System.out.println("Contenido de ArrayList: " + numeros);
	    }

	 public static void ejemploSet() {
	        // HashSet
	        HashSet<Integer> numeros = new HashSet<Integer>();
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(2);
	        numeros.add(3);
	        System.out.println("Contenido de HashSet: " + numeros);
	    }

	public static void ejemploQueue() {
		// PriorityQueue
		PriorityQueue<Integer> numeros = new PriorityQueue<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(5);
		System.out.println("Contenido de PriorityQueue: " + numeros);
		// numeros.add(0);
	}

	public static void ejemploDeque() {
        // ArrayDeque
        ArrayDeque<Integer> numeros = new ArrayDeque<Integer>();
        numeros.add(1);
        numeros.addFirst(0);
        numeros.addLast(2);
        System.out.println("Contenido de ArrayDeque: " + numeros);
        //numeros.add(0);
    }
	
	public static void ejemploMap() {
        // HashMap
        HashMap<String, Integer> numeros = new HashMap<String, Integer>();
        numeros.put("Uno", 1);
        numeros.put("Dos", 2);
        System.out.println("Contenido de HashMap: " + numeros);
    }

	public static void loadSortedSet() {
		// TreeSet
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.add(3);
		numeros.add(1);
		numeros.add(2);
		System.out.println("Contenido de TreeSet: "+ numeros);
		// numeros.add(0);
	}

	public static void loadSortedMap() {
		// TreeMap
		TreeMap<String, Integer> numeros = new TreeMap<String, Integer>();
		numeros.put("C", 3);
		numeros.put("a", 1);
		numeros.put("b", 2);
		System.out.println("Contenido de TreeMap: "+ numeros);
		// numeros.put("X", 0);
	}

	public static void ejemploSort() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
        Collections.sort(numeros);
        System.out.println("ArrayList ordenado: " + numeros);
    }

	public static void ejemploReverse() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Collections.reverse(numeros);
        System.out.println("ArrayList invertido: " + numeros);
    }

	public static void ejemploShuffle() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Collections.shuffle(numeros);
        System.out.println("ArrayList mezclado: " + numeros);
    }

	public static void ejemploSwap() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		System.out.println("Antes del Swap: " + numeros);
		Collections.swap(numeros,0,1);
		System.out.println("Después del swap: " + numeros);
		// Collections.swap();
	}

	public static void ejemploFill() {
        ArrayList<Integer> numeros = new ArrayList<Integer>(Collections.nCopies(5, 0));
        System.out.println("Antes de llenar: " + numeros);
        Collections.fill(numeros, 7);
        System.out.println("Después de llenar: " + numeros);
    }

	public static void ejemploMin() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(33);
        numeros.add(22);
        var min = Collections.min(numeros);
        System.out.println("El mínimo es: " + min);
    }

	public static void ejemploMax() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(33);
        numeros.add(22);
        var max = Collections.max(numeros);
        System.out.println("El máximo es: " + max);
    }
}

