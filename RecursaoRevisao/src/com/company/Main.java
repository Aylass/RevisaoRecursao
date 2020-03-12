package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList lista = new ArrayList();
        lista.add(4);
        lista.add(2);
        lista.add(3);
        int n = 20129;

        System.out.println(nroDigit(n));
    }

    //exercicio 1
    public static int fatorial(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        return fatorial(n-1) * n;
    }

    //exercicio 2
    public static int somatorio(int n){
        if(n == 0) return 0;
        return somatorio(n-1) + n;
    }

    //exercicio 3
    public static int fibonacci(int n){
        if(n == 1) return 1;
        if(n == 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //exercicio 4
    public static int somatorio(int k,int j){
        if(k == j) return k;
        return k + somatorio(k+1,j);
    }

    //exercicio 5
    public static boolean palindrome(String s){
        if(s.length() == 0) return true;
        if(s.length() == 1) return true;
        if(s.charAt(0) == s.charAt(s.length()-1)) {
            System.out.println(s.substring(1, s.length()-1));
            return palindrome(s.substring(1, s.length()-1));
        }
        else return false;
    }

    //exercicio 6
    public static String convBase2(int n){
        if(n == 0) return "0";
        if(n == 1) return "1";
        return(convBase2(n / 2) + Integer.toString(n % 2));
    }

    //exercicio 7
    public static int somaArray(ArrayList<Integer> n){
        if(n.size() == 1) return n.get(0) ;
        return n.remove(n.size()-1) + somaArray(n);
    }

    //exercicio 8
    public static int findBiggest(ArrayList<Integer> ar){
        if(ar.size() == 1) return ar.get(0) ;
        int aux = ar.remove(ar.size()-1);
        if(aux > findBiggest(ar)) return aux;
        else return findBiggest(ar);
    }

    //exercicio 9
    public static boolean findSubStr(String str, String match){
        System.out.println(str);
        System.out.println(match);

        if(match.length() == 0) return true;
        if(str.length() == 0) return false;
        if(str.charAt(0) != match.charAt(0)) return findSubStr(str.substring(1,str.length()),match);
        else return findSubStr(str.substring(1,str.length()),match.substring(1,match.length()));
    }

    //exercicio 10
    public static int nroDigit(int n){
        if(n<=0) return 0;
        return nroDigit(n/10) + 1;
    }
}
