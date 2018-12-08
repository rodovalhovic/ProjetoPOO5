/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Tiago
 */
public class Livro {
    long id;
    String nome;
    String sinopse;
    String autor;

    public Livro(long id, String nome, String sinopse, String autor) {
        this.id = id;
        this.nome = nome;
        this.sinopse = sinopse;
        this.autor = autor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    public static Livro getLivro(long id) throws Exception{
        
        String query = "SELECT * FROM livro WHERE id = ?";
        Object parameters[] = {id};
        
        ArrayList<Object[]> list = DatabaseConnector.getQuery(query, parameters);
        
        if(list.isEmpty()){
            return null;
        } else {
            Object row[] = list.get(0);
            Livro l = new Livro((long)row[0], 
                                (String)row[1], 
                                (String)row[2], 
                                (String)row[3]);
            return l;
        }
        
    }
}
