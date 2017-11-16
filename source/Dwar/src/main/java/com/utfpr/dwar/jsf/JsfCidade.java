/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.dwar.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author alexandrelerario
 */
@ManagedBean
@RequestScoped
public class JsfCidade {

    /**
     * Creates a new instance of JsfCidade
     */
    private int idcidade;
    private String nome;
  
    
    public JsfCidade() {
        
    }
    
   
    public void persist(){
       com.utfpr.dwar.data.entity.Cidade cid = new com.utfpr.dwar.data.entity.Cidade();
       cid.setIdcidade(idcidade);
       cid.setNome(nome);
       new com.utfpr.dwar.data.crud.CrudCidade().persist(cid);
       this.idcidade=0;
       this.nome="";
    }
    
    public void remove(com.utfpr.dwar.data.entity.Cidade cidade){
        new com.utfpr.dwar.data.crud.CrudCidade().remove(cidade);
    }
    
    public java.util.Collection<com.utfpr.dwar.data.entity.Cidade> getAll(){
        return new com.utfpr.dwar.data.crud.CrudCidade().getAll();
    }

    public String update(com.utfpr.dwar.data.entity.Cidade cidade){
        this.idcidade = cidade.getIdcidade();
        this.nome = cidade.getNome();
        return "merge.xhtml";
    }
    
    public void merge(){
        com.utfpr.dwar.data.entity.Cidade teste;
        teste = new com.utfpr.dwar.data.crud.CrudCidade().find(this.idcidade);
        teste.setNome(this.nome);
        new com.utfpr.dwar.data.crud.CrudCidade().merge(teste);
        this.nome="";
        this.idcidade=0;  
    }
    
    
    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
