/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1119002 Albertus Angkuw
 * @author 1119006 William Juniar
 */
public class Nilai {
    //test
    private Mahasiswa mhs;
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int nUAS;
    private float na;
    private String hm;
    public Nilai(){}
    //Konstruktor
    public Nilai(int n1, int n2, int n3, int n4,int n5,int nUAS, float na,String hm){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.nUAS = nUAS;
        this.na = na;
        this.hm = hm;
      
    }
    //Getter
    public int getN1(){
        return n1; 
    }
    public int getN2(){
        return n2; 
    }
    public int getN3(){
        return n3; 
    }
    public int getN4(){
        return n4; 
    }
    public int getN5(){
        return n5; 
    }
    public int getnUAS(){
        return nUAS; 
    }
    public float getna(){
        return na; 
    }
    public String gethm(){
        return hm;
    }
    
     //Setter
    public void setN1(int data){
        n1 = data; 
    }
    public void setN2(int data){
        n2 = data; 
    }
    public void setN3(int data){
        n3 = data; 
    }
    public void setN4(int data){
        n4 = data; 
    }
    public void setN5(int data){
        n5 = data; 
    }
    public void setnUAS(int data){
        nUAS = data; 
    }
    public void setNA(float data){
        na = data; 
    }
    public void sethm(String data){
        hm = data; 
    }
    
    
    
    
    
}
